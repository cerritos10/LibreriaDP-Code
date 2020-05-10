
package form;

import clases.Existencias;
import clases.conexion;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Compra extends javax.swing.JFrame {

conexion conn=new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    int id;
    public Compra() {
        initComponents();
        listarDetalle();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTCompra = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtIdIngreso = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtUser = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CalcelIngresos = new javax.swing.JButton();
        EditIngresos = new javax.swing.JButton();
        VerIngreso = new javax.swing.JButton();
        verUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtIngreso = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtProducto = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtStockActual = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txtNuevoStock = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        SaveIngresos = new javax.swing.JButton();
        verTCompra = new javax.swing.JButton();
        verProveedor = new javax.swing.JButton();
        verIngreso = new javax.swing.JButton();
        verProducto = new javax.swing.JButton();
        txtCancel2 = new javax.swing.JButton();
        btnEdit2 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        btnSave8 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableDetalle = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        txtBU = new javax.swing.JTextField();
        txtBTC = new javax.swing.JTextField();
        aggUser = new javax.swing.JButton();
        aggTcompra = new javax.swing.JButton();
        aggProveedor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaIngresos = new javax.swing.JTable();
        aggProducto = new javax.swing.JButton();
        aggIngreso = new javax.swing.JButton();
        DeleteIngresos1 = new javax.swing.JButton();
        txtProveedor = new javax.swing.JTextField();
        txtBIngreso = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        txtBProducto = new javax.swing.JTextField();
        txtIdDetalle = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(34, 33, 74));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtTCompra.setBackground(new java.awt.Color(34, 33, 74));
        txtTCompra.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtTCompra.setForeground(new java.awt.Color(204, 204, 204));
        txtTCompra.setBorder(null);
        txtTCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTCompraKeyTyped(evt);
            }
        });
        jPanel1.add(txtTCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, 30));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, -1));

        txtIdIngreso.setBackground(new java.awt.Color(34, 33, 74));
        txtIdIngreso.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtIdIngreso.setForeground(new java.awt.Color(34, 33, 74));
        txtIdIngreso.setBorder(null);
        txtIdIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdIngresoKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, 30));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, -1));

        txtUser.setBackground(new java.awt.Color(34, 33, 74));
        txtUser.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setBorder(null);
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 140, 30));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 900, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Tipo Compra:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("DETALLE DE INGRESOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        CalcelIngresos.setBackground(new java.awt.Color(79, 85, 137));
        CalcelIngresos.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        CalcelIngresos.setForeground(new java.awt.Color(204, 204, 204));
        CalcelIngresos.setText("CANCELAR");
        CalcelIngresos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        CalcelIngresos.setContentAreaFilled(false);
        CalcelIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcelIngresosActionPerformed(evt);
            }
        });
        jPanel1.add(CalcelIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 100, 30));

        EditIngresos.setBackground(new java.awt.Color(79, 85, 137));
        EditIngresos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        EditIngresos.setForeground(new java.awt.Color(204, 204, 204));
        EditIngresos.setText("EDITAR");
        EditIngresos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 39, 106), 3));
        EditIngresos.setContentAreaFilled(false);
        EditIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditIngresosActionPerformed(evt);
            }
        });
        jPanel1.add(EditIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 100, 30));

        VerIngreso.setBackground(new java.awt.Color(79, 85, 137));
        VerIngreso.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        VerIngreso.setForeground(new java.awt.Color(204, 204, 204));
        VerIngreso.setText("VER INGR");
        VerIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 197, 106), 3));
        VerIngreso.setContentAreaFilled(false);
        VerIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(VerIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 100, 30));

        verUser.setBackground(new java.awt.Color(79, 85, 137));
        verUser.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        verUser.setForeground(new java.awt.Color(204, 204, 204));
        verUser.setText("VER");
        verUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        verUser.setContentAreaFilled(false);
        verUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verUserActionPerformed(evt);
            }
        });
        jPanel1.add(verUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 50, 30));

        jTable1.setBackground(new java.awt.Color(45, 55, 99));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ingreso", "Producto", "Cantidad", "Precio Compra"
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 810, 130));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Fecha:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        txtCode.setBackground(new java.awt.Color(34, 33, 74));
        txtCode.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtCode.setForeground(new java.awt.Color(204, 204, 204));
        txtCode.setBorder(null);
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeKeyTyped(evt);
            }
        });
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 140, 30));

        txtFecha.setBackground(new java.awt.Color(34, 33, 74));
        txtFecha.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(204, 204, 204));
        txtFecha.setBorder(null);
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 140, 30));

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 140, -1));

        jSeparator8.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 140, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Código:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Producto:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        txtCantidad.setBackground(new java.awt.Color(34, 33, 74));
        txtCantidad.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(204, 204, 204));
        txtCantidad.setBorder(null);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 140, 30));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 140, -1));

        txtIngreso.setBackground(new java.awt.Color(34, 33, 74));
        txtIngreso.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtIngreso.setForeground(new java.awt.Color(204, 204, 204));
        txtIngreso.setBorder(null);
        txtIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngresoKeyTyped(evt);
            }
        });
        jPanel1.add(txtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 140, 30));

        jSeparator9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 140, -1));

        txtProducto.setBackground(new java.awt.Color(34, 33, 74));
        txtProducto.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(204, 204, 204));
        txtProducto.setBorder(null);
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 140, 30));

        jSeparator10.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 140, -1));

        jSeparator11.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 140, 20));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Cantidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, 20));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Ingreso:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Nuevo Stock:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 140, -1));

        txtStockActual.setBackground(new java.awt.Color(34, 33, 74));
        txtStockActual.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtStockActual.setForeground(new java.awt.Color(204, 204, 204));
        txtStockActual.setBorder(null);
        txtStockActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockActualKeyTyped(evt);
            }
        });
        jPanel1.add(txtStockActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 140, 30));

        jSeparator12.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 140, -1));

        txtNuevoStock.setBackground(new java.awt.Color(34, 33, 74));
        txtNuevoStock.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtNuevoStock.setForeground(new java.awt.Color(204, 204, 204));
        txtNuevoStock.setBorder(null);
        txtNuevoStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoStockActionPerformed(evt);
            }
        });
        jPanel1.add(txtNuevoStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 140, 30));

        jSeparator13.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 140, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Stock Actual:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        txtPrecioCompra.setBackground(new java.awt.Color(34, 33, 74));
        txtPrecioCompra.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtPrecioCompra.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecioCompra.setBorder(null);
        txtPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCompraKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 140, 30));

        jSeparator15.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 140, 20));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Precio Compra:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, 20));

        SaveIngresos.setBackground(new java.awt.Color(79, 85, 137));
        SaveIngresos.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        SaveIngresos.setForeground(new java.awt.Color(204, 204, 204));
        SaveIngresos.setText("GUARDAR");
        SaveIngresos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        SaveIngresos.setContentAreaFilled(false);
        SaveIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveIngresosActionPerformed(evt);
            }
        });
        jPanel1.add(SaveIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 100, 30));

        verTCompra.setBackground(new java.awt.Color(79, 85, 137));
        verTCompra.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        verTCompra.setForeground(new java.awt.Color(204, 204, 204));
        verTCompra.setText("VER");
        verTCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        verTCompra.setContentAreaFilled(false);
        verTCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTCompraActionPerformed(evt);
            }
        });
        jPanel1.add(verTCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 50, 30));

        verProveedor.setBackground(new java.awt.Color(79, 85, 137));
        verProveedor.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        verProveedor.setForeground(new java.awt.Color(204, 204, 204));
        verProveedor.setText("VER");
        verProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        verProveedor.setContentAreaFilled(false);
        verProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(verProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 50, 30));

        verIngreso.setBackground(new java.awt.Color(79, 85, 137));
        verIngreso.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        verIngreso.setForeground(new java.awt.Color(204, 204, 204));
        verIngreso.setText("VER");
        verIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        verIngreso.setContentAreaFilled(false);
        verIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(verIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 50, 30));

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
        jPanel1.add(verProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 50, 30));

        txtCancel2.setBackground(new java.awt.Color(79, 85, 137));
        txtCancel2.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        txtCancel2.setForeground(new java.awt.Color(204, 204, 204));
        txtCancel2.setText("CANCELAR");
        txtCancel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        txtCancel2.setContentAreaFilled(false);
        txtCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancel2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtCancel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 100, 30));

        btnEdit2.setBackground(new java.awt.Color(79, 85, 137));
        btnEdit2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnEdit2.setForeground(new java.awt.Color(204, 204, 204));
        btnEdit2.setText("EDITAR");
        btnEdit2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 39, 106), 3));
        btnEdit2.setContentAreaFilled(false);
        btnEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 100, 30));

        btnDelete2.setBackground(new java.awt.Color(79, 85, 137));
        btnDelete2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnDelete2.setForeground(new java.awt.Color(204, 204, 204));
        btnDelete2.setText("ELIMINAR");
        btnDelete2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 197, 106), 3));
        btnDelete2.setContentAreaFilled(false);
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 100, 30));

        btnSave8.setBackground(new java.awt.Color(79, 85, 137));
        btnSave8.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        btnSave8.setForeground(new java.awt.Color(204, 204, 204));
        btnSave8.setText("GUARDAR");
        btnSave8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        btnSave8.setContentAreaFilled(false);
        btnSave8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 100, 30));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Proveedor:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("INGRESOS");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jSeparator16.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 20));

        TableDetalle.setBackground(new java.awt.Color(45, 55, 99));
        TableDetalle.setForeground(new java.awt.Color(255, 255, 255));
        TableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableDetalle.setFocusable(false);
        TableDetalle.setGridColor(new java.awt.Color(153, 153, 153));
        TableDetalle.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TableDetalle.setRowHeight(25);
        TableDetalle.setSelectionBackground(new java.awt.Color(47, 63, 128));
        TableDetalle.setShowVerticalLines(false);
        TableDetalle.getTableHeader().setReorderingAllowed(false);
        TableDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDetalleMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableDetalle);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 330, 130));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Buscar:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, -1));

        txtBP.setBackground(new java.awt.Color(34, 33, 74));
        txtBP.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtBP.setForeground(new java.awt.Color(204, 204, 204));
        txtBP.setBorder(null);
        txtBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPActionPerformed(evt);
            }
        });
        txtBP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBPKeyPressed(evt);
            }
        });
        jPanel1.add(txtBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 140, 30));

        jSeparator14.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 140, -1));

        txtBU.setBackground(new java.awt.Color(34, 33, 74));
        txtBU.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtBU.setForeground(new java.awt.Color(204, 204, 204));
        txtBU.setBorder(null);
        txtBU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBUKeyPressed(evt);
            }
        });
        jPanel1.add(txtBU, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 140, 30));

        txtBTC.setBackground(new java.awt.Color(34, 33, 74));
        txtBTC.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtBTC.setForeground(new java.awt.Color(204, 204, 204));
        txtBTC.setBorder(null);
        txtBTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBTCActionPerformed(evt);
            }
        });
        txtBTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBTCKeyPressed(evt);
            }
        });
        jPanel1.add(txtBTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 140, 30));

        aggUser.setBackground(new java.awt.Color(79, 85, 137));
        aggUser.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        aggUser.setForeground(new java.awt.Color(204, 204, 204));
        aggUser.setText("AGG");
        aggUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        aggUser.setContentAreaFilled(false);
        aggUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggUserActionPerformed(evt);
            }
        });
        jPanel1.add(aggUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 50, 30));

        aggTcompra.setBackground(new java.awt.Color(79, 85, 137));
        aggTcompra.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        aggTcompra.setForeground(new java.awt.Color(204, 204, 204));
        aggTcompra.setText("AGG");
        aggTcompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        aggTcompra.setContentAreaFilled(false);
        aggTcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggTcompraActionPerformed(evt);
            }
        });
        jPanel1.add(aggTcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 50, 30));

        aggProveedor.setBackground(new java.awt.Color(79, 85, 137));
        aggProveedor.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        aggProveedor.setForeground(new java.awt.Color(204, 204, 204));
        aggProveedor.setText("AGG");
        aggProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        aggProveedor.setContentAreaFilled(false);
        aggProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(aggProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 50, 30));

        TablaIngresos.setBackground(new java.awt.Color(45, 55, 99));
        TablaIngresos.setForeground(new java.awt.Color(255, 255, 255));
        TablaIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaIngresos.setFocusable(false);
        TablaIngresos.setGridColor(new java.awt.Color(153, 153, 153));
        TablaIngresos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaIngresos.setRowHeight(25);
        TablaIngresos.setSelectionBackground(new java.awt.Color(47, 63, 128));
        TablaIngresos.setShowVerticalLines(false);
        TablaIngresos.getTableHeader().setReorderingAllowed(false);
        TablaIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaIngresosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TablaIngresos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 320, 130));

        aggProducto.setBackground(new java.awt.Color(79, 85, 137));
        aggProducto.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        aggProducto.setForeground(new java.awt.Color(204, 204, 204));
        aggProducto.setText("AGG");
        aggProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        aggProducto.setContentAreaFilled(false);
        aggProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggProductoActionPerformed(evt);
            }
        });
        jPanel1.add(aggProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 50, 30));

        aggIngreso.setBackground(new java.awt.Color(79, 85, 137));
        aggIngreso.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        aggIngreso.setForeground(new java.awt.Color(204, 204, 204));
        aggIngreso.setText("AGG");
        aggIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 80, 161), 3));
        aggIngreso.setContentAreaFilled(false);
        aggIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(aggIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 50, 30));

        DeleteIngresos1.setBackground(new java.awt.Color(79, 85, 137));
        DeleteIngresos1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        DeleteIngresos1.setForeground(new java.awt.Color(204, 204, 204));
        DeleteIngresos1.setText("ELIMINAR");
        DeleteIngresos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 197, 106), 3));
        DeleteIngresos1.setContentAreaFilled(false);
        DeleteIngresos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteIngresos1ActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteIngresos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 100, 30));

        txtProveedor.setBackground(new java.awt.Color(34, 33, 74));
        txtProveedor.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtProveedor.setForeground(new java.awt.Color(204, 204, 204));
        txtProveedor.setBorder(null);
        txtProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 140, 30));

        txtBIngreso.setBackground(new java.awt.Color(34, 33, 74));
        txtBIngreso.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtBIngreso.setForeground(new java.awt.Color(204, 204, 204));
        txtBIngreso.setBorder(null);
        txtBIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBIngresoActionPerformed(evt);
            }
        });
        txtBIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBIngresoKeyPressed(evt);
            }
        });
        jPanel1.add(txtBIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 140, 30));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Buscar:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, -1, -1));

        jSeparator17.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 140, -1));

        txtBProducto.setBackground(new java.awt.Color(34, 33, 74));
        txtBProducto.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtBProducto.setForeground(new java.awt.Color(204, 204, 204));
        txtBProducto.setBorder(null);
        txtBProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBProductoActionPerformed(evt);
            }
        });
        txtBProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBProductoKeyPressed(evt);
            }
        });
        jPanel1.add(txtBProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 140, 30));

        txtIdDetalle.setBackground(new java.awt.Color(34, 33, 74));
        txtIdDetalle.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtIdDetalle.setForeground(new java.awt.Color(34, 33, 74));
        txtIdDetalle.setBorder(null);
        jPanel1.add(txtIdDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 140, 30));

        btnCalcular.setBackground(new java.awt.Color(79, 85, 137));
        btnCalcular.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(204, 204, 204));
        btnCalcular.setText("CALCULAR");
        btnCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 39, 106), 3));
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 100, 30));

        jButton1.setBackground(new java.awt.Color(45, 58, 84));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTCompraKeyTyped
         if (txtTCompra.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Tipo de Compra");
        } else if ((int) evt.getKeyChar() >= 32 && (int) evt.getKeyChar() <= 47  ||
                (int) evt.getKeyChar()>=58 && (int) evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Tipo de Compra");
        }
    }//GEN-LAST:event_txtTCompraKeyTyped

    private void txtIdIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdIngresoKeyTyped
        
    }//GEN-LAST:event_txtIdIngresoKeyTyped

    private void CalcelIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcelIngresosActionPerformed
            CancelarIngreso();
            TablaIngresos.setVisible(false);
    }//GEN-LAST:event_CalcelIngresosActionPerformed

    private void EditIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditIngresosActionPerformed
        Existencias modSql=new Existencias();
        if(modSql.ExistCode(txtCode.getText())==0) {    
        ModificarIngreso();
            String nombrecolumnas[]={"Id","Proveedor","Usuario","Compra","Fecha","Codigo"};
        String data[][]=new String [0][0];
        TablaIngresos.setModel(new DefaultTableModel(data,nombrecolumnas));
        ListarIngreso();}
        else{
        javax.swing.JOptionPane.showMessageDialog(this, "El telefono ya existe");
        }
    }//GEN-LAST:event_EditIngresosActionPerformed

    private void VerIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerIngresoActionPerformed
            String nombrecolumnas[]={"Id","Proveedor","Usuario","Compra","Fecha","Codigo"};
        String data[][]=new String [0][0];
        TablaIngresos.setModel(new DefaultTableModel(data,nombrecolumnas));
        ListarIngreso();
    }//GEN-LAST:event_VerIngresoActionPerformed

    private void verUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verUserActionPerformed
            this.txtBP.setVisible(false);
            this.txtBTC.setVisible(false);
            this.txtBU.setVisible(true);
            String nombrecolumnas[]={"Id","Usuario"};
        String data[][]=new String [0][0];
        TablaIngresos.setModel(new DefaultTableModel(data,nombrecolumnas));
        ListarUsuario();

    }//GEN-LAST:event_verUserActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            int  fila=jTable1.getSelectedRow();
            if (fila==-1) {
                          javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para editar o eliminar");
        }else{
                id= Integer.parseInt((String)jTable1.getValueAt(fila,0).toString());   
                int ingreso=Integer.parseInt((String)jTable1.getValueAt(fila,1).toString()); 
                int producto=Integer.parseInt((String)jTable1.getValueAt(fila,2).toString()); 
                String cantidad=(String)jTable1.getValueAt(fila,3);
                String precio=(String)jTable1.getValueAt(fila,4);
                txtIdDetalle.setText(""+id);
                this.txtIngreso.setText(""+ingreso);
                this.txtProducto.setText(""+producto);
                this.txtCantidad.setText(cantidad);
                this.txtPrecioCompra.setText(precio);
            }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
         if (txtCantidad.getText().length() >= 7) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en la Cantidad");
        } else if ((int) evt.getKeyChar() >= 32 && (int) evt.getKeyChar() <= 47  ||
                (int) evt.getKeyChar()>=58 && (int) evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en la Cantidad");
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresoKeyTyped
         if (txtIngreso.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Ingreso");
        } else if ((int) evt.getKeyChar() >= 32 && (int) evt.getKeyChar() <= 47  ||
                (int) evt.getKeyChar()>=58 && (int) evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Ingreso");
        }
    }//GEN-LAST:event_txtIngresoKeyTyped

    private void txtStockActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockActualKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActualKeyTyped

    private void txtPrecioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCompraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraKeyTyped

    private void SaveIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveIngresosActionPerformed
                Existencias modSql=new Existencias(); 
        if(modSql.ExistCode(txtCode.getText())==0) {
        AgregarIngreso();
        String nombrecolumnas[]={"Id","Proveedor","Usuario","Compra","Fecha","Codigo"};
        String data[][]=new String [0][0];
        TablaIngresos.setModel(new DefaultTableModel(data,nombrecolumnas));
        ListarIngreso();}
        else{javax.swing.JOptionPane.showMessageDialog(this, "El telefono ya existe");}
    }//GEN-LAST:event_SaveIngresosActionPerformed

    private void verTCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTCompraActionPerformed
        this.txtBU.setVisible(false);
        this.txtBP.setVisible(false);
       this.txtBTC.setVisible(true);
       String nombrecolumnas[]={"Id","Tipo Compra"};
        String data[][]=new String [0][0];
        TablaIngresos.setModel(new DefaultTableModel(data,nombrecolumnas));
        ListarTCompra();
    }//GEN-LAST:event_verTCompraActionPerformed

    private void verProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProveedorActionPerformed
        this.txtBU.setVisible(false);
        this.txtBTC.setVisible(false);
        this.txtBP.setVisible(true);
        String nombrecolumnas[]={"Id","Proveedor"};
        String data[][]=new String [0][0];
        TablaIngresos.setModel(new DefaultTableModel(data,nombrecolumnas));
        ListarProveedor();
    }//GEN-LAST:event_verProveedorActionPerformed

    private void verIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verIngresoActionPerformed
        this.txtBProducto.setVisible(false);
        this.txtBIngreso.setVisible(true);
        String nombrecolumnas[]={"Id","Ingreso"};
        String data[][]=new String [0][0];
        TableDetalle.setModel(new DefaultTableModel(data,nombrecolumnas));
        ListarIngresosDetalle();
    }//GEN-LAST:event_verIngresoActionPerformed

    private void verProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProductoActionPerformed
        this.txtBProducto.setVisible(true);
        this.txtBIngreso.setVisible(false);
        String nombrecolumnas[]={"Id","Producto","Marca","Stock"};
        String data[][]=new String [0][0];
        TableDetalle.setModel(new DefaultTableModel(data,nombrecolumnas));
        ListarProductoDetalle();
    }//GEN-LAST:event_verProductoActionPerformed

    private void txtCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancel2ActionPerformed
        CancelarDetalle();
    }//GEN-LAST:event_txtCancel2ActionPerformed

    private void btnEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit2ActionPerformed
             String ing=txtIngreso.getText();
         String pro=txtProducto.getText();
         String cant=txtCantidad.getText();
         String precio=txtPrecioCompra.getText();
         if (ing.equals("")||pro.equals("")||cant.equals("")||precio.equals("")) {
             javax.swing.JOptionPane.showMessageDialog(null, "No deben haber campos vacios");}
        else{ModificarDetalle();
        listarDetalle();}
    }//GEN-LAST:event_btnEdit2ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
             String ing=txtIngreso.getText();
         String pro=txtProducto.getText();
         String cant=txtCantidad.getText();
         String precio=txtPrecioCompra.getText();
         if (ing.equals("")||pro.equals("")||cant.equals("")||precio.equals("")) {
             javax.swing.JOptionPane.showMessageDialog(null, "No deben haber campos vacios");}
        else{EliminarDetalle();
        listarDetalle();}
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void btnSave8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave8ActionPerformed
        String ing=txtIngreso.getText();
         String pro=txtProducto.getText();
         String cant=txtCantidad.getText();
         String precio=txtPrecioCompra.getText();
         String stockA=txtStockActual.getText();
         String NStick=txtNuevoStock.getText();
         if (ing.equals("")||pro.equals("")||cant.equals("")||precio.equals("")||stockA.equals("")||NStick.equals("")) {
             javax.swing.JOptionPane.showMessageDialog(null, "No deben haber campos vacios");}
         
         else{AgregarDetalle();
        ModificarStock();   
        listarDetalle();
         CancelarDetalle();
         }
    }//GEN-LAST:event_btnSave8ActionPerformed

    private void TableDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDetalleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TableDetalleMouseClicked

    private void txtBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPActionPerformed

    private void txtBTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBTCActionPerformed

    private void txtBTCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBTCKeyPressed
        String[] titulos = {"Id","Tipo Compra"};
        String[] registros = new String[50];

        String sql = "SELECT * FROM tipocompra WHERE nombre_tipo_compra LIKE '%" + txtBTC.getText() + "%'";
        modelo = new DefaultTableModel(null, titulos);
        conexion cc = new conexion();
        Connection conect = cc.connx();
        try {
            Statement st = (Statement) conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("id_tipo_compra");
                registros[1] = rs.getString("nombre_tipo_compra");
                
                modelo.addRow(registros);
            }
            TablaIngresos.setModel(modelo);

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_txtBTCKeyPressed

    private void txtBPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBPKeyPressed
String[] titulos = {"Id","Proveedor"};
        String[] registros = new String[50];

        String sql = "SELECT id_proveedor,nombre_proveedor FROM proveedor WHERE nombre_proveedor LIKE '%" + txtBP.getText() + "%'";
        modelo = new DefaultTableModel(null, titulos);
        conexion cc = new conexion();
        Connection conect = cc.connx();
        try {
            Statement st = (Statement) conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("id_proveedor");
                registros[1] = rs.getString("nombre_proveedor");
                
                modelo.addRow(registros);
            }
            TablaIngresos.setModel(modelo);

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_txtBPKeyPressed

    private void txtBUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBUKeyPressed
            String[] titulos = {"Id","Usuario"};
        String[] registros = new String[50];

        String sql = "SELECT id_usuario,nombre_usuario FROM usuario WHERE nombre_usuario LIKE '%" + txtBU.getText() + "%'";
        modelo = new DefaultTableModel(null, titulos);
        conexion cc = new conexion();
        Connection conect = cc.connx();
        try {
            Statement st = (Statement) conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("id_usuario");
                registros[1] = rs.getString("nombre_usuario");
                
                modelo.addRow(registros);
            }
            TablaIngresos.setModel(modelo);

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_txtBUKeyPressed

    private void aggUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggUserActionPerformed
          int  fila=TablaIngresos.getSelectedRow();
            if (fila==-1) {
                          javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para agregar");
        }else{
                id= Integer.parseInt((String)TablaIngresos.getValueAt(fila,0).toString());            
                txtUser.setText(""+id);
            }
    }//GEN-LAST:event_aggUserActionPerformed

    private void aggTcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggTcompraActionPerformed
          int  fila=TablaIngresos.getSelectedRow();
            if (fila==-1) {
                          javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para agregar");
        }else{
                id= Integer.parseInt((String)TablaIngresos.getValueAt(fila,0).toString());            
                txtTCompra.setText(""+id);
            }
    }//GEN-LAST:event_aggTcompraActionPerformed

    private void aggProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggProveedorActionPerformed
         int  fila=TablaIngresos.getSelectedRow();
            if (fila==-1) {
                          javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para agregar");
        }else{
                id= Integer.parseInt((String)TablaIngresos.getValueAt(fila,0).toString());            
                txtProveedor.setText(""+id);
            }
    }//GEN-LAST:event_aggProveedorActionPerformed

    private void aggProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggProductoActionPerformed
        int  fila=TableDetalle.getSelectedRow();
            if (fila==-1) {
                          javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para agregar");
        }else{
                id= Integer.parseInt((String)TableDetalle.getValueAt(fila,0).toString());            
                String stock=(String)TableDetalle.getValueAt(fila,3);
                txtProducto.setText(""+id);
                txtStockActual.setText(stock);
            }
    }//GEN-LAST:event_aggProductoActionPerformed

    private void aggIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggIngresoActionPerformed
        int  fila=TableDetalle.getSelectedRow();
            if (fila==-1) {
                          javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para agregar");
        }else{
                id= Integer.parseInt((String)TableDetalle.getValueAt(fila,0).toString());            
                txtIngreso.setText(""+id);
            }
    }//GEN-LAST:event_aggIngresoActionPerformed

    private void DeleteIngresos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteIngresos1ActionPerformed
        EliminarIngreso();
        String nombrecolumnas[]={"Id","Proveedor","Usuario","Compra","Fecha","Codigo"};
        String data[][]=new String [0][0];
        TablaIngresos.setModel(new DefaultTableModel(data,nombrecolumnas));
        ListarIngreso();
    }//GEN-LAST:event_DeleteIngresos1ActionPerformed

    private void txtProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorKeyTyped
           if (txtProveedor.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Proveedor");
        } else if ((int) evt.getKeyChar() >= 32 && (int) evt.getKeyChar() <= 47  ||
                (int) evt.getKeyChar()>=58 && (int) evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Proveedor");
        }
    }//GEN-LAST:event_txtProveedorKeyTyped

    private void TablaIngresosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaIngresosMousePressed
        int  fila=TablaIngresos.getSelectedRow();
            if (fila==-1) {
                          javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para editar");
        }else{
                id= Integer.parseInt((String)TablaIngresos.getValueAt(fila,0).toString());   
                String proveedor=(String)TablaIngresos.getValueAt(fila,1);
                String user=(String)TablaIngresos.getValueAt(fila,2);
                String tipo=(String)TablaIngresos.getValueAt(fila,3);
                String fecha=(String)TablaIngresos.getValueAt(fila,4);
                String codigo=(String)TablaIngresos.getValueAt(fila,5);
                txtIdIngreso.setText(""+id);
                this.txtProveedor.setText(proveedor);
                this.txtUser.setText(user);
                this.txtTCompra.setText(tipo);
                this.txtFecha.setText(fecha);
                this.txtCode.setText(codigo);
            }
    }//GEN-LAST:event_TablaIngresosMousePressed

    private void txtBIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBIngresoActionPerformed

    private void txtBIngresoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBIngresoKeyPressed
        String[] titulos = {"Id","Codigo"};
        String[] registros = new String[50];

        String sql = "select id_ingreso,codigo from ingreso WHERE codigo LIKE '%" + txtBIngreso.getText() + "%'";
        modelo = new DefaultTableModel(null, titulos);
        conexion cc = new conexion();
        Connection conect = cc.connx();
        try {
            Statement st = (Statement) conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                 registros[0]=rs.getString("id_ingreso");
                    registros[1]=rs.getString("codigo");
                  

                modelo.addRow(registros);
            }
            TableDetalle.setModel(modelo);

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_txtBIngresoKeyPressed

    private void txtBProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBProductoActionPerformed

    private void txtBProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBProductoKeyPressed
          String[] titulos = {"Id","Producto","Marca","Stock"};
        String[] registros = new String[50];

        String sql = "select id_producto,nombre_producto,nombre_marca,stock from producto\n" +
"inner join marca on marca.id_marca=producto.id_marca WHERE nombre_producto LIKE '%" + txtBProducto.getText() + "%'";
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
            TableDetalle.setModel(modelo);

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_txtBProductoKeyPressed

    private void txtNuevoStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoStockActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
      String ing=txtIngreso.getText();
     String pro=txtProducto.getText();
     String cant=txtCantidad.getText();
     String pc=txtPrecioCompra.getText();
     String nuevo= txtNuevoStock.getText();
        if (ing.equals("")||pro.equals("")||cant.equals("")||pc.equals("")) {
             javax.swing.JOptionPane.showMessageDialog(null,"Debe ingresar los capmpos que estan vacios");
        }
        else{
        int cant1,stockActual,NuevoStock;
        cant1=Integer.parseInt(txtCantidad.getText());
        stockActual=Integer.parseInt(txtStockActual.getText());
        NuevoStock=cant1+stockActual;
        txtNuevoStock.setText(String.valueOf(NuevoStock));      
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        
    }//GEN-LAST:event_jTable1MousePressed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
         if (txtUser.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        //Validar que solo se puedan escribir numeros
        char validarN = evt.getKeyChar();
        if (Character.isLetter(validarN)) {
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Usuario");
        } else if ((int) evt.getKeyChar() >= 32 && (int) evt.getKeyChar() <= 47  ||
                (int) evt.getKeyChar()>=58 && (int) evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            javax.swing.JOptionPane.showMessageDialog(this, "Por Favor: Ingrese solo numeros en el Usuario");
        }
    }//GEN-LAST:event_txtUserKeyTyped

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void ListarProveedor(){
         String sql="select id_proveedor,nombre_proveedor from proveedor";
    try{
        cn=conn.connx();
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        Object[]proveedor=new Object[2];
        modelo=(DefaultTableModel)TablaIngresos.getModel();
        while(rs.next()){
        proveedor[0]=rs.getInt("id_proveedor");
        proveedor[1]=rs.getString("nombre_proveedor");

        modelo.addRow(proveedor);
        
        }
        TablaIngresos.setModel(modelo);
        
    }catch (Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
    public void ListarUsuario(){
         String sql="select id_usuario,nombre_usuario from usuario";
    try{
        cn=conn.connx();
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        Object[]proveedor=new Object[2];
        modelo=(DefaultTableModel)TablaIngresos.getModel();
        while(rs.next()){
        proveedor[0]=rs.getInt("id_usuario");
        proveedor[1]=rs.getString("nombre_usuario");

        modelo.addRow(proveedor);
        
        }
        TablaIngresos.setModel(modelo);
        
    }catch (Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
    public void ListarTCompra(){
         String sql="select * from tipocompra";
    try{
        cn=conn.connx();
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        Object[]proveedor=new Object[2];
        modelo=(DefaultTableModel)TablaIngresos.getModel();
        while(rs.next()){
        proveedor[0]=rs.getInt("id_tipo_compra");
        proveedor[1]=rs.getString("nombre_tipo_compra");

        modelo.addRow(proveedor);
        
        }
        TablaIngresos.setModel(modelo);
        
    }catch (Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
    public void AgregarIngreso(){
     String proveedor=txtProveedor.getText();
     String usuario=txtUser.getText();
     String compra=txtTCompra.getText();
     String fecha=txtFecha.getText();
     String codigo=txtCode.getText();
         if (proveedor.equals("")||usuario.equals("")||compra.equals("")||fecha.equals("")||codigo.equals("")) {
             javax.swing.JOptionPane.showMessageDialog(null,"Debe ingresar los capmpos que estan vacios");
         }else {
                String sql="insert into ingreso (id_proveedor,id_usuario,id_tipo_compra,fecha_compra,codigo) values ('"+proveedor+"','"+usuario+"','"+compra+"','"+fecha+"','"+codigo+"')";
                try{
                        cn=conn.connx();
                        st=cn.createStatement();
                        st.executeUpdate(sql);
                        javax.swing.JOptionPane.showMessageDialog(null, "El ingreso ha sido ingresado con exito");
                        
                }catch(Exception e){
                 //JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
                }
         }
     }
     public void LimpiarTable(){
         for (int i = 0; i <= TablaIngresos.getRowCount(); i++) {
             modelo.removeRow(i);
             i=i-1;
         }
     }
     public void ListarIngreso(){
//         String sql="select id_ingreso,nombre_proveedor,nombre_usuario,nombre_tipo_compra,fecha_compra,codigo from ingreso\n" +
//                    "inner join proveedor on proveedor.id_proveedor=ingreso.id_proveedor\n" +
//                    "inner join usuario on usuario.id_usuario=ingreso.id_usuario\n" +
//                    "inner join tipocompra on tipocompra.id_tipo_compra=ingreso.id_tipo_compra";
         String sql="select * from ingreso";
    try{
        cn=conn.connx();
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        Object[]proveedor=new Object[6];
        modelo=(DefaultTableModel)TablaIngresos.getModel();
        while(rs.next()){
//        proveedor[0]=rs.getInt("id_ingreso");
//        proveedor[1]=rs.getString("nombre_proveedor");
//        proveedor[2]=rs.getString("nombre_usuario");
//        proveedor[3]=rs.getString("nombre_tipo_compra");
//        proveedor[4]=rs.getString("fecha_compra");
//        proveedor[5]=rs.getString("codigo");
        
        proveedor[0]=rs.getInt("id_ingreso");
        proveedor[1]=rs.getString("id_proveedor");
        proveedor[2]=rs.getString("id_usuario");
        proveedor[3]=rs.getString("id_tipo_compra");
        proveedor[4]=rs.getString("fecha_compra");
        proveedor[5]=rs.getString("codigo");
        modelo.addRow(proveedor);
        
        }
        TablaIngresos.setModel(modelo);
        
    }catch (Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
     public void ModificarIngreso(){
         String proveedor=txtIdIngreso.getText();
     String usuario=txtUser.getText();
     String compra=txtTCompra.getText();
     String fecha=txtFecha.getText();
     String codigo=txtCode.getText();
         String sql="update ingreso set id_proveedor='"+proveedor+"',id_usuario='"+usuario+"',id_tipo_compra='"+compra+"',fecha_compra='"+fecha+"',codigo='"+codigo+"' where id_ingreso="+id;
         if (proveedor.equals("")||usuario.equals("")||compra.equals("")||fecha.equals("")||codigo.equals("")) {
             javax.swing.JOptionPane.showMessageDialog(null, "No deben haber campos vacios");
         }else{
             try{
                 cn=conn.connx();
                 st=cn.createStatement();
                 st.executeUpdate(sql);
                 javax.swing.JOptionPane.showMessageDialog(null, "El ingreso ha sido actualizado");
                 LimpiarTable();
             }catch(Exception e){}
         }
     }
     public void EliminarIngreso(){
         int filaS=TablaIngresos.getSelectedRow();
         if (filaS==-1) {
                 javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para eliminar");
         }else{
             String sql="delete from ingreso where id_ingreso="+id;
             try{
                 cn=conn.connx();
                 st=cn.createStatement();
                 st.executeUpdate(sql);
                 javax.swing.JOptionPane.showMessageDialog(null, "El ingreso ha sido eliminado");
                 LimpiarTable();
             }catch(Exception e){}
         }
     }
     public void CancelarIngreso(){
         this.txtProveedor.setText("");
         this.txtUser.setText("");
         this.txtTCompra.setText("");
          this.txtFecha.setText("");
         this.txtCode.setText("");
         
     }
     
     /////////////////////////////DETALLE------------------------------------------------------------------------------------------------------
     
     public void ListarIngresosDetalle(){
         String sql="select id_ingreso,codigo from ingreso";
    try{
        cn=conn.connx();
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        Object[]proveedor=new Object[2];
        modelo=(DefaultTableModel)TableDetalle.getModel();
        while(rs.next()){
        proveedor[0]=rs.getInt("id_ingreso");
        proveedor[1]=rs.getString("codigo");

        modelo.addRow(proveedor);
        
        }
        TableDetalle.setModel(modelo);
        
    }catch (Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
     public void ListarProductoDetalle(){
         String sql="select id_producto,nombre_producto,nombre_marca,stock from producto\n" +
                        "inner join marca on marca.id_marca=producto.id_marca";
    try{
        cn=conn.connx();
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        Object[]proveedor=new Object[4];
        modelo=(DefaultTableModel)TableDetalle.getModel();
        while(rs.next()){
        proveedor[0]=rs.getInt("id_producto");
        proveedor[1]=rs.getString("nombre_producto");
        proveedor[2]=rs.getString("nombre_marca");
        proveedor[3]=rs.getString("stock");
        modelo.addRow(proveedor);
        
        }
        TableDetalle.setModel(modelo);
        
    }catch (Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
     public void listarDetalle(){
         String sql="select * from detalleingreso";
    try{
        cn=conn.connx();
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        Object[]proveedor=new Object[5];
        modelo2=(DefaultTableModel)jTable1.getModel();
        while(rs.next()){
        proveedor[0]=rs.getInt("id_detalle_ingreso");  
        proveedor[1]=rs.getInt("id_ingreso");
        proveedor[2]=rs.getString("id_producto");
        proveedor[3]=rs.getString("cantidad");
        proveedor[4]=rs.getString("precio_compra");
        modelo2.addRow(proveedor);       
        }
        jTable1.setModel(modelo2);
        
    }catch (Exception e){
                   
        }
    }
     public void AgregarDetalle(){
     String ing=txtIngreso.getText();
     String pro=txtProducto.getText();
     String cant=txtCantidad.getText();
     String pc=txtPrecioCompra.getText();
     String nuevo= txtNuevoStock.getText();
         if (ing.equals("")||pro.equals("")||cant.equals("")||pc.equals("")||nuevo.equals("")) {
             javax.swing.JOptionPane.showMessageDialog(null,"Debe ingresar los capmpos que estan vacios");
         }else {
                String sql="insert into detalleingreso (id_ingreso,id_producto,cantidad,precio_compra) values ('"+ing+"','"+pro+"','"+cant+"','"+pc+"')";
                try{
                        cn=conn.connx();
                        st=cn.createStatement();
                        st.executeUpdate(sql);
                        LimpiarTableDetalle();
                        
                        javax.swing.JOptionPane.showMessageDialog(null, "El detalle ha sido ingresado con exito");
                        
                }catch(Exception e){
                 //JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
                }
         }
     }
     public void LimpiarTableDetalle(){
         for (int i = 0; i <= jTable1.getRowCount(); i++) {
             modelo2.removeRow(i);
             i=i-1;
         }
     }
      public void LimpiarDetalle(){
         for (int i = 0; i <= jTable1.getRowCount(); i++) {
             modelo2.removeRow(i);
             i=i-1;
         }
     }
     public void ModificarStock(){
         String cant=txtCantidad.getText();
         String stockActual=txtStockActual.getText();
         String nuevo=txtNuevoStock.getText();
        nuevo=txtNuevoStock.getText();
         String sql="update producto set stock='"+nuevo+"' where id_producto="+id;
         if (nuevo.equals("")||stockActual.equals("")||cant.equals("")) {
             javax.swing.JOptionPane.showMessageDialog(null, "No deben haber campos vacios");
         }else{
             try{
                 cn=conn.connx();
                 st=cn.createStatement();
                 st.executeUpdate(sql);
                 //LimpiarTableDetalle();
                 javax.swing.JOptionPane.showMessageDialog(null, "El stock ha sido actualizado");                
             }catch(Exception e){}
         }
     }
     public void ModificarDetalle(){
         String ing=txtIngreso.getText();
         String pro=txtProducto.getText();
         String cant=txtCantidad.getText();
         String precio=txtPrecioCompra.getText();
         String sql="update detalleingreso set id_ingreso='"+ing+"',id_producto='"+pro+"',cantidad='"+cant+"',precio_compra='"+precio+"' where id_detalle_ingreso="+id;
         if (ing.equals("")||pro.equals("")||cant.equals("")||precio.equals("")) {
             javax.swing.JOptionPane.showMessageDialog(null, "No deben haber campos vacios");
         }else{
             try{
                 cn=conn.connx();
                 st=cn.createStatement();
                 st.executeUpdate(sql);
                 javax.swing.JOptionPane.showMessageDialog(null, "El detalle ha sido actualizado");
                 LimpiarTableDetalle();
             }catch(Exception e){}
         }
     }
      public void EliminarDetalle(){
         int filaS=jTable1.getSelectedRow();
         if (filaS==-1) {
                 javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para eliminar");
         }else{
             String sql="delete from detalleingreso where id_detalle_ingreso="+id;
             try{
                 cn=conn.connx();
                 st=cn.createStatement();
                 st.executeUpdate(sql);
                 javax.swing.JOptionPane.showMessageDialog(null, "El detalle ha sido eliminado");
                 LimpiarTableDetalle();
             }catch(Exception e){}
         }
     }
     public void CancelarDetalle(){
         this.txtIngreso.setText("");
         this.txtProducto.setText("");
         this.txtCantidad.setText("");
         this.txtPrecioCompra.setText("");
         this.txtStockActual.setText("");
         this.txtNuevoStock.setText("");
         
     }
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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcelIngresos;
    private javax.swing.JButton DeleteIngresos1;
    private javax.swing.JButton EditIngresos;
    private javax.swing.JButton SaveIngresos;
    private javax.swing.JTable TablaIngresos;
    private javax.swing.JTable TableDetalle;
    private javax.swing.JButton VerIngreso;
    private javax.swing.JButton aggIngreso;
    private javax.swing.JButton aggProducto;
    private javax.swing.JButton aggProveedor;
    private javax.swing.JButton aggTcompra;
    private javax.swing.JButton aggUser;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnEdit2;
    private javax.swing.JButton btnSave8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBIngreso;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtBProducto;
    private javax.swing.JTextField txtBTC;
    private javax.swing.JTextField txtBU;
    private javax.swing.JButton txtCancel2;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdDetalle;
    private javax.swing.JTextField txtIdIngreso;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNuevoStock;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtStockActual;
    private javax.swing.JTextField txtTCompra;
    private javax.swing.JTextField txtUser;
    private javax.swing.JButton verIngreso;
    private javax.swing.JButton verProducto;
    private javax.swing.JButton verProveedor;
    private javax.swing.JButton verTCompra;
    private javax.swing.JButton verUser;
    // End of variables declaration//GEN-END:variables
}
