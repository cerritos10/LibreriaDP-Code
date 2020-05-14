/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import clases.conexion;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cerritos
 */
public class Venta_Comercial extends javax.swing.JFrame {
conexion conn=new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
        DefaultTableModel modelo3;
         DefaultTableModel modelo4;
    Object [] obj= new Object[7];
    int id;
    /**
     * Creates new form Venta_Comercial
     */
    public Venta_Comercial() {
        initComponents();
        modelo3=(DefaultTableModel) TablaRegistros.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtIdDetalleVenta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtBucarCliente = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        txtIVA = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtSub = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        txtTotal = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txtBucarProducto = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txthaber = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRegistros = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        verProducto = new javax.swing.JButton();
        txtStockActual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1080, 680));

        jPanel1.setBackground(new java.awt.Color(34, 33, 74));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("VENTA COMERCIAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/factura.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, 120, 120));

        txtIdDetalleVenta.setBackground(new java.awt.Color(34, 33, 74));
        txtIdDetalleVenta.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtIdDetalleVenta.setForeground(new java.awt.Color(34, 33, 74));
        txtIdDetalleVenta.setBorder(null);
        txtIdDetalleVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDetalleVentaActionPerformed(evt);
            }
        });
        txtIdDetalleVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdDetalleVentaKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdDetalleVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 140, -1));

        txtPrecio.setBackground(new java.awt.Color(34, 33, 74));
        txtPrecio.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setBorder(null);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 140, 30));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 140, -1));

        btnRegistrar.setBackground(new java.awt.Color(79, 85, 137));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(204, 204, 204));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 130, 40));

        btnSave.setBackground(new java.awt.Color(79, 85, 137));
        btnSave.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(204, 204, 204));
        btnSave.setText("GUARDAR");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 197, 106), 3));
        btnSave.setContentAreaFilled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 120, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Poducto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        txtCant.setBackground(new java.awt.Color(34, 33, 74));
        txtCant.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtCant.setForeground(new java.awt.Color(204, 204, 204));
        txtCant.setBorder(null);
        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantKeyTyped(evt);
            }
        });
        jPanel1.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 140, 30));

        txtProducto.setBackground(new java.awt.Color(34, 33, 74));
        txtProducto.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(204, 204, 204));
        txtProducto.setBorder(null);
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 140, 30));

        jSeparator8.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 140, -1));

        jSeparator9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 140, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Cantidad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 20));

        txtBucarCliente.setBackground(new java.awt.Color(34, 33, 74));
        txtBucarCliente.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtBucarCliente.setForeground(new java.awt.Color(204, 204, 204));
        txtBucarCliente.setBorder(null);
        txtBucarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBucarClienteKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBucarClienteKeyPressed(evt);
            }
        });
        jPanel1.add(txtBucarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, 140, 30));

        btnCancelar.setBackground(new java.awt.Color(79, 85, 137));
        btnCancelar.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(204, 204, 204));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 120, 40));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 140, -1));

        txtIVA.setBackground(new java.awt.Color(34, 33, 74));
        txtIVA.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtIVA.setForeground(new java.awt.Color(204, 204, 204));
        txtIVA.setBorder(null);
        txtIVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIVAKeyTyped(evt);
            }
        });
        jPanel1.add(txtIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 140, 30));

        jSeparator10.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 140, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("IVA:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, -1, -1));

        txtSub.setBackground(new java.awt.Color(34, 33, 74));
        txtSub.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtSub.setForeground(new java.awt.Color(204, 204, 204));
        txtSub.setBorder(null);
        txtSub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSubKeyTyped(evt);
            }
        });
        jPanel1.add(txtSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 140, 30));

        jSeparator12.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 140, 20));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("SubTotal:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, -1, 20));

        jSeparator13.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 140, -1));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(34, 33, 74));
        txtTotal.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(204, 204, 204));
        txtTotal.setBorder(null);
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalKeyTyped(evt);
            }
        });
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 570, 140, 30));

        jSeparator14.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 140, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Total:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, -1, -1));

        txtBucarProducto.setBackground(new java.awt.Color(34, 33, 74));
        txtBucarProducto.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtBucarProducto.setForeground(new java.awt.Color(204, 204, 204));
        txtBucarProducto.setBorder(null);
        txtBucarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBucarProductoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBucarProductoKeyPressed(evt);
            }
        });
        jPanel1.add(txtBucarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, 140, 30));

        jSeparator15.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 180, 140, 20));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Buscar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, -1, 20));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Precio:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        txthaber.setBackground(new java.awt.Color(34, 33, 74));
        txthaber.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txthaber.setForeground(new java.awt.Color(34, 33, 74));
        txthaber.setBorder(null);
        txthaber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthaberKeyTyped(evt);
            }
        });
        jPanel1.add(txthaber, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 140, 30));

        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaProducto);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 410, 210));

        TablaRegistros.setBackground(new java.awt.Color(45, 55, 99));
        TablaRegistros.setForeground(new java.awt.Color(255, 255, 255));
        TablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Descuento", "Monto", "Stock", "Nuevo Stock"
            }
        ));
        TablaRegistros.setFocusable(false);
        TablaRegistros.setGridColor(new java.awt.Color(153, 153, 153));
        TablaRegistros.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaRegistros.setRowHeight(25);
        TablaRegistros.setSelectionBackground(new java.awt.Color(47, 63, 128));
        TablaRegistros.setShowVerticalLines(false);
        TablaRegistros.getTableHeader().setReorderingAllowed(false);
        TablaRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaRegistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 640, 120));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Fecha:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        txtFecha.setBackground(new java.awt.Color(34, 33, 74));
        txtFecha.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(204, 204, 204));
        txtFecha.setText("09/05/20");
        txtFecha.setBorder(null);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 140, 30));

        jSeparator17.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 140, 20));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Descuento:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        txtDescuento.setBackground(new java.awt.Color(34, 33, 74));
        txtDescuento.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtDescuento.setForeground(new java.awt.Color(204, 204, 204));
        txtDescuento.setBorder(null);
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 140, 30));

        jSeparator18.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 140, 20));

        verProducto.setBackground(new java.awt.Color(79, 85, 137));
        verProducto.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        verProducto.setForeground(new java.awt.Color(204, 204, 204));
        verProducto.setText("VER");
        verProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        verProducto.setContentAreaFilled(false);
        verProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProductoActionPerformed(evt);
            }
        });
        jPanel1.add(verProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 50, 30));

        txtStockActual.setBackground(new java.awt.Color(34, 33, 74));
        txtStockActual.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtStockActual.setForeground(new java.awt.Color(34, 33, 74));
        txtStockActual.setBorder(null);
        txtStockActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActualActionPerformed(evt);
            }
        });
        txtStockActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockActualKeyTyped(evt);
            }
        });
        jPanel1.add(txtStockActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void SumarCant(){
               int fila=0;
               int total=0;
               String stockact=null;
               stockact=txtStockActual.getText();
               
             for (int i = 0; i < TablaRegistros.getRowCount(); i++) {
                   String stock=TablaRegistros.getValueAt(i, 6).toString();
                   String ide=TablaRegistros.getValueAt(i, 0).toString();
               String sql="update producto set stock='"+stock+"' where id_producto="+ide;
         if (stockact.equals("")) {
             javax.swing.JOptionPane.showMessageDialog(null, "No deben haber campos vacios");
         }else{
             try{
                 cn=conn.connx();
                 st=cn.createStatement();
                 st.executeUpdate(sql);

                 javax.swing.JOptionPane.showMessageDialog(null, "El stock ha sido actualizado");                
             }catch(Exception e){}
         }
                }
               txtStockActual.setText(""+total);
           
           }
     public void ListarProducto(){
         String sql="select id_producto,nombre_producto,nombre_marca,stock,precio_venta from producto\n" +
                        "inner join marca on marca.id_marca=producto.id_marca";
    try{
        cn=conn.connx();
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        Object[]proveedor=new Object[5];
        modelo=(DefaultTableModel)TablaProducto.getModel();
        while(rs.next()){
        proveedor[0]=rs.getInt("id_producto");
        proveedor[1]=rs.getString("nombre_producto");
        proveedor[2]=rs.getString("nombre_marca");
        proveedor[3]=rs.getString("stock");
        proveedor[4]=rs.getString("precio_venta");
        modelo.addRow(proveedor);
        
        }
        TablaProducto.setModel(modelo);
        
    }catch (Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
      
     public void cancelar(){
        txtProducto.setText("");
        txtCant.setText("");
        txtPrecio.setText("");
        txtDescuento.setText("");
        txtFecha.setText("");
        txtSub.setText("");
        txtIVA.setText("");
        txtTotal.setText("");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdDetalleVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDetalleVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDetalleVentaActionPerformed

    private void txtIdDetalleVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdDetalleVentaKeyTyped

    }//GEN-LAST:event_txtIdDetalleVentaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
            if (txtPrecio.getText().length() >= 7) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Precio");
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtProducto.getText().equals("")||txtCant.getText().equals("")||txtPrecio.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
        }
        else{
            TablaRegistros.setVisible(true);
            obj[0]=txtProducto.getText();
            obj[1]=txtCant.getText();
            obj[2]=txtPrecio.getText();
            obj[3]=txtDescuento.getText();
            obj[5]=txtStockActual.getText();

            modelo3.addRow(obj);}
        if (txtProducto.getText().equals("")||txtCant.getText().equals("")||txtPrecio.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
        }
        else{
            String pre;
            String can,sa,sn = null;
            double iva=0;
            double total=0;
            double subtotal=0;
            double precio;
            int cantidad,saN,sNN;
            double imp=0.0;

            for(int i=0;i<TablaRegistros.getRowCount();i++)
            {
                can=TablaRegistros.getValueAt(i, 1).toString();
                pre=TablaRegistros.getValueAt(i, 2).toString();
                String des=txtDescuento.getText();
                double desc=Double.parseDouble(des);
                precio=Double.parseDouble(pre);
                cantidad=Integer.parseInt(can);
                imp=(precio-desc)*cantidad;
                subtotal=subtotal+imp;
                iva=subtotal*0.13;
                total=subtotal+iva;
                TablaRegistros.setValueAt(Math.rint(imp*100)/100, i, 4);
                //                sa=TablaFactura.getValueAt(i, 4).toString();
                String ca=txtCant.getText();
                int cann=Integer.parseInt(ca);
                sa=txtStockActual.getText();

                saN=Integer.parseInt(sa);
                int valor=saN-cann;
                txthaber.setText(""+valor);
                sa=TablaRegistros.getValueAt(i, 5).toString();
                saN=Integer.parseInt(sa);
                TablaRegistros.setValueAt((saN-cantidad), i, 6);

            }

            txtSub.setText(Double.toString(subtotal));
            txtIVA.setText(""+Math.rint(iva*100)/100);
            txtTotal.setText(""+Math.rint(total*100)/100);

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtSub.getText().equals("")||txtTotal.getText().equals("")||txtIVA.getText().equals("")||txtDescuento.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
        }
        else{
            
            SumarCant();
            //        txtFactura.setText("");
            txtProducto.setText("");
            txtPrecio.setText("");
            txtCant.setText("");
            txtTotal.setText("");
            txtIVA.setText("");
            txtSub.setText("");
            String nombrecolumnas[]={"Id","Fecha","Cliente","Total"};
            String data[][]=new String [0][0];
            
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyTyped
        if (txtCant.getText().length() >= 7) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en la Cantidad");
        }
    }//GEN-LAST:event_txtCantKeyTyped

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped
        if (txtProducto.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Producto");
        } else if ((int) evt.getKeyChar() >= 32 && (int) evt.getKeyChar() <= 47  ||
            (int) evt.getKeyChar()>=58 && (int) evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Producto");
        }
    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtBucarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucarClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBucarClienteKeyTyped

    private void txtBucarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucarClienteKeyPressed
        
    }//GEN-LAST:event_txtBucarClienteKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIVAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIVAKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAKeyTyped

    private void txtSubKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubKeyTyped

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyTyped

    private void txtBucarProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucarProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBucarProductoKeyTyped

    private void txtBucarProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucarProductoKeyPressed
        String[] titulos = {"Id","Producto","Marca","Stock"};
        String[] registros = new String[50];

        String sql = "select id_producto,nombre_producto,nombre_marca,stock from producto\n" +
        "inner join marca on marca.id_marca=producto.id_marca WHERE nombre_producto LIKE '%" + txtBucarProducto.getText() + "%'";
        modelo = new DefaultTableModel(null, titulos);
        conexion cc = new conexion();
        Connection conect = cc.connx();
        try {
            Statement st = (Statement) conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0]=rs.getString("id_producto");
                registros[1]=rs.getString("nombre_producto");
                registros[2]=rs.getString("nombre_marca");
                registros[3]=rs.getString("stock");

                modelo.addRow(registros);
            }
            TablaProducto.setModel(modelo);

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_txtBucarProductoKeyPressed

    private void txthaberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthaberKeyTyped
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
    }//GEN-LAST:event_txthaberKeyTyped

    private void TablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductoMouseClicked
        int  fila=TablaProducto.getSelectedRow();
        if (fila==-1) {
            javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para agregar");
        }else{
            id= Integer.parseInt((String)TablaProducto.getValueAt(fila,0).toString());
            String stock=(String)TablaProducto.getValueAt(fila,3);
            String pre=(String)TablaProducto.getValueAt(fila,4);
            txtProducto.setText(""+id);
            txtStockActual.setText(stock);
            txtPrecio.setText(pre);
        }
    }//GEN-LAST:event_TablaProductoMouseClicked

    private void TablaRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRegistrosMouseClicked

    }//GEN-LAST:event_TablaRegistrosMouseClicked

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
         if (txtFecha.getText().length() >= 8) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese la fecha con el siguiente formato 00/00/00");
        } 
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
         if (txtDescuento.getText().length() >= 7) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Decuento");
        }
    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void verProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProductoActionPerformed
        this.txtBucarProducto.setVisible(true);
        this.txtBucarCliente.setVisible(false);
        String nombrecolumnas[]={"Id","Producto","Marca","Stock","Precio"};
        String data[][]=new String [0][0];

        TablaProducto.setModel(new DefaultTableModel(data,nombrecolumnas));

        //        TablaMuestras.getTableHeader().setVisible(false);
        ListarProducto();
    }//GEN-LAST:event_verProductoActionPerformed

    private void txtStockActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActualActionPerformed

    private void txtStockActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockActualKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActualKeyTyped

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
            java.util.logging.Logger.getLogger(Venta_Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta_Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta_Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta_Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta_Comercial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProducto;
    private javax.swing.JTable TablaRegistros;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtBucarCliente;
    private javax.swing.JTextField txtBucarProducto;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtIdDetalleVenta;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStockActual;
    private javax.swing.JTextField txtSub;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txthaber;
    private javax.swing.JButton verProducto;
    // End of variables declaration//GEN-END:variables
}
