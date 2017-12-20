/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controladores.*;
import Logica.*;
import Logica.Validaciones;
import java.text.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GUI_ModificarCama extends javax.swing.JFrame {

    Validaciones validaciones;
    ControladorArea controladorArea;
    ControladorAdministrador controladorAdministrador;
    Cama cama;    
    ControladorCama controladorCama;
    String idNombre;
    
    public void setId(String id) {
        this.idNombre = id;
    }

    public GUI_ModificarCama() {

        initComponents();
        this.setLocationRelativeTo(null);
        controladorArea = new ControladorArea();
        controladorCama = new ControladorCama();   
        validaciones = new Validaciones();
        botonAceptar.setEnabled(false);
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorArea.llenarCombo();
        
        for(int i=0; i < lista.size(); i++){
            listaArea.addItem(lista.get(i));
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        primerNombreLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        ingresarCodigoLabel = new javax.swing.JLabel();
        ciudadLabel1 = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        calleLabel = new javax.swing.JLabel();
        carreraLabel = new javax.swing.JLabel();
        consultar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionText = new javax.swing.JTextArea();
        listaArea = new javax.swing.JComboBox<>();
        botonEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        primerNombreLabel5.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel5.setText("Calle:");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
        botonCancelar.setBorder(null);
        botonCancelar.setBorderPainted(false);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setFocusPainted(false);
        botonCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarPeq.png"))); // NOI18N
        botonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelar);
        botonCancelar.setBounds(350, 370, 190, 80);

        ingresarCodigoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        ingresarCodigoLabel.setText("Ingresar No. de cama:");
        jPanel1.add(ingresarCodigoLabel);
        ingresarCodigoLabel.setBounds(80, 180, 150, 40);

        ciudadLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        ciudadLabel1.setText("Área:");
        jPanel1.add(ciudadLabel1);
        ciudadLabel1.setBounds(270, 150, 50, 30);

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        botonConsultar.setBorder(null);
        botonConsultar.setBorderPainted(false);
        botonConsultar.setContentAreaFilled(false);
        botonConsultar.setFocusPainted(false);
        botonConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        botonConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(botonConsultar);
        botonConsultar.setBounds(70, 260, 160, 60);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modificar Cama");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 40, 230, 50);

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        botonAceptar.setBorder(null);
        botonAceptar.setBorderPainted(false);
        botonAceptar.setContentAreaFilled(false);
        botonAceptar.setFocusPainted(false);
        botonAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        botonAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar);
        botonAceptar.setBounds(220, 380, 160, 60);

        calleLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        calleLabel.setText("Descripción:");
        jPanel1.add(calleLabel);
        calleLabel.setBounds(270, 200, 100, 30);

        carreraLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        carreraLabel.setText("Estado:");
        jPanel1.add(carreraLabel);
        carreraLabel.setBounds(270, 300, 100, 30);

        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar);
        consultar.setBounds(90, 220, 120, 30);

        descripcionText.setColumns(20);
        descripcionText.setRows(5);
        jScrollPane2.setViewportView(descripcionText);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(360, 210, 230, 80);

        listaArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAreaActionPerformed(evt);
            }
        });
        jPanel1.add(listaArea);
        listaArea.setBounds(360, 150, 180, 25);

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarMed.png"))); // NOI18N
        botonEliminar.setBorderPainted(false);
        botonEliminar.setContentAreaFilled(false);
        botonEliminar.setFocusPainted(false);
        botonEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarPeq.png"))); // NOI18N
        botonEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar);
        botonEliminar.setBounds(90, 320, 120, 50);

        jLabel2.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -10, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

        GUI_InterfazCamas operador = new GUI_InterfazCamas();
            operador.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed

        botonAceptar.setEnabled(true);
        String numeroCama = consultar.getText();        
        
        if (numeroCama.equals("")) {            
            JOptionPane.showMessageDialog(null, "El campo de la consulta esta vacío.");
            botonAceptar.setEnabled(false);
        } else if (!validaciones.validarNumero(numeroCama)) {            
            JOptionPane.showMessageDialog(null, "El campo de consulta debe ser numérico.");
        } else {            
            cama = controladorCama.consultarDatosCama(numeroCama);
            
            if (cama != null) {                
                descripcionText.setText(cama.getDescripcion());
                listaArea.setSelectedItem(controladorArea.seleccionArea(cama.getId_area()));
                               
            } else {
                
                JOptionPane.showMessageDialog(null, "La cama con número "+ numeroCama + " no se encuentra registrada.");                
                consultar.setText(null);
            }
        }      
    }//GEN-LAST:event_botonConsultarActionPerformed
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

        String  area,area1, descripcion,estado, numeroCama;
        
        area1 = (String) listaArea.getSelectedItem();
        descripcion = descripcionText.getText();
        String[] partes = area1.split(" ");
        area = partes[0];
        numeroCama = consultar.getText();
        
        if (area.equals("") || descripcion.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }         else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(descripcion)) {
            JOptionPane.showMessageDialog(null, "Caracteres inválidos.");
        } else {
                       
            if (area.equals(cama.getId_area()) 
                    && descripcion.equals(cama.getDescripcion())){                
                JOptionPane.showMessageDialog(null, "No se ha modificado ningún campo.");
            } else {                
                if(controladorCama.comprobar(numeroCama) == 1){
                    int numFilas = controladorCama.actualizarCama(numeroCama,area,descripcion);
                
                switch (numFilas) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Los datos de la cama se han actualizado exitosamente.");
                        descripcionText.setText(null);
                        consultar.setText(null);
                        botonAceptar.setEnabled(false);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ocurrio un problema al hacer la actualización.");
                        break;
                }
            }
                            else{
                JOptionPane.showMessageDialog(null, "La cama que desea modificar no existe.");
            }
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void listaAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAreaActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        String numeroCama=consultar.getText();

        if (numeroCama.equals("")){

            JOptionPane.showMessageDialog(null, "No ha ingresado ningún número de cama.");
        } else if (!validaciones.validarNumero(numeroCama)){

            JOptionPane.showMessageDialog(null, "El campo No. de cama debe ser numérico.");
        } else {

            cama = controladorCama.consultarDatosCama(numeroCama);

            if(cama != null){

                int opcion = 5;
                opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar esta cama?", "Confirmar eliminación", JOptionPane.OK_CANCEL_OPTION);

                if(opcion == 0){

                    int numFilas = controladorCama.eliminarCama(numeroCama);

                    if (numFilas == 1){

                        JOptionPane.showMessageDialog(null, "La cama número "+ numeroCama+ " ha sido eliminada.");
                    }
                    else{

                        JOptionPane.showMessageDialog(null, "Ocurrió un error al eliminar la cama.");
                    }
                }
            } else {

                JOptionPane.showMessageDialog(null, "La cama con número: " + numeroCama + " no existe.");
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new GUI_ModificarCama().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel calleLabel;
    private javax.swing.JLabel carreraLabel;
    private javax.swing.JLabel ciudadLabel1;
    private javax.swing.JTextField consultar;
    private javax.swing.JTextArea descripcionText;
    private javax.swing.JLabel ingresarCodigoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listaArea;
    private javax.swing.JLabel primerNombreLabel5;
    // End of variables declaration//GEN-END:variables
}
