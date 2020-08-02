/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.Factura;

import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.controlador.FCabeceraControlador;
import ec.edu.ups.controlador.FDetalleControlador;
import ec.edu.ups.modelo.FCabecera;
import ec.edu.ups.modelo.FDetalle;
import static ec.edu.ups.vista.Factura.AnularFac.rs;
import ec.edu.ups.vista.Principal.Administrador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//Hola

/**
 *
 * @author Domenica
 */
public class AnularFactura extends javax.swing.JInternalFrame {

    public static String x;
    private FCabeceraControlador fCabContr;

    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    //String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "BaseFarmacia";
    String password = "bf123";
    private FCabeceraControlador fCabeceraControlador = new FCabeceraControlador(url, user, password);
    private FCabecera fcab = new FCabecera();
    private FDetalleControlador fdetc = new FDetalleControlador(url, user, password);
    private ControladorProducto controladorProducto;

    static Connection cn;
    static Statement s;
    static ResultSet rs;

    private List<String> l;

    /**
     * Creates new form AnularFactura
     */
    public AnularFactura(FCabeceraControlador fCabeceraControlador, ControladorProducto controladorProducto) {
        initComponents();
        x = "x";
        int a = Administrador.desktop.getWidth() - this.getWidth();
        int b = Administrador.desktop.getHeight() - this.getHeight();

        setLocation(a / 2, b / 2);
        setVisible(true);
        this.fCabeceraControlador = fCabeceraControlador;
        this.controladorProducto = controladorProducto;
        l = new ArrayList<>();

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
        jPanel3 = new javax.swing.JPanel();
        lblCedC5 = new javax.swing.JLabel();
        txtCedC = new javax.swing.JTextField();
        lblNomC5 = new javax.swing.JLabel();
        txtNomC = new javax.swing.JTextField();
        lblTelC5 = new javax.swing.JLabel();
        txtTelC = new javax.swing.JTextField();
        txtApeC = new javax.swing.JTextField();
        lblApeC5 = new javax.swing.JLabel();
        lblDirC5 = new javax.swing.JLabel();
        txtDirC = new javax.swing.JTextField();
        lblRuc = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        lblTot = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnCancelarF = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblServF = new javax.swing.JTable();
        lblSub = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        lblIva = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblCedC6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();

        jPanel1.setMinimumSize(new java.awt.Dimension(450, 500));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblCedC5.setBackground(new java.awt.Color(255, 255, 255));
        lblCedC5.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblCedC5.setText("Cedula Cliente");

        txtCedC.setEditable(false);
        txtCedC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        lblNomC5.setBackground(new java.awt.Color(255, 255, 255));
        lblNomC5.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblNomC5.setText("Nombre Cliente");

        txtNomC.setEditable(false);
        txtNomC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtNomC.setEnabled(false);

        lblTelC5.setBackground(new java.awt.Color(255, 255, 255));
        lblTelC5.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblTelC5.setText("Telefono Cliente");

        txtTelC.setEditable(false);
        txtTelC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtTelC.setEnabled(false);

        txtApeC.setEditable(false);
        txtApeC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtApeC.setEnabled(false);

        lblApeC5.setBackground(new java.awt.Color(255, 255, 255));
        lblApeC5.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblApeC5.setText("Apellido Cliente");

        lblDirC5.setBackground(new java.awt.Color(255, 255, 255));
        lblDirC5.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblDirC5.setText("Direccion Cliente");

        txtDirC.setEditable(false);
        txtDirC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtDirC.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblTelC5)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelC))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblNomC5)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomC, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblApeC5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(txtApeC, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblDirC5)
                                .addGap(18, 18, 18)
                                .addComponent(txtDirC))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(lblCedC5)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedC, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedC5)
                    .addComponent(txtCedC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblApeC5)
                        .addComponent(txtApeC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNomC5)
                        .addComponent(txtNomC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDirC5)
                        .addComponent(txtDirC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelC5)
                        .addComponent(txtTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblRuc.setBackground(new java.awt.Color(255, 255, 255));
        lblRuc.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblRuc.setText("RUC Factura");

        txtIva.setEditable(false);
        txtIva.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtIva.setEnabled(false);

        txtRuc.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        lblTot.setBackground(new java.awt.Color(255, 255, 255));
        lblTot.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblTot.setText("Total");

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblFecha.setText("Fecha");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtTotal.setEnabled(false);

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo.setText("Buscar Factura");

        btnCancelarF.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnCancelarF.setText("Cancelar");
        btnCancelarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFActionPerformed(evt);
            }
        });

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtFecha.setEnabled(false);

        tblServF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "0", null, null, null, null}
            },
            new String [] {
                "codigo", "cantidad", "nombre", "precio u", "IvaProducto", "totalIP"
            }
        ));
        tblServF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblServFKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblServF);

        lblSub.setBackground(new java.awt.Color(255, 255, 255));
        lblSub.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblSub.setText("Subtotal");

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtSubtotal.setEnabled(false);

        lblIva.setBackground(new java.awt.Color(255, 255, 255));
        lblIva.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblIva.setText("I.V.A");

        txtEstado.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        lblCedC6.setBackground(new java.awt.Color(255, 255, 255));
        lblCedC6.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblCedC6.setText("Estado Factura");

        btnBuscar.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAnular.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(lblRuc)
                .addGap(18, 18, 18)
                .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addGap(18, 18, 18)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(461, 461, 461)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblSub)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblIva)
                                                    .addGap(16, 16, 16)
                                                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblTot)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCedC6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(btnAnular)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancelarF)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRuc)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFecha)
                                .addComponent(btnBuscar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSub)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTot))
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCedC6)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarF)
                            .addComponent(btnAnular))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFActionPerformed
        this.setVisible(false);
        this.dispose();
        x = null;
    }//GEN-LAST:event_btnCancelarFActionPerformed

    private void tblServFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblServFKeyReleased

    }//GEN-LAST:event_tblServFKeyReleased

    private void btnBuscarCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCFActionPerformed

    }//GEN-LAST:event_btnBuscarCFActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

    }//GEN-LAST:event_btnCrearActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        x = null;
    }//GEN-LAST:event_formInternalFrameClosing

    public void llenarTabla() {

         try {
            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel();
            this.tblServF.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            // String url = "jdbc:oracle:thin:@localhost:1521:XE";
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            cn = DriverManager.getConnection(url, user, password);
            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
            int ruc = Integer.parseInt(txtRuc.getText());
            rs = s.executeQuery("SELECT * FROM SDF_FACTURAS_DETALLES WHERE sdf_factura_cabeceras_fac_id = " + ruc + "");
            System.out.println("Base: " + rs);
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                l.add(rs.getInt("SDF_PRODUCTOS_PRO_ID") + " " + rs.getInt("FDT_CANTIDAD"));
                //System.out.println(rs.getInt("SDF_PRODUCTOS_PRO_ID")+" "+rs.getInt("FDT_CANTIDAD"));
                modelo.addRow(fila);
            }
            rs.close();
            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void vaciarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) tblServF.getModel();
        int filas = tblServF.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }

    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        FCabeceraControlador FCaCon = new FCabeceraControlador(url, user, password);
        FCabecera fcab = new FCabecera();
        int ruc2 = Integer.parseInt(txtRuc.getText());
        fcab = FCaCon.BuscarFacCab(ruc2);

        if (fcab != null) {
            //FacturaCabecera
            txtFecha.setText(String.valueOf(fcab.getFecha()));
            txtSubtotal.setText(Double.toString(fcab.getSubtotal()));
            txtIva.setText(Double.toString(fcab.getIva()));
            txtTotal.setText(Double.toString(fcab.getTotal()));
            //  String est = txtEstado.getText();
//            fcab.setEstado(est.charAt(0));
            txtEstado.setText(String.valueOf(fcab.getEstado()));
            //Clientes
            txtCedC.setText(String.valueOf(fcab.getPer().getCedula()));
            txtApeC.setText(String.valueOf(fcab.getPer().getApellidos()));
            txtNomC.setText(String.valueOf(fcab.getPer().getNombres()));
            txtDirC.setText(String.valueOf(fcab.getPer().getDireccion()));
            txtTelC.setText(String.valueOf(fcab.getPer().getTelefono()));

            //Llenar Factura Detalle
            vaciarTabla();
            llenarTabla();
        } else {

            JOptionPane.showMessageDialog(this, "El RUC no existe en la base de datos");

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void bloquear() {

        txtEstado.setEnabled(true);
        txtApeC.setEnabled(true);
        txtCedC.setEnabled(true);
        txtDirC.setEnabled(true);
        txtFecha.setEnabled(true);
        txtIva.setEnabled(true);
        txtNomC.setEnabled(true);
        txtNomC.setEnabled(true);
        txtSubtotal.setEnabled(true);
        txtTelC.setEnabled(true);
        txtTotal.setEnabled(true);
        tblServF.setEnabled(true);

        txtEstado.setEditable(true);
        txtApeC.setEditable(true);
        txtCedC.setEditable(true);
        txtDirC.setEditable(true);
        txtFecha.setEditable(true);
        txtIva.setEditable(true);
        txtNomC.setEditable(true);
        txtNomC.setEditable(true);
        txtSubtotal.setEditable(true);
        txtTelC.setEditable(true);
        txtTotal.setEditable(true);
        // tblServF.setEditable(true);

    }
    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed

        //factura
        //agregarDatos Factura Cabecera
         if (txtEstado.getText().equals("T")) {
            FCabeceraControlador fcabc = new FCabeceraControlador(url, user, password);
            int ruc = Integer.parseInt(txtRuc.getText());
            char estado = 'F';
            fcab.setId(ruc);
            fcab.setEstado(estado);
            txtEstado.setText("F");
            try {

                fcabc.modificar(fcab);

            } catch (SQLException ex) {

                ex.printStackTrace();

            }
            for (int i = 0; i < l.size(); i++) {
                String[] p = l.get(i).split(" ");
                System.out.println("ii*************" + controladorProducto.Buscar(Integer.parseInt(p[0])).getId() + " " + Integer.parseInt(p[1]) + "\n");
                try {
                    controladorProducto.modificarStock(controladorProducto.Buscar(Integer.parseInt(p[0])),
                            Integer.parseInt(p[1]));
                } catch (SQLException ex) {
                    System.out.println("mod stock");
                }
            }
            JOptionPane.showMessageDialog(this, "Factura Anulada con exito", "Anular Factura", JOptionPane.OK_OPTION);

            l = null;
        } else {
            JOptionPane.showMessageDialog(this, "Factura ya anulada", "Anular Factura", JOptionPane.OK_OPTION);
        }

        bloquear();
        

    }//GEN-LAST:event_btnAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApeC5;
    private javax.swing.JLabel lblCedC5;
    private javax.swing.JLabel lblCedC6;
    private javax.swing.JLabel lblDirC5;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblNomC5;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTelC5;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTot;
    private javax.swing.JTable tblServF;
    private javax.swing.JTextField txtApeC;
    private javax.swing.JTextField txtCedC;
    private javax.swing.JTextField txtDirC;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNomC;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTelC;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
