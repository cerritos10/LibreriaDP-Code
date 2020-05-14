package vista;

import controlador.CtrVistaPrincipal;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
/**
 *
 * @author Atato
 */
public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        
        initComponents();        

        //Centrar Ventana
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Respaldo y Restauración");

        //Instancio Controlador
        CtrVistaPrincipal c = new CtrVistaPrincipal(this);

        //Agrego escuchadores
        btnRutaSource.addActionListener(c);
        btnDerecha.addActionListener(c);
        btnIzquierda.addActionListener(c);
        btnRespaldar.addActionListener(c);
        btnRestaurar.addActionListener(c);

        radioParcial.addActionListener(c);
        radioTotal.addActionListener(c);

        radioSql.addActionListener(c);
        radioBackup.addActionListener(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoRespaldo = new javax.swing.ButtonGroup();
        formatoSalida = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoRespaldar = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listadoTablas = new javax.swing.JList();
        btnDerecha = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        radioTotal = new javax.swing.JRadioButton();
        radioParcial = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        labelSource = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radioSql = new javax.swing.JRadioButton();
        radioBackup = new javax.swing.JRadioButton();
        btnRutaSource = new javax.swing.JButton();
        labelSO = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRespaldar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(34, 33, 74));
        jPanel3.setToolTipText("");
        jPanel3.setPreferredSize(new java.awt.Dimension(1080, 670));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 33, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listadoRespaldar.setBackground(new java.awt.Color(47, 63, 128));
        listadoRespaldar.setForeground(new java.awt.Color(255, 255, 255));
        listadoRespaldar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(listadoRespaldar);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 32, 270, 356));

        listadoTablas.setBackground(new java.awt.Color(47, 63, 128));
        listadoTablas.setForeground(new java.awt.Color(255, 255, 255));
        listadoTablas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(listadoTablas);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 32, 270, 356));

        btnDerecha.setText(">");
        btnDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 155, 46, 29));

        btnIzquierda.setText("<");
        btnIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 189, 46, 29));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Respaldar");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 12, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccione las tablas a ...");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 159, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 654, 400));

        jPanel1.setBackground(new java.awt.Color(34, 33, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo Respaldo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 15, -1, -1));

        tipoRespaldo.add(radioTotal);
        radioTotal.setText("Total");
        radioTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(radioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 15, -1, -1));

        tipoRespaldo.add(radioParcial);
        radioParcial.setText("Parcial");
        radioParcial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(radioParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 15, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Guardan en:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 46, -1, 26));

        labelSource.setForeground(new java.awt.Color(255, 255, 255));
        labelSource.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(labelSource, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 46, 457, 26));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Formato Salida:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 81, -1, 26));

        formatoSalida.add(radioSql);
        radioSql.setText(".sql");
        radioSql.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(radioSql, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 84, -1, -1));

        formatoSalida.add(radioBackup);
        radioBackup.setText(".backup");
        radioBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(radioBackup, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 84, -1, -1));

        btnRutaSource.setText("...");
        btnRutaSource.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRutaSource, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 46, -1, 26));

        labelSO.setForeground(new java.awt.Color(255, 255, 255));
        labelSO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(labelSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 114, 670, 26));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sistema Operativo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 114, -1, 26));

        btnRespaldar.setBackground(new java.awt.Color(34, 33, 74));
        btnRespaldar.setForeground(new java.awt.Color(255, 255, 255));
        btnRespaldar.setText("Respaldar");
        btnRespaldar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 197, 106), 3));
        btnRespaldar.setContentAreaFilled(false);
        btnRespaldar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRespaldar, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 0, 90, 37));

        btnRestaurar.setBackground(new java.awt.Color(34, 33, 74));
        btnRestaurar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestaurar.setText("Restaurar");
        btnRestaurar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 197, 106), 3));
        btnRestaurar.setContentAreaFilled(false);
        btnRestaurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 89, 37));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 654, 10));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/respaldo.png"))); // NOI18N
        jLabel3.setText(" RESPALDO Y RESTAURACION");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(45, 58, 84));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Inicio Getter
    public JButton getBtnDerecha() {
        return btnDerecha;
    }

    public JButton getBtnIzquierda() {
        return btnIzquierda;
    }

    public JButton getBtnRutaSource() {
        return btnRutaSource;
    }

    public ButtonGroup getFormatoSalida() {
        return formatoSalida;
    }

    public JLabel getLabelSource() {
        return labelSource;
    }

    public JList getListadoRespaldar() {
        return listadoRespaldar;
    }

    public JList getListadoTablas() {
        return listadoTablas;
    }

    public JRadioButton getRadioBackup() {
        return radioBackup;
    }

    public JRadioButton getRadioParcial() {
        return radioParcial;
    }

    public JRadioButton getRadioSql() {
        return radioSql;
    }

    public JRadioButton getRadioTotal() {
        return radioTotal;
    }

    public JLabel getLabelSO() {
        return labelSO;
    }

    public JButton getBtnRespaldar() {
        return btnRespaldar;
    }

    public JButton getBtnRestaurar() {
        return btnRestaurar;
    }

    public ButtonGroup getTipoRespaldo() {
        return tipoRespaldo;
    }
    //Fin Getter

    public static void main(String args[]) { 
                new VistaPrincipal().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JButton btnRespaldar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnRutaSource;
    private javax.swing.ButtonGroup formatoSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelSO;
    private javax.swing.JLabel labelSource;
    private javax.swing.JList listadoRespaldar;
    private javax.swing.JList listadoTablas;
    private javax.swing.JRadioButton radioBackup;
    private javax.swing.JRadioButton radioParcial;
    private javax.swing.JRadioButton radioSql;
    private javax.swing.JRadioButton radioTotal;
    private javax.swing.ButtonGroup tipoRespaldo;
    // End of variables declaration//GEN-END:variables
}
