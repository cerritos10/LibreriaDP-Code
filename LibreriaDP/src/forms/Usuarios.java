/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import clases.Existencias;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Usuarios extends javax.swing.JFrame {
//conexionDB conn=new conexionDB();
//    Connection conn;
      
//     Statement stmt;
//    ResultSet rs;
   
     Connection conn ;//mantiene la conexion con la base de datos
    DefaultTableModel model;
    public Usuarios() {
        initComponents();
//    setBackground(new Color(0,0,0,0));
        
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(0,183,209));
        jTable1.getTableHeader().setForeground(new Color(79,85,137));
        jTable1.setRowHeight(25);
        
        
    // con este codigo se apunta a la base de datos
        try
        {
              Class.forName("org.postgresql.Driver") ;//carga en ram la clase del dirver de postgres, se agrgrega la ibreria
              conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/d_providencia", 
                      "postgres", "123") ;//cadena de conexion, explica como conectarse a la base de datos, primero la ruta:motor de base de datos:direccion:nombre
        }
        catch(Exception e) {}

//    static conexionDB cc = new conexionDB();
//    static Connection cn = cc.conex();
//        
        this.consultar();
        this.combobox();
    }
    
    
    //caragar los datos en la tabla
     private void consultar()
    {
        try
        {
          Statement stmt = conn.createStatement() ;
          String query = "select id_usuario, nombre_usuario,nombre_cargo,contraseña from usuario inner join cargo on\n" +
            "usuario.id_cargo =cargo.id_cargo ;" ;
          ResultSet rs = stmt.executeQuery(query) ;
          
          model = (DefaultTableModel) this.jTable1.getModel();
          model.setRowCount(0);
          Object Datos[]= new Object[4];//permite recorrer el arreglo y ver cuantos datos tengo
          
          while (rs.next())//permite recorrer el regristro uno a uno
           {
              for (int i=0;i<4;i++) Datos[i]=rs.getObject(i+1);
              model.addRow(Datos); // el for me los agrega a la tabla
           }
           this.jTable1.setModel(model); // me actualiza la tabla
          
        }
        catch(Exception e) 
        {
//            JOptionPane.showMessageDialog(null,"HA OCURRIDO UN ERROR: "+e.toString(),
//                "Error", JOptionPane.ERROR_MESSAGE);          
        }
    }
     
     
     
     //cargar datos en combobx
      private void combobox()
    {
        try
        {
          Statement stmt = conn.createStatement() ;
          String query = "select id_cargo from cargo ;" ;
          ResultSet rs = stmt.executeQuery(query) ;
          
//          model = (DefaultTableModel) this.jTable1.getModel();
//          model.setRowCount(0);
//          Object Datos[]= new Object[4];//permite recorrer el arreglo y ver cuantos datos tengo
           cmbTipo.addItem("Seleccione una opción");
          while (rs.next())//permite recorrer el regristro uno a uno
           {
//              for (int i=0;i<4;i++) Datos[i]=rs.getObject(i+1);
//              model.addRow(Datos); // el for me los agrega a la tabla

        cmbTipo.addItem(rs.getString("id_cargo"));
           }
         //  this.cmbTipo.setModel(model); // me actualiza la tabla
          
        }
        catch(Exception e) 
        {
//            JOptionPane.showMessageDialog(null,"HA OCURRIDO UN ERROR: "+e.toString(),
//                "Error", JOptionPane.ERROR_MESSAGE);          
        }
    }
      //consulta insertar datos
      private void guardar () {
   try
        {
            String query = " insert into usuario (nombre_usuario, id_cargo, contraseña)"
                           + " values (?, ?, ?)";//es una conculta, los simbolos permiten agregar informacion despues
      //aqui extraemos la informacion del form a la base de datos
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, this.txtusuario.getText().trim());
             pst.setInt(2, Integer.parseInt(this.cmbTipo.getSelectedItem().toString()));
            pst.setString(3, this.txtcontraseña.getText().trim());

           
            // execute the preparedstatement
            pst.execute();//permite ejecutar la instruccion de arriba 
            
            //limpiar controles visuales
            this.txtusuario.setText("");
//       este txt ya no lo voy a ocupar     this.txtcargo.setText("");
            this.txtcontraseña.setText("");
           
        }
        catch(Exception e) 
        {
             JOptionPane.showMessageDialog(null,"HA OCURRIDO UN ERROR: "+e.toString(),
                "Error", JOptionPane.ERROR_MESSAGE);  
        }
        // actualizar la tabla
}
      //consulta actualizar datos
      private void actualizar ()
      {
       int Indice= this.jTable1.getSelectedRow();
        if(Indice>-1)
        {
            try
            {
                String query = "UPDATE usuario SET nombre_usuario=?,id_cargo=?,contraseña=? "
                 + " WHERE id_usuario="+((DefaultTableModel)this.jTable1.getModel()).getValueAt(Indice,0).toString();
                           
      
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, this.txtusuario.getText().trim());
                pst.setInt(2, Integer.parseInt(this.cmbTipo.getSelectedItem().toString()));
                pst.setString(3, this.txtcontraseña.getText().trim());


                // execute the preparedstatement
                pst.execute();
            
                //limpiar controles visuales
                this.txtusuario.setText("");
                this.txtcontraseña.setText("");

                
                // actualizar la tabla
//                this.consultar();
                
            }
            catch(Exception e) 
            {
//                 JOptionPane.showMessageDialog(null,"HA OCURRIDO UN ERROR: "+e.toString(),
//                "Error", JOptionPane.ERROR_MESSAGE);  
            }
        }
        else JOptionPane.showMessageDialog(null,"Seleccione un registro.",
                "Acción", JOptionPane.WARNING_MESSAGE);   
      
      }
      //consulta eliminar datos
      private void eliminar (){
      
        int Indice= this.jTable1.getSelectedRow();
        if(Indice>-1)
        {
            try
            {
                String query = "DELETE from usuario "
                 + " WHERE id_usuario = "+((DefaultTableModel)this.jTable1.getModel()).getValueAt(Indice,0).toString();
                           
      
                PreparedStatement pst = conn.prepareStatement(query);
          

                // execute the preparedstatement
                pst.execute();
            
                //limpiar controles visuales
                this.txtusuario.setText("");
                this.txtcontraseña.setText("");
  
                // actualizar la tabla
//                this.consultar();
                
            }
            catch(Exception e) 
            {
//                 JOptionPane.showMessageDialog(null,"HA OCURRIDO UN ERROR: "+e.toString(),
//                "Error", JOptionPane.ERROR_MESSAGE);  
            }
        }
        else JOptionPane.showMessageDialog(null,"Seleccione un registro.",
                "Acción", JOptionPane.WARNING_MESSAGE);  
      }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnguardar = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btneditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtid = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btncancelar = new javax.swing.JButton();
        lblerror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 33, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("INGRESAR USUARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Tipo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        txtcontraseña.setBackground(new java.awt.Color(34, 33, 74));
        txtcontraseña.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtcontraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtcontraseña.setBorder(null);
        jPanel1.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 140, 30));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 140, -1));

        btnguardar.setBackground(new java.awt.Color(79, 85, 137));
        btnguardar.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(204, 204, 204));
        btnguardar.setText("GUARDAR");
        btnguardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        btnguardar.setContentAreaFilled(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 175, 40));

        txtusuario.setBackground(new java.awt.Color(34, 33, 74));
        txtusuario.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        txtusuario.setBorder(null);
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 140, 30));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 140, -1));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 140, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 140, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        btneditar.setBackground(new java.awt.Color(79, 85, 137));
        btneditar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btneditar.setForeground(new java.awt.Color(204, 204, 204));
        btneditar.setText("EDITAR");
        btneditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 39, 106), 3));
        btneditar.setContentAreaFilled(false);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jPanel1.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 175, 40));

        jTable1.setBackground(new java.awt.Color(45, 55, 99));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Usuario", "Cargo", "Contraseña"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 880, 130));

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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 200, 200));

        btneliminar.setBackground(new java.awt.Color(79, 85, 137));
        btneliminar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(204, 204, 204));
        btneliminar.setText("ELIMINAR");
        btneliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 197, 106), 3));
        btneliminar.setContentAreaFilled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 175, 40));

        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 190, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 140, -1));

        txtid.setEditable(false);
        txtid.setBackground(new java.awt.Color(34, 33, 74));
        txtid.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtid.setForeground(new java.awt.Color(204, 204, 204));
        txtid.setBorder(null);
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 140, 30));

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 140, -1));

        btncancelar.setBackground(new java.awt.Color(79, 85, 137));
        btncancelar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(204, 204, 204));
        btncancelar.setText("CANCELAR");
        btncancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 39, 106), 3));
        btncancelar.setContentAreaFilled(false);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 175, 40));

        lblerror.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(lblerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 380, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
         Existencias modSql=new Existencias(); 
          if (modSql.ExisteUser(txtusuario .getText())==0) {
            guardar();
        this.txtusuario.setText("");
        this.txtcontraseña.setText("");
//        this.txtPhone.setText("");
        consultar();
        } else {
            JOptionPane.showMessageDialog(this, "ya existe un usuario con estos datos");
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
         Existencias modSql=new Existencias(); 
          if (modSql.ExisteUser(txtusuario .getText())==0) {
            JOptionPane.showMessageDialog(this, "ya existe un usuario con estos datos");
        } else {
            
            actualizar();
        this.txtusuario.setText("");
        this.txtcontraseña.setText("");

        consultar();
        }
        
   
    }//GEN-LAST:event_btneditarActionPerformed
//al dar click en el campo mandar la informacion a los texbox correspondientes
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
         int Indice= this.jTable1.getSelectedRow();
          this.txtid.setText(((DefaultTableModel)this.jTable1.getModel()).getValueAt(Indice, 0).toString());
           this.txtusuario.setText(((DefaultTableModel)this.jTable1.getModel()).getValueAt(Indice, 1).toString());
         this.txtcontraseña.setText(((DefaultTableModel)this.jTable1.getModel()).getValueAt(Indice, 3).toString()); 
    }//GEN-LAST:event_jTable1MouseClicked
//limpiar los controles visuales
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
          this.txtid.setText("");
                this.txtusuario.setText("");
                this.txtcontraseña.setText("");
        
    }//GEN-LAST:event_btncancelarActionPerformed
//eliminar
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
        this.consultar();
        

    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        // TODO add your handling code here:
//          char c=evt.getKeyChar();
//            
//        
//          if(Character.isDigit(c)) {
//              getToolkit().beep();
//              
//              evt.consume();
//              
//              lblerror.setText("En este campo solo puedes introducir letras con espacios");
//              
//          }



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
            lblerror.setText("En este campo solo puedes introducir letras con espacios");
        }
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cmbTipo;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblerror;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
