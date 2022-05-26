/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.sise.gui;

import com.edu.sise.entidades.Provincia;
import com.edu.sise.entidades.Tutor;
import com.edu.sise.logic.ProvinciaLogic;
import com.edu.sise.logic.TutorLogic;
import java.time.LocalDate;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class ifrmTutores extends javax.swing.JInternalFrame {
    
    private TutorLogic logica;
    private ProvinciaLogic logicaProvincia;

    /**
     * Creates new form ifrmTutors
     */
    public ifrmTutores() {
        initComponents();
        logica = new TutorLogic();
        logicaProvincia = new ProvinciaLogic();
        
        //lenar el combo departamento al iniciar el ifrm
        logicaProvincia.llenarComboProvincia(cboProvincias);
        logica.imprimir(tbLista);
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
        tbLista = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboProvincias = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPapellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSapellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        dtpFnacimiento = new org.jdatepicker.JDatePicker();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCargaMasiva = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();

        tbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLista);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de Tutores"));

        jLabel1.setText("ID");

        txtId.setEditable(false);
        txtId.setEnabled(false);

        jLabel2.setText("NOMBRE");

        jLabel3.setText("PROVINCIAS:");

        jLabel4.setText("DNI");

        jLabel5.setText("P. APELLIDO");

        jLabel6.setText("S. APELLIDO");

        jLabel7.setText("F.NAC");

        jLabel8.setText("TELEFONO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDni)
                            .addComponent(txtId))
                        .addGap(227, 227, 227))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dtpFnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNombre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)
                                .addComponent(cboProvincias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 40, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtSapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtpFnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Opciones"));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCargaMasiva.setText("CARGA MASIVA");
        btnCargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargaMasiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnCargaMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        btnBusqueda.setText("OK");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBusqueda)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBusqueda)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(262, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaMouseClicked
        // TODO add your handling code here:
        int fila = -1;
        int id_tutor=0, id_prov=0;
        String dni="", nombre="", papellido="",sapellido="",telefono="";
        LocalDate fnacimiento;

        //entrada
        fila = tbLista.getSelectedRow();
        int x = 0;
        //proceso y salida
        if (fila>=0){
            id_tutor = Integer.parseInt(tbLista.getValueAt(fila, x++)+"");
            dni = tbLista.getValueAt(fila, x++)+"";
            nombre = tbLista.getValueAt(fila, x++)+""; 
            papellido = tbLista.getValueAt(fila, x++)+"";
            sapellido = tbLista.getValueAt(fila, x++)+"";
            fnacimiento = LocalDate.parse(tbLista.getValueAt(fila, x++)+"");
            telefono = tbLista.getValueAt(fila, x++)+"";
            id_prov = Integer.parseInt(tbLista.getValueAt(fila, x++)+"");
            
            
        txtId.setText(id_tutor+"");
        txtDni.setText(dni);
        txtNombre.setText(nombre);
        txtPapellido.setText(papellido);
        txtSapellido.setText(sapellido);
        dtpFnacimiento.getModel().setDate(fnacimiento.getYear(),fnacimiento.getMonthValue()-1, fnacimiento.getDayOfMonth());
        dtpFnacimiento.getModel().setSelected(true);
        txtTelefono.setText(telefono);
        logicaProvincia.seleccionarItemCbo(cboProvincias, id_prov);
        
                    
        }
        
       
        

    }//GEN-LAST:event_tbListaMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
       int anio, mes, dia;
       anio = dtpFnacimiento.getModel().getYear();
       mes = dtpFnacimiento.getModel().getMonth()+1;
       dia = dtpFnacimiento.getModel().getDay();
       
       Tutor o = new Tutor(
               Integer.parseInt((txtId.getText().isEmpty())?"-1":txtId.getText()),
                txtDni.getText(),
                txtNombre.getText(),
                txtPapellido.getText(),
                txtSapellido.getText(),
                LocalDate.of(anio,mes,dia),
                txtTelefono.getText(),
                
                //id_depa
                ((Provincia)cboProvincias.getSelectedItem()).getId_prov()
                );
        boolean rpta = logica.agregarTutor(o);
        if(rpta){
            JOptionPane.showMessageDialog(this, "Se registro correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo registrar");
            
        
    }
       logica.imprimir(tbLista);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        logica.imprimir(tbLista);
        
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        
      int anio, mes, dia;
       anio = dtpFnacimiento.getModel().getYear();
       mes = dtpFnacimiento.getModel().getMonth()+1;
       dia = dtpFnacimiento.getModel().getDay();
       
       Tutor o = new Tutor(
               Integer.parseInt((txtId.getText().isEmpty())?"-1":txtId.getText()),
                txtDni.getText(),
                txtNombre.getText(),
                txtPapellido.getText(),
                txtSapellido.getText(),
                LocalDate.of(anio,mes,dia),
                txtTelefono.getText(),
                
                //id_depa
                ((Provincia)cboProvincias.getSelectedItem()).getId_prov()
                );
        boolean rpta = logica.modificarTutor(o);
        if(rpta){
            JOptionPane.showMessageDialog(this, "Se modifico correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo modificar");
            
        
    }
       logica.imprimir(tbLista); 

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         int respuesta = JOptionPane.showConfirmDialog(
                 this, "¿Desea eliminar el registro?",
                "SISTEMAS",JOptionPane.YES_NO_OPTION);
        if(respuesta== JOptionPane.YES_OPTION){
            int id = Integer.parseInt(txtId.getText());
            boolean rpta = logica.eliminarTutor(id);
            if(rpta){
                JOptionPane.showMessageDialog(this, "Se elimino correctamente");
            }else{
                JOptionPane.showMessageDialog(this, "No se puedo eliminar");
            }
        }
        logica.imprimir(tbLista);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaActionPerformed
        // TODO add your handling code here:
        JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(this);
        
       String rutaArchivo = buscador.getSelectedFile().getAbsolutePath();
       //logica carga el archivo en base de datos
       
       int resultados = logica.cargaMasiva(rutaArchivo);
       
       if(resultados==0)
           JOptionPane.showMessageDialog(this, "No se  pudo realizar carga masiva");
       else
           JOptionPane.showMessageDialog(this, "Se registraron: " + resultados);
       
       logica.imprimir(tbLista);
       
        
        
    }//GEN-LAST:event_btnCargaMasivaActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        // TODO add your handling code here:
        logica.imprimir(tbLista, txtBusqueda.getText());
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        // TODO add your handling code here:
        logica.imprimir(tbLista, txtBusqueda.getText());
    }//GEN-LAST:event_btnBusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnCargaMasiva;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboProvincias;
    private org.jdatepicker.JDatePicker dtpFnacimiento;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLista;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPapellido;
    private javax.swing.JTextField txtSapellido;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
