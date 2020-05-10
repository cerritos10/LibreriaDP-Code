package form;

import clases.ExistenciasMarca;
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
public class Marca extends javax.swing.JFrame {
    
    static conexion cc = new conexion();
    static Connection cn = cc.connx();
    DefaultComboBoxModel modelotipos;
    DefaultTableModel modelo = new DefaultTableModel();
    //Main del proyecto
    public Marca() {
        initComponents();
        tableMarca.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableMarca.getTableHeader().setOpaque(false);
        tableMarca.getTableHeader().setBackground(new Color(0, 183, 209));
        tableMarca.getTableHeader().setForeground(new Color(79, 85, 137));
        tableMarca.setForeground(Color.white);
        tableMarca.setRowHeight(25);
        this.consultar();
    }

    //Funciones del proyecto
    public void limpiar() {
        this.txtMarca.setText("");
    }

    //Consultar la base de datos
    private void consultar() {
        try {
            Statement stmt = cn.createStatement();
            String query = "select * from marca ;";
            ResultSet rs = stmt.executeQuery(query);
            modelo = (DefaultTableModel) this.tableMarca.getModel();
            modelo.setRowCount(0);
            Object Datos[] = new Object[2];
            while (rs.next()) {
                for (int i = 0; i < 2; i++) {
                    Datos[i] = rs.getObject(i + 1);
                }
                modelo.addRow(Datos);
            }
            this.tableMarca.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR: " + e.toString(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Guardar un dato en la base de datos
    private void Guardar() {
        ExistenciasMarca modSql = new ExistenciasMarca();
        if (modSql.Existe(txtMarca.getText()) == 0) {
            if (txtMarca.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor: No dejar el campo vacio");
            } else {
                try {
                    String query = " insert into marca (nombre_marca)"
                            + " values (?)";
                    PreparedStatement pst = cn.prepareStatement(query);
                    pst.setString(1, this.txtMarca.getText().trim());
                    pst.execute();
                    this.limpiar();
                    this.consultar();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR: " + e.toString(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La marca ya existe");
        }
    }

    //Editar un dato en la base de datos
    private void Editar() {
        int Indice = this.tableMarca.getSelectedRow();
        ExistenciasMarca modSql = new ExistenciasMarca();
        if (modSql.Existe(txtMarca.getText()) == 0) {
            if (txtMarca.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor: Seleccione una marca para editarla");
            } else {
                if (Indice > -1) {
                    int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro que desea actualizar la informacion", "Confirmar salida",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (opcion == JOptionPane.OK_OPTION) {
                        try {
                            String query = "UPDATE marca SET nombre_marca=?"
                                    + " WHERE id_marca=" + ((DefaultTableModel) this.tableMarca.getModel()).getValueAt(Indice, 0).toString();
                            PreparedStatement pst = cn.prepareStatement(query);
                            pst.setString(1, this.txtMarca.getText().trim());
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
            JOptionPane.showMessageDialog(this, "La marca ya existe");
        }
    }

    //Eliminar un dato en la base de datos
    private void Eliminar() {
        int Indice = this.tableMarca.getSelectedRow();
        if (Indice > -1) {
            int opcion = JOptionPane.showConfirmDialog(null, "Realmente desea eliminar este registro", "Confirmar salida",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcion == JOptionPane.OK_OPTION) {
                try {
                    String query = "delete from marca"
                            + " WHERE id_marca=" + (this.tableMarca.getModel()).getValueAt(Indice, 0).toString();
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
        btnGuardar = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMarca = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 33, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("REGISTRAR MARCA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 175, 40));

        txtMarca.setBackground(new java.awt.Color(34, 33, 74));
        txtMarca.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(204, 204, 204));
        txtMarca.setBorder(null);
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 190, 30));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 190, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Marca:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

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
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 175, 40));

        tableMarca.setBackground(new java.awt.Color(45, 55, 99));
        tableMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nombre de la Marca"
            }
        ));
        tableMarca.setFocusable(false);
        tableMarca.setGridColor(new java.awt.Color(153, 153, 153));
        tableMarca.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableMarca.setRowHeight(25);
        tableMarca.setSelectionBackground(new java.awt.Color(47, 63, 128));
        tableMarca.setShowVerticalLines(false);
        tableMarca.getTableHeader().setReorderingAllowed(false);
        tableMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMarcaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMarca);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 880, 240));

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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marca.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 120, 120));

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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 175, 40));

        txtCancelar.setBackground(new java.awt.Color(34, 33, 74));
        txtCancelar.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        txtCancelar.setForeground(new java.awt.Color(204, 204, 204));
        txtCancelar.setText("CANCELAR");
        txtCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        txtCancelar.setContentAreaFilled(false);
        txtCancelar.setMaximumSize(new java.awt.Dimension(76, 25));
        txtCancelar.setMinimumSize(new java.awt.Dimension(76, 25));
        txtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(txtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 175, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Editar Cliente
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.Editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    //Evento que carga los datos de la tabla en textfield
    private void tableMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMarcaMouseClicked
        int Indice = this.tableMarca.getSelectedRow();
        this.txtMarca.setText(((DefaultTableModel) this.tableMarca.getModel()).getValueAt(Indice, 1).toString());
    }//GEN-LAST:event_tableMarcaMouseClicked

    //Boton Eliminar Cliente
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Boton Guardar Clientes
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.Guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
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
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_txtCancelarActionPerformed

    //Programacion de los botones del formulario
    //Boton Salir del formulario Cliente
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tableMarca;
    private javax.swing.JButton txtCancelar;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
