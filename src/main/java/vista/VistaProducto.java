/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.controlCategoria;
import controlador.controlProducto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Producto;

/**
 *
 * @author freyber
 */
public class VistaProducto extends javax.swing.JFrame {

    /**
     * Creates new form VistaProducto
     */
    public VistaProducto() {
        initComponents();
        this.Listar();
        this.llenarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        javax.swing.JButton btnInsertar = new javax.swing.JButton();
        cbxCategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnomConsulta = new javax.swing.JTextField();
        javax.swing.JButton btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        javax.swing.JButton btnConsultar1 = new javax.swing.JButton();
        labelNombreActualizar = new javax.swing.JLabel();
        txtnCantidadActualizar = new javax.swing.JTextField();
        txtnomActualizar = new javax.swing.JTextField();
        txtprecioActualizar = new javax.swing.JTextField();
        LabelCantidadActualizar = new javax.swing.JLabel();
        LabelPrecioActualizar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblIdActualizar = new javax.swing.JLabel();
        javax.swing.JButton btnActualizar = new javax.swing.JButton();
        javax.swing.JButton btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Registro");
        setLocation(new java.awt.Point(50, 50));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setToolTipText("");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnInsertar.setBackground(new java.awt.Color(51, 255, 51));
        btnInsertar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsertar.setText("Registrar Producto");
        btnInsertar.setToolTipText("");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Categoria");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(txtPrecio)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnInsertar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44)
                .addComponent(btnInsertar)
                .addGap(65, 65, 65))
        );

        jTabbedPane1.addTab("Registro", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Consulta de Productos");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nombre");
        jLabel7.setToolTipText("");

        txtnomConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnomConsulta.setToolTipText("");

        btnListar.setBackground(new java.awt.Color(51, 255, 51));
        btnListar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnListar.setText("Actualizar");
        btnListar.setToolTipText("");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnConsultar1.setBackground(new java.awt.Color(51, 255, 51));
        btnConsultar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar1.setText("Consultar");
        btnConsultar1.setToolTipText("");
        btnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar1ActionPerformed(evt);
            }
        });

        labelNombreActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNombreActualizar.setText("Nombre");

        txtnCantidadActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnCantidadActualizar.setToolTipText("");

        txtnomActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnomActualizar.setToolTipText("");

        txtprecioActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprecioActualizar.setToolTipText("");

        LabelCantidadActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelCantidadActualizar.setText("Cantidad");

        LabelPrecioActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPrecioActualizar.setText("Precio");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Id:");

        lblIdActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdActualizar.setText("0");

        btnActualizar.setBackground(new java.awt.Color(51, 255, 51));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 255, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnomConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnConsultar1)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnListar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIdActualizar))
                            .addComponent(labelNombreActualizar))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnomActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelCantidadActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnCantidadActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelPrecioActualizar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprecioActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnomConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListar)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprecioActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombreActualizar)
                            .addComponent(txtnCantidadActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCantidadActualizar)
                            .addComponent(LabelPrecioActualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblIdActualizar))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))
                        .addGap(30, 30, 30))))
        );

        jTabbedPane1.addTab("Consultar", null, jPanel2, "");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        try{
            controlProducto objControlP = new controlProducto();
            Categoria objCategoria = new Categoria();
            String nombre = this.txtNombre.getText();
            String cantidad = this.txtCantidad.getText();
            String Precio = this.txtPrecio.getText();
            if(this.cbxCategoria.getSelectedItem().equals("Seleccion")){
                JOptionPane.showMessageDialog(null,"Error: seleccione una categoria valida");
            } 
            else if(this.cbxCategoria.getSelectedItem().equals("Lacteos")){
                    objCategoria.setIdCategoria(1);
                    objCategoria.setNombreCategoria("Lacteos");
            }
            else if (this.cbxCategoria.getSelectedItem().equals("Abarrotes")){
                    objCategoria.setIdCategoria(2);
                    objCategoria.setNombreCategoria("Abarrotes");        
            }
            else if (this.cbxCategoria.getSelectedItem().equals("Carnicos")){
                    objCategoria.setIdCategoria(3);
                    objCategoria.setNombreCategoria("Carnicos");
            }
            else if (this.cbxCategoria.getSelectedItem().equals("Aseo")){
                    objCategoria.setIdCategoria(4);
                    objCategoria.setNombreCategoria("Aseo");
            }
            objControlP.crear(nombre, cantidad, Precio, objCategoria);
            JOptionPane.showMessageDialog(null, "Insertado Correctamente");
            
            this.txtCantidad.setText("");
            this.txtNombre.setText("");
            this.txtPrecio.setText("");
            this.cbxCategoria.setSelectedItem("Seleccione");
            
        }
        catch(Exception error) {
        JOptionPane.showMessageDialog(null, "Error!!"+error);
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
        // TODO add your handling code here:
        try{
        controlProducto controlP = new controlProducto();
        DefaultTableModel tabla = new DefaultTableModel();
        ArrayList<Producto> consultarProducto = new ArrayList<>();
        
        
        String nombre = this.txtnomConsulta.getText();
        consultarProducto = controlP.consultar(nombre);
        
        tabla.addColumn("Id");
        tabla.addColumn("Nombre");
        tabla.addColumn("Cantidad");
        tabla.addColumn("Precio");
        this.jTable1.setModel(tabla);
        
        String[] dato = new String[4];
        for(int i=0; i<consultarProducto.size(); i++){
        dato[0] = String.valueOf(consultarProducto.get(i).getIdProducto());
        dato[1] = consultarProducto.get(i).getNombreProducto();
        dato[2] = String.valueOf(consultarProducto.get(i).getCantidadProducto());
        dato[3] = String.valueOf(consultarProducto.get(i).getPrecioProducto());
        tabla.addRow(dato);
        }
        }
       catch(Exception error) {
        JOptionPane.showMessageDialog(null, "Error!!"+error);
        } 
    }//GEN-LAST:event_btnConsultar1ActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        this.Listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int fila = this.jTable1.getSelectedRow();
        
        this.lblIdActualizar.setText(this.jTable1.getValueAt(fila, 0).toString());
        this.txtnomActualizar.setText(this.jTable1.getValueAt(fila, 1).toString());
        this.txtnCantidadActualizar.setText(this.jTable1.getValueAt(fila, 2).toString());
        this.txtprecioActualizar.setText(this.jTable1.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        try{
            controlProducto objcontrolProducto = new controlProducto();
            
            String id = this.lblIdActualizar.getText();
            String nombre = this.txtnomActualizar.getText();
            String cantidad = this.txtnCantidadActualizar.getText();
            String precio = this.txtprecioActualizar.getText();
            
            objcontrolProducto.actualizar(id, nombre, cantidad, precio);
            JOptionPane.showMessageDialog(null, "Actualizado Correctamente");
            
            this.lblIdActualizar.setText("0");
            this.txtnomActualizar.setText("");
            this.txtnCantidadActualizar.setText("");
            this.txtprecioActualizar.setText("");
            this.Listar();
        }
         catch(Exception error) {
        JOptionPane.showMessageDialog(null, "Error!!"+error);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         try{
            controlProducto objcontrolProducto = new controlProducto();
            
            String id = this.lblIdActualizar.getText();
            
            
            objcontrolProducto.eliminar(id);
            JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
            
            this.lblIdActualizar.setText("0");
            this.txtnomActualizar.setText("");
            this.txtnCantidadActualizar.setText("");
            this.txtprecioActualizar.setText("");
            this.Listar();
        }
         catch(Exception error) {
        JOptionPane.showMessageDialog(null, "Error!!"+error);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProducto().setVisible(true);
            }
        });
    }
    public void Listar(){
        try{
        controlProducto controlP = new controlProducto();
        DefaultTableModel tabla = new DefaultTableModel();
        ArrayList<Producto> listaProducto = new ArrayList<>();
        listaProducto = controlP.listar();
        
        tabla.addColumn("Id");
        tabla.addColumn("Nombre");
        tabla.addColumn("Cantidad");
        tabla.addColumn("Precio");
        this.jTable1.setModel(tabla);
        
        String[] dato = new String[4];
        for(int i=0; i<listaProducto.size(); i++){
        dato[0] = String.valueOf(listaProducto.get(i).getIdProducto());
        dato[1] = listaProducto.get(i).getNombreProducto();
        dato[2] = String.valueOf(listaProducto.get(i).getCantidadProducto());
        dato[3] = String.valueOf(listaProducto.get(i).getPrecioProducto());
        tabla.addRow(dato);
        }
        }
       catch(Exception error) {
        JOptionPane.showMessageDialog(null, "Error!!"+error);
        } 
    }
    public void llenarCombo(){
        try{
            controlCategoria controlCat = new controlCategoria();
            ArrayList<Categoria> listaCbx = new ArrayList<>();
            listaCbx = controlCat.Cargarcbox();
            for (int i=0; i<listaCbx.size(); i++){
                this.cbxCategoria.addItem(listaCbx.get(i).getNombreCategoria());
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error);
            
      }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCantidadActualizar;
    private javax.swing.JLabel LabelPrecioActualizar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelNombreActualizar;
    private javax.swing.JLabel lblIdActualizar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtnCantidadActualizar;
    private javax.swing.JTextField txtnomActualizar;
    private javax.swing.JTextField txtnomConsulta;
    private javax.swing.JTextField txtprecioActualizar;
    // End of variables declaration//GEN-END:variables
}
