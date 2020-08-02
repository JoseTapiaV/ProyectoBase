/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.ProductoProveedor;

import ec.edu.ups.controlador.ProvProdControlador;
import ec.edu.ups.controlador.ProveedorControlador;
import ec.edu.ups.modelo.ProductoProveedor;
import ec.edu.ups.vista.Principal.Administrador;
import java.text.SimpleDateFormat;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edison
 */
public class ListarPP extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListarPP
     */
    public static String x;
    private ProvProdControlador provProdControlador;
    NuevoModelo modelo;
    public ListarPP(ProvProdControlador provProdControlador) throws Exception {
        initComponents();
          x = "x";
        int a = Administrador.desktop.getWidth() - this.getWidth();
        int b = Administrador.desktop.getHeight() - this.getHeight();

        setLocation(a / 2, b / 2);
        setVisible(true);
        
        this.provProdControlador=provProdControlador;
         modelo = new NuevoModelo();
        Object[] columnas = {"CODIGO", "NUMERO FACTURA","FECHA LLEGADA","CANTIDAD","PROVEEDOR","PRODUCTO"};
        modelo.setColumnIdentifiers(columnas);
        tblProdProv.setModel(modelo);
        llenarTabla();
    }
    
     public void llenarTabla() throws Exception {

        Set<ProductoProveedor> Lista = provProdControlador.listaProveedor();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (ProductoProveedor pp : Lista) {
        
        String fecha =sdf.format(pp.getFechaLlegada());
            Object[] datos = {
              
                pp.getId(),
                pp.getNroFActura(),
                fecha,
                pp.getCantidad(),
                pp.getProveedor().getResponsable(),
                pp.getProducto().getNombre()};
            modelo.addRow(datos);
        }
    }
      /**
     * Metodo para que la tabla no sea editable
     */
    public class NuevoModelo extends DefaultTableModel {

        /**
         * Define la posibilidad de editar las columnas
         */
        public final boolean[] TblColums = {false, false,false,false,false,false};

        @Override
        public boolean isCellEditable(int row, int column) {
            return this.TblColums[column];
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdProv = new javax.swing.JTable();
        btCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("LISTAR REGISTROS");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tblProdProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Numero de Factura", "Fecha de llegada", "Cantidad", "Producto", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdProv);

        btCancelar.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        btCancelar.setText("Regresar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addGap(289, 289, 289))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btCancelar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        x = null;
    }//GEN-LAST:event_btCancelarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        x=null;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdProv;
    // End of variables declaration//GEN-END:variables
}