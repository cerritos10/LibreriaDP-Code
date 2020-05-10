package forms;

import clases.ExistenciasCliente;
import clases.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erick
 */
public class Clientes extends javax.swing.JFrame {
    
    static conexion cc = new conexion();
    static Connection cn = cc.connx();
    DefaultComboBoxModel modelotipos;
    DefaultTableModel modelo = new DefaultTableModel();
    //Main del proyecto
    public Clientes() {
        initComponents();
        tableClientes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableClientes.getTableHeader().setOpaque(false);
        tableClientes.getTableHeader().setBackground(new Color(0, 183, 209));
        tableClientes.getTableHeader().setForeground(new Color(79, 85, 137));
        tableClientes.setForeground(Color.white);
        tableClientes.setRowHeight(25);
        this.consultar();
    }

    //Funciones del proyecto
    public void limpiar() {
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtTelefono.setText("");
    }

    //Consultar la base de datos
    private void consultar() {
        try {
            Statement stmt = cn.createStatement();
            String query = "select * from cliente ;";
            ResultSet rs = stmt.executeQuery(query);
            modelo = (DefaultTableModel) this.tableClientes.getModel();
            modelo.setRowCount(0);
            Object Datos[] = new Object[5];
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    Datos[i] = rs.getObject(i + 1);
                }
                modelo.addRow(Datos);
            }
            this.tableClientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR: " + e.toString(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Guardar un dato en la base de datos
    private void Guardar() {
        ExistenciasCliente modSql = new ExistenciasCliente();
        if (modSql.Existe(txtTelefono.getText()) == 0) {
            if (txtNombre.getText().isEmpty() | txtApellido.getText().isEmpty() | txtTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor: No dejar campos vacios");
            } else {
                try {
                    String query = " insert into cliente (nombre, apellido, telefono, sexo)"
                            + " values (?, ?, ?, ?)";
                    PreparedStatement pst = cn.prepareStatement(query);
                    pst.setString(1, this.txtNombre.getText().trim());
                    pst.setString(2, this.txtApellido.getText().trim());
                    pst.setString(3, this.txtTelefono.getText().trim());
                    String sexoString = (String) cmbSexo.getSelectedItem();
                    pst.setString(4, sexoString);
                    pst.execute();
                    this.limpiar();
                    this.consultar();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR: " + e.toString(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "El telefono ya existe");
        }
    }

    //Editar un dato en la base de datos
    private void Editar() {
        int Indice = this.tableClientes.getSelectedRow();
        int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro que desea actualizar la informacion", "Confirmar salida",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        ExistenciasCliente modSql = new ExistenciasCliente();
        if (modSql.Existe(txtTelefono.getText()) == 1||modSql.Existe(txtTelefono.getText()) == 0) {
            if (txtNombre.getText().isEmpty() | txtApellido.getText().isEmpty() | txtTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor: No dejar campos vacios");
            } else {
                if (Indice > -1) {
                    if (opcion == JOptionPane.OK_OPTION) {
                        try {
                            String query = "UPDATE cliente SET nombre=?,apellido=?, "
                                    + "telefono=?, sexo=?"
                                    + " WHERE id_cliente=" + ((DefaultTableModel) this.tableClientes.getModel()).getValueAt(Indice, 0).toString();
                            PreparedStatement pst = cn.prepareStatement(query);
                            pst.setString(1, this.txtNombre.getText().trim());
                            pst.setString(2, this.txtApellido.getText().trim());
                            pst.setString(3, this.txtTelefono.getText().trim());
                            String sexoString = (String) cmbSexo.getSelectedItem();
                            pst.setString(4, sexoString);
                            pst.execute();
                            this.limpiar();
                            this.consultar();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR: " + e.toString(),
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if (opcion == JOptionPane.NO_OPTION) {
                        this.limpiar();
                        this.consultar();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un registro.",
                            "Acción", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "El telefono ya existe");
        }
    }

    //Eliminar un dato en la base de datos
    private void Eliminar() {
        int Indice = this.tableClientes.getSelectedRow();
        int opcion = JOptionPane.showConfirmDialog(null, "Realmente desea eliminar este registro", "Confirmar salida",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (Indice > -1) {
            if (opcion == JOptionPane.OK_OPTION) {
                try {
                    String query = "delete from cliente"
                            + " WHERE id_cliente=" + (this.tableClientes.getModel()).getValueAt(Indice, 0).toString();
                    PreparedStatement pst = cn.prepareStatement(query);
                    pst.execute();
                    JOptionPane.showMessageDialog(this, "El registro ha sido eliminado con exito");
                    this.limpiar();
                    this.consultar();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR: " + e.toString(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (opcion == JOptionPane.NO_OPTION) {
                this.limpiar();
                this.consultar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtApellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        cmbSexo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 33, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("INGRESAR CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 190, -1));

        btnGuardar.setBackground(new java.awt.Color(79, 85, 137));
        btnGuardar.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 175, 40));

        txtNombre.setBackground(new java.awt.Color(34, 33, 74));
        txtNombre.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 190, 30));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 190, -1));

        txtApellido.setBackground(new java.awt.Color(34, 33, 74));
        txtApellido.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 190, 30));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 190, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        btnEditar.setBackground(new java.awt.Color(79, 85, 137));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(204, 204, 204));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 39, 106), 3));
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 175, 40));

        tableClientes.setBackground(new java.awt.Color(45, 55, 99));
        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Telefono", "Sexo"
            }
        ));
        tableClientes.setFocusable(false);
        tableClientes.setGridColor(new java.awt.Color(153, 153, 153));
        tableClientes.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableClientes.setRowHeight(25);
        tableClientes.setSelectionBackground(new java.awt.Color(47, 63, 128));
        tableClientes.setShowVerticalLines(false);
        tableClientes.getTableHeader().setReorderingAllowed(false);
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 880, 240));

        jButton1.setBackground(new java.awt.Color(45, 58, 84));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cliente-de-empresa-96.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 120));

        btnEliminar.setBackground(new java.awt.Color(79, 85, 137));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 197, 106), 3));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 175, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Teléfono:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(34, 33, 74));
        txtTelefono.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setBorder(null);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 140, 30));
        txtTelefono.getAccessibleContext().setAccessibleName("");

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 140, -1));

        cmbSexo.setBackground(new java.awt.Color(34, 33, 74));
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 140, 30));

        jButton3.setBackground(new java.awt.Color(34, 33, 74));
        jButton3.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("CANCELAR");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        jButton3.setContentAreaFilled(false);
        jButton3.setMaximumSize(new java.awt.Dimension(76, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(76, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 175, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Programacion de los botones del formulario
    //Boton Salir del formulario Cliente
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Boton Editar Cliente
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.Editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    //Evento que carga los datos de la tabla en textfield
    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        int Indice = this.tableClientes.getSelectedRow();
        this.txtNombre.setText(((DefaultTableModel) this.tableClientes.getModel()).getValueAt(Indice, 1).toString());
        this.txtApellido.setText(((DefaultTableModel) this.tableClientes.getModel()).getValueAt(Indice, 2).toString());
        this.txtTelefono.setText(((DefaultTableModel) this.tableClientes.getModel()).getValueAt(Indice, 3).toString());
    }//GEN-LAST:event_tableClientesMouseClicked

    //Boton Eliminar Cliente
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Boton Guardar Clientes
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.Guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Aqui van las validaciones en codigo Ascii
    //Tomados de la pagina: https://ascii.cl/es/codigos-html.htm
    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // Aqui es para limitar los valores que puede escribir en el jtextfield de telefono a que sean 8 valores
        //Esta funcion se encuentra en los eventos del txtTelefono en event con el nombre de KeyTyped
        if (txtTelefono.getText().length() >= 8) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Telefono");
        } else if ((int) evt.getKeyChar() >= 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Telefono");
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // Validar que solo escriba letras
        //Esta funcion se encuentra en los eventos del txtApellido en event con el nombre de KeyTyped
        char validarN = evt.getKeyChar();
        if (Character.isDigit(validarN)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo letras en el Nombre");
        } else if ((int) evt.getKeyChar() >= 33 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 208
                || (int) evt.getKeyChar() >= 210 && (int) evt.getKeyChar() <= 240
                || (int) evt.getKeyChar() >= 242 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se permiten caracteres especiales");
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // Validar que solo escriba letras
        //Esta funcion se encuentra en los eventos del txtNombre en event con el nombre de KeyTyped
        char validarN = evt.getKeyChar();
        if (Character.isDigit(validarN)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo letras en el Nombre");
        } else if ((int) evt.getKeyChar() >= 33 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 208
                || (int) evt.getKeyChar() >= 210 && (int) evt.getKeyChar() <= 240
                || (int) evt.getKeyChar() >= 242 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se permiten caracteres especiales");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
