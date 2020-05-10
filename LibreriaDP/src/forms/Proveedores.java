
package forms;

import clases.Existencias;
import clases.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cerritos
 */
public class Proveedores extends javax.swing.JFrame {
    conexion conn=new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;  
    

    public Proveedores() {
        initComponents();
//    setBackground(new Color(0,0,0,0));
        
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(0,183,209));
        jTable1.getTableHeader().setForeground(new Color(79,85,137));
        jTable1.setRowHeight(25);
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtCancel = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtDireccion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnSave1 = new javax.swing.JButton();
        txtBucar = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 33, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("INGRESAR PROVEEDORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Direccion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        txtPhone.setBackground(new java.awt.Color(34, 33, 74));
        txtPhone.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(204, 204, 204));
        txtPhone.setBorder(null);
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 140, 30));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 140, -1));

        txtCancel.setBackground(new java.awt.Color(79, 85, 137));
        txtCancel.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        txtCancel.setForeground(new java.awt.Color(204, 204, 204));
        txtCancel.setText("CANCELAR");
        txtCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        txtCancel.setContentAreaFilled(false);
        txtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelActionPerformed(evt);
            }
        });
        jPanel1.add(txtCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 175, 40));

        txtNombre.setBackground(new java.awt.Color(34, 33, 74));
        txtNombre.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 140, 30));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 140, -1));

        txtDireccion.setBackground(new java.awt.Color(34, 33, 74));
        txtDireccion.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(204, 204, 204));
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 140, 30));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 140, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 140, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Teléfono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        btnEdit.setBackground(new java.awt.Color(79, 85, 137));
        btnEdit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(204, 204, 204));
        btnEdit.setText("EDITAR");
        btnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 39, 106), 3));
        btnEdit.setContentAreaFilled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 175, 40));

        jTable1.setBackground(new java.awt.Color(45, 55, 99));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Direccion", "Telefono"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(47, 63, 128));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 880, 130));

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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proveedores.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 120));

        btnDelete.setBackground(new java.awt.Color(79, 85, 137));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(204, 204, 204));
        btnDelete.setText("ELIMINAR");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 197, 106), 3));
        btnDelete.setContentAreaFilled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 175, 40));

        txtId.setBackground(new java.awt.Color(34, 33, 74));
        txtId.setForeground(new java.awt.Color(34, 33, 74));
        txtId.setBorder(null);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 10, -1));

        btnSave1.setBackground(new java.awt.Color(79, 85, 137));
        btnSave1.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        btnSave1.setForeground(new java.awt.Color(204, 204, 204));
        btnSave1.setText("GUARDAR");
        btnSave1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        btnSave1.setContentAreaFilled(false);
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 175, 40));

        txtBucar.setBackground(new java.awt.Color(34, 33, 74));
        txtBucar.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtBucar.setForeground(new java.awt.Color(204, 204, 204));
        txtBucar.setBorder(null);
        txtBucar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBucarKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBucarKeyPressed(evt);
            }
        });
        jPanel1.add(txtBucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 140, 30));

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 140, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Buscar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelActionPerformed
            Cancelar();
            this.txtBucar.setText("");
            
    }//GEN-LAST:event_txtCancelActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            int  fila=jTable1.getSelectedRow();
            if (fila==-1) {
                          JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para editar");
        }else{
                id= Integer.parseInt((String)jTable1.getValueAt(fila,0).toString());
                String nombre=(String)jTable1.getValueAt(fila,1);
                String direccion=(String)jTable1.getValueAt(fila,2);
                String telefono=(String)jTable1.getValueAt(fila,3);
                txtId.setText(""+id);
                txtNombre.setText(nombre);
                txtDireccion.setText(direccion);
                txtPhone.setText(telefono);
            }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Existencias modSql=new Existencias(); 
         String name=txtNombre.getText();
     String address=txtDireccion.getText();
     String cel=txtPhone.getText();
         if (name.equals("")||address.equals("")||cel.equals("")) {
         JOptionPane.showMessageDialog(this, "Por Favor: Ingrese los campos");
         }
         if (modSql.Existe(txtPhone .getText())==0) {
        
        JOptionPane.showMessageDialog(this, "El telefono ya existe");
        }
        else{
        
        Modificar();
        listar();
        this.txtBucar.setText("");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        String name=txtNombre.getText();
     String address=txtDireccion.getText();
     String cel=txtPhone.getText();
         if (name.equals("")||address.equals("")||cel.equals("")) {
         JOptionPane.showMessageDialog(this, "Por Favor: Ingrese los campos");
         }
         else {Eliminar();
        this.txtBucar.setText("");
        listar();}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        Existencias modSql=new Existencias(); 

     String name=txtNombre.getText();
     String address=txtDireccion.getText();
     String cel=txtPhone.getText();
         if (name.equals("")||address.equals("")||cel.equals("")) {
         JOptionPane.showMessageDialog(this, "Por Favor: Ingrese los campos");
         }
         else if (modSql.Existe(txtPhone .getText())==0) {
            Agregar();
        this.txtNombre.setText("");
        this.txtDireccion.setText("");
        this.txtPhone.setText("");
        this.txtBucar.setText("");
        listar();
        } else {
            JOptionPane.showMessageDialog(this, "El telefono ya existe");
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
                // Validar que solo escriba letras
        //Esta funcion se encuentra en los eventos del txtNombre en event con el nombre de KeyTyped
        char validarN = evt.getKeyChar();
        if (Character.isDigit(validarN)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo letras en el Nombre");
        } else if ((int) evt.getKeyChar() >= 33 && (int) evt.getKeyChar() <= 64 ||
                (int) evt.getKeyChar()>=91 && (int) evt.getKeyChar()<=96 ||
                (int) evt.getKeyChar()>=123 && (int) evt.getKeyChar()<=208 ||
                (int) evt.getKeyChar()>=210 && (int) evt.getKeyChar()<=240 ||
                (int) evt.getKeyChar()>=242 && (int) evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se permiten caracteres especiales");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
                // Aqui es para limitar los valores que puede escribir en el jtextfield de telefono a que sean 8 valores
        //Esta funcion se encuentra en los eventos del txtTelefono en event con el nombre de KeyTyped
        if (txtPhone.getText().length() >= 8) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Telefono");
        } else if ((int) evt.getKeyChar() >= 32 && (int) evt.getKeyChar() <= 47  ||
                (int) evt.getKeyChar()>=58 && (int) evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Telefono");
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtBucarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBucarKeyTyped

    private void txtBucarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucarKeyPressed
        String[] titulos = {"Id", "Nombre", "Direccion", "Telefono"};
        String[] registros = new String[50];

        String sql = "SELECT *FROM proveedor WHERE nombre_proveedor LIKE '%" + txtBucar.getText() + "%' "
        + "OR direccion_proveedor LIKE '%" + txtBucar.getText() + "%'"
        + "OR telefono LIKE '%" + txtBucar.getText() + "%'"
        ;
        modelo = new DefaultTableModel(null, titulos);
        conexion cc = new conexion();
        Connection conect = cc.connx();
        try {
            Statement st = (Statement) conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("id_proveedor");
                registros[1] = rs.getString("nombre_proveedor");
                registros[2] = rs.getString("direccion_proveedor");
                registros[3] = rs.getString("telefono");

                modelo.addRow(registros);
            }
            jTable1.setModel(modelo);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_txtBucarKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }
     public void listar(){
         String sql="select * from proveedor";
    try{
        cn=conn.connx();
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        Object[]proveedor=new Object[4];
        modelo=(DefaultTableModel)jTable1.getModel();
        while(rs.next()){
        proveedor[0]=rs.getInt("id_proveedor");
        proveedor[1]=rs.getString("nombre_proveedor");
        proveedor[2]=rs.getString("direccion_proveedor");
        proveedor[3]=rs.getString("telefono");
        modelo.addRow(proveedor);
        
        }
        jTable1.setModel(modelo);
        
    }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
     public void Agregar(){
     String name=txtNombre.getText();
     String address=txtDireccion.getText();
     String cel=txtPhone.getText();
         if (name.equals("")||address.equals("")||cel.equals("")) {
             JOptionPane.showMessageDialog(null,"Debe ingresar los capmpos que estan vacios");
         }else {
                String sql="insert into proveedor (nombre_proveedor,direccion_proveedor,telefono) values ('"+name+"','"+address+"','"+cel+"')";
                try{
                        cn=conn.connx();
                        st=cn.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "El proveedoor ha sido ingresado con exito");
                        LimpiarTable();
                }catch(Exception e){
                 //JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
                }
         }
     }
     public void LimpiarTable(){
         for (int i = 0; i <= jTable1.getRowCount(); i++) {
             modelo.removeRow(i);
             i=i-1;
         }
     }
     public void Modificar(){
         String nombre=txtNombre.getText();
         String direccion=txtDireccion.getText();
         String telefono=txtPhone.getText();
         String sql="update proveedor set nombre_proveedor='"+nombre+"',direccion_proveedor='"+direccion+"',telefono='"+telefono+"' where id_proveedor="+id;
         if (nombre.equals("")||direccion.equals("")||telefono.equals("")) {
             JOptionPane.showMessageDialog(null, "No deben haber campos vacios");
         }else{
             try{
                 cn=conn.connx();
                 st=cn.createStatement();
                 st.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null, "El proveedoor ha sido actualizado");
                 LimpiarTable();
             }catch(Exception e){}
         }
     }
     public void Eliminar(){
         int filaS=jTable1.getSelectedRow();
         if (filaS==-1) {
                 JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para eliminar");
         }else{
             String sql="delete from proveedor where id_proveedor="+id;
             try{
                 cn=conn.connx();
                 st=cn.createStatement();
                 st.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null, "El proveedoor ha sido eliminado");
                 LimpiarTable();
             }catch(Exception e){}
         }
     }
     public void Cancelar(){
         this.txtNombre.setText("");
         this.txtPhone.setText("");
         this.txtDireccion.setText("");
         
     }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBucar;
    private javax.swing.JButton txtCancel;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
