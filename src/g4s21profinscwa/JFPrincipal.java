/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package g4s21profinscwa;

import almacen.archivos;
import informacion.datos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Informacion.Info_nombre;
import informacion.info_direccion;

/**
 *
 * @author hp
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
     int estadoG = 0;
    List<datos> lista = new ArrayList<>();
    int fila = 0;
    
    public JFPrincipal() {   
        initComponents();
        btninsertar.setEnabled(false);
        btncancelar.setEnabled(false);
        estadotxt(false);
        archivos archivo = new archivos();
        lista = archivo.leer();
        CargarDatos();
        estadotxt(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btninsertar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtrfc = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txtcorreo1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtdireccion1 = new javax.swing.JTextField();
        txtdireccion2 = new javax.swing.JTextField();
        txtdireccion3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Brighly Crush", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("AGENDA");

        jLabel2.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel2.setText("Nombre(s)");

        jLabel3.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de Nacimiento");

        jLabel4.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel5.setText("RFC");

        jLabel6.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel6.setText("Direccion");

        jLabel7.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel7.setText("Sexo");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha de Nacimiento", "Correo", "RFC", "Direccion", "Apellido Materni", "Title 7", "Title 8", "Title 9"
            }
        ));
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                raton(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        btninsertar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btninsertar.setText("INSERTAR");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        btneditar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btneditar.setText("EDITAR");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnconsultar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnnuevo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnnuevo.setText("NUEVO");

        btncancelar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btncancelar.setText("CANCELAR");

        jLabel8.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel8.setText("Apellido Materno");

        jLabel9.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel9.setText("Apellido Paterno");

        jLabel10.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel10.setText("calle");

        jLabel11.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel11.setText("Correo");

        jLabel12.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel12.setText("municipio o alcadia");

        jLabel13.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel13.setText("Correo");

        jLabel14.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        jLabel14.setText("entidad federativa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancelar)
                .addGap(142, 142, 142))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtdireccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btninsertar)
                                        .addGap(93, 93, 93)
                                        .addComponent(btneditar)
                                        .addGap(84, 84, 84)
                                        .addComponent(btnconsultar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btneliminar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtfecha, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(71, 71, 71)
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel5)
                                                        .addGap(43, 43, 43))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(txtcorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel14)
                                                            .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(154, 154, 154)
                                                        .addComponent(jLabel1)
                                                        .addGap(18, 18, 18))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel9)
                                                        .addGap(140, 140, 140)))
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtdireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(186, 186, 186)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12)
                                    .addGap(42, 42, 42)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdireccion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncancelar)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsertar)
                    .addComponent(btneditar)
                    .addComponent(btnconsultar)
                    .addComponent(btneliminar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        btninsertar.setEnabled(false);
        btnconsultar.setEnabled(true);
        btneditar.setEnabled(false);
        btneliminar.setEnabled(true);
        estadotxt(true);
        estadoG=2;
       
    }//GEN-LAST:event_btneditarActionPerformed

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        // TODO add your handling code here:
       if (estadoG == 1) {
            
            Date fecha = this.dcFecha.getDate();
            DateFormat Formato = new SimpleDateFormat("dd-MM-yyyy");
            String fechafinal = Formato.format(fecha);
           Info_nombre nombres = new Info_nombre(txtNombres.getText(), txtApellidoP.getText(), txtApellidoM.getText());
           info_direccion direccion = new info_direccion(txtCalles.getText(), txtColonia.getText(), txtMunicipo.getText(), txtCP.getText(), txtEntidad.getText());  
              datos datos = new datos(nombres, fechafinal, txtCorreo.getText(), txtRFC.getText(), direccion) ;
            

            if (lista == null) {
                lista = new ArrayList<>();
            }
            lista.add(datos);
            archivos archivos = new archivos();
            if (archivos.grabar(lista)) {
                JOptionPane.showMessageDialog(null, "se grabo con exito", "informacion", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "error al  grabo", "informacion", JOptionPane.ERROR_MESSAGE);
            }
            btnNuevo.setEnabled(true);
            btnInsertar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);

            lista = archivos.leer();
            CargarDatos();
            estadotxt(false);
            
        }
        if (estadoG == 2) {
            Date fecha = this.dcFecha.getDate();
            DateFormat Formato = new SimpleDateFormat("dd-MM-yyyy");
            String fechafinal = Formato.format(fecha);
          Info_nombre nombres = new Info_nombre(txtNombres.getText(), txtApellidoP.getText(), txtApellidoM.getText());
           info_direccion direccion = new info_direccion(txtCalles.getText(), txtColonia.getText(), txtMunicipo.getText(), txtCP.getText(), txtEntidad.getText());  
          
          datos datos = new datos(nombres, fechafinal, txtCorreo.getText(), txtRFC.getText(), direccion);
              lista.set(fila, datos);
            archivos archivos = new archivos();
            if (archivos.grabar(lista)) {
                JOptionPane.showMessageDialog(null, "se actualizo con exito", "informacion", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "error al  actualizar", "informacion", JOptionPane.ERROR_MESSAGE);
            }
            lista = archivos.leer();
            CargarDatos();
            estadotxt(false);
        }
        
    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        if(estadoG == 1){
            Datos datos = new Datos(txtnombre.getText().toString(), txtfecha.getText(), txtcorreo.getText(), txtrfc.getText(),txtdireccion.getText(), txtsexo.getText());
           if (lista==null) lista = new ArrayList<Datos>();
           lista.add(datos);
           archivos archivos = new archivos();
           if (archivos.Grabar(lista))
               JOptionPane.showMessageDialog(null,"se grabo con exito","informacion",JOptionPane.INFORMATION_MESSAGE);
           else
               JOptionPane.showMessageDialog(null,"error al grabar","Informacion",JOptionPane.ERROR_MESSAGE);
           btninsertar.setEnabled(true);
           btnconsultar.setEnabled(false);
           
           archivos archivo = new archivos();
           lista = archivo.Leer();
           CargarDatos();
           estadotxt(false);
        }
        if (estadoG == 2){
            Datos datos = new Datos(txtnombre.getText(), txtfecha.getText(), txtcorreo.getText(), txtrfc.getText(), txtdireccion.getText(), txtsexo.getText());
            lista.set(fila, datos);
            archivos archivos = new archivos();
         if(archivos.Grabar(lista))
             JOptionPane.showMessageDialog(null,"Se consulto con exito","informacion",JOptionPane.INFORMATION_MESSAGE);
          else
             JOptionPane.showMessageDialog(null,"Error al consultar","informacion",JOptionPane.ERROR_MESSAGE);
         lista = archivos.Leer();
         CargarDatos();
         estadotxt(false);
         }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        int respuesta=JOptionPane.showConfirmDialog(null, "Deseas eliminar el registro", "eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respuesta== JOptionPane.YES_OPTION){
            lista.remove(fila);
            archivos archivos = new archivos();
            archivos.Grabar(lista);
        lista = archivos.Leer();
        CargarDatos();
        estadotxt(false);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void raton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raton
        // TODO add your handling code here:
        fila = tablaDatos.getSelectedRow();
        JOptionPane.showMessageDialog(null, "fila: " + fila);
        txtnombre.setText(String.valueOf(tablaDatos.getValueAt(fila, 0)));
        txtfecha.setText(String.valueOf(tablaDatos.getValueAt(fila, 1)));
        txtcorreo.setText(String.valueOf(tablaDatos.getValueAt(fila, 2)));
        txtrfc.setText(String.valueOf(tablaDatos.getValueAt(fila, 3)));
        txtdireccion.setText(String.valueOf(tablaDatos.getValueAt(fila, 4)));
        txtsexo.setText(String.valueOf(tablaDatos.getValueAt(fila, 5)));
    }//GEN-LAST:event_raton

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }
    private void CargarDatos(){
        DefaultTableModel modelotabla = new DefaultTableModel();
        modelotabla.addColumn("Nombre");
        modelotabla.addColumn("Fechanacimiento");
        modelotabla.addColumn("Correo");
        modelotabla.addColumn("RFC");
        modelotabla.addColumn("Direccion");
        modelotabla.addColumn("Sexo");
        tablaDatos.setModel(modelotabla);
        DefaultTableModel tabla = (DefaultTableModel) this.tablaDatos.getModel();
        if(lista != null){
        for (Datos datos:lista){
        Object fila[] = new Object[](datos.getNombre())
        tabla.addRow(fila);
        }
        }       
    }
    private void estadotxt(boolean estado){
        txtnombre.setEnabled(estado);
        txtfecha.setEnabled(estado);
        txtcorreo.setEnabled(estado);
        txtrfc.setEnabled(estado);
        txtdireccion.setEnabled(estado);
        txtsexo.setEnabled(estado);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcorreo1;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdireccion1;
    private javax.swing.JTextField txtdireccion2;
    private javax.swing.JTextField txtdireccion3;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtrfc;
    private javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables
}
