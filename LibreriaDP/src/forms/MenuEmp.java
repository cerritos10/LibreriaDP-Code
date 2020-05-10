/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author cerritos
 */
public class MenuEmp extends javax.swing.JFrame implements Runnable {
String hora,minutos,segundos;
Thread hilo;
    /**
     * Creates new form MenuAdmin 
     */
    public MenuEmp() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        lblFecha.setText(fecha());
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
     
    }
public void hora(){
    Calendar calendario=new GregorianCalendar();
    Date horaactual= new Date();
    calendario.setTime(horaactual);
    hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
    minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
    segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
}
public void run(){
    Thread current = Thread.currentThread();
    while(current==hilo){
        hora();
        lblHora.setText(hora+":"+minutos+":"+segundos);
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

        lblnombre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblcargo = new javax.swing.JLabel();
        txtNav = new javax.swing.JButton();
        btnCal = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnRegistros = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 183, 209));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnombre.setBackground(new java.awt.Color(26, 25, 62));
        lblnombre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        lblnombre.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, -1, -1));
        lblnombre.add(lblcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 47, -1, -1));

        txtNav.setBackground(new java.awt.Color(26, 25, 62));
        txtNav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/internet.png"))); // NOI18N
        txtNav.setBorder(null);
        txtNav.setContentAreaFilled(false);
        txtNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNavActionPerformed(evt);
            }
        });
        lblnombre.add(txtNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        btnCal.setBackground(new java.awt.Color(26, 25, 62));
        btnCal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calculadora.png"))); // NOI18N
        btnCal.setBorder(null);
        btnCal.setContentAreaFilled(false);
        btnCal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });
        lblnombre.add(btnCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        btnProductos.setBackground(new java.awt.Color(79, 85, 137));
        btnProductos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(204, 204, 204));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productoslista.png"))); // NOI18N
        btnProductos.setText("    PRODUCTOS");
        btnProductos.setBorder(null);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        lblnombre.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, 40));

        btnRegistros.setBackground(new java.awt.Color(45, 58, 84));
        btnRegistros.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnRegistros.setForeground(new java.awt.Color(204, 204, 204));
        btnRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registros.png"))); // NOI18N
        btnRegistros.setText("    REGISTROS");
        btnRegistros.setBorder(null);
        btnRegistros.setContentAreaFilled(false);
        btnRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });
        lblnombre.add(btnRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 200, 40));

        btnFactura.setBackground(new java.awt.Color(79, 85, 137));
        btnFactura.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(204, 204, 204));
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fact.png"))); // NOI18N
        btnFactura.setText("     FACTURA");
        btnFactura.setBorder(null);
        btnFactura.setContentAreaFilled(false);
        btnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        lblnombre.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, 40));

        btnLogOut.setBackground(new java.awt.Color(79, 85, 137));
        btnLogOut.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(204, 204, 204));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrarsecion.png"))); // NOI18N
        btnLogOut.setText("     LOG OUT");
        btnLogOut.setBorder(null);
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        lblnombre.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 200, 40));

        jPanel1.setBackground(new java.awt.Color(90, 72, 148));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        lblnombre.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 10, 40));

        jPanel5.setBackground(new java.awt.Color(90, 72, 148));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        lblnombre.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        jPanel6.setBackground(new java.awt.Color(90, 72, 148));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        lblnombre.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        jPanel7.setBackground(new java.awt.Color(90, 72, 148));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        lblnombre.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, -1, -1));

        jButton3.setBackground(new java.awt.Color(34, 33, 74));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logomini.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        lblnombre.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 80));

        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 740));

        jPanel2.setBackground(new java.awt.Color(26, 25, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(45, 58, 84));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 50, 50));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Librería y Papeleria Divina Providencia");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(45, 58, 84));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1080, 70));

        jPanel3.setBackground(new java.awt.Color(34, 33, 74));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHora.setBackground(new java.awt.Color(255, 255, 255));
        lblHora.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("00:00:00");
        jPanel3.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        lblFecha.setBackground(new java.awt.Color(169, 80, 161));
        lblFecha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(169, 80, 161));
        lblFecha.setText("DD/MM/YYYY");
        jPanel3.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        jButton4.setBackground(new java.awt.Color(34, 33, 74));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 230, 140));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 1080, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.setState(ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNavActionPerformed
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop =java.awt.Desktop.getDesktop();
            
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                try{
                        java.net.URI uri= new java.net.URI("https://www.google.com/");
                        desktop.browse(uri);
                }catch(URISyntaxException | IOException ex){}
            }
        }
    }//GEN-LAST:event_txtNavActionPerformed

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
//        Runtime objrun=Runtime.getRuntime();
//        try{
//            objrun.exec("");
//        }catch(IOException ex){
//            JOptionPane.showMessageDialog(null,"El error es:"+ ex.getMessage().toString());
//        }
    }//GEN-LAST:event_btnCalActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
            Opcion_ProductoE pro= new Opcion_ProductoE();
        pro.setVisible(true);
        pro.setLocation(320,110);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
        IngresosEmp ingr= new IngresosEmp();
        ingr.setVisible(true);
        ingr.setLocation(320,110);
    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        Opcion_Factura of= new Opcion_Factura();
        of.setVisible(true);
        of.setLocation(320,110);
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        login1 log= new login1();
        this.dispose();
            log.setVisible(true);
       //cat.setLocation(320,110);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static String fecha(){
        Date fecha= new Date();
        SimpleDateFormat formatofecha= new SimpleDateFormat("EEEE ',' dd 'de' MMMM 'de' yyyy");
        return formatofecha.format(fecha);
                
    }
    
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
            java.util.logging.Logger.getLogger(MenuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegistros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblcargo;
    private javax.swing.JPanel lblnombre;
    private javax.swing.JButton txtNav;
    // End of variables declaration//GEN-END:variables
}
