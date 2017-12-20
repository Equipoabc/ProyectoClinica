package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class GUI_ModificarMedicamento extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorMedicamento controladorMedicamento;
    Medicamento medicamento;
    String idNombre;
    
    public void setId(String id) {
        this.idNombre = id;
    }
    
    public GUI_ModificarMedicamento() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorMedicamento = new ControladorMedicamento();
        validaciones = new Validaciones();
        botonAceptar.setEnabled(false);
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorMedicamento.llenarMedicamentos();
        
        for(int i=0; i < lista.size(); i++){
            listaMedicamentos.addItem(lista.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        codigo_label = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextArea();
        costo = new javax.swing.JTextField();
        costoLabel = new javax.swing.JLabel();
        segundoNombreLabel = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        listaMedicamentos = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

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
        botonCancelar.setBounds(400, 370, 140, 90);

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
        botonEliminar.setBounds(80, 340, 120, 50);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modificar Medicamento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 40, 320, 50);

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
        botonAceptar.setBounds(240, 370, 140, 90);

        codigo_label.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        codigo_label.setText("Ingresar Codigo:");
        jPanel1.add(codigo_label);
        codigo_label.setBounds(90, 190, 100, 40);

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
        botonConsultar.setBounds(60, 260, 160, 70);

        nombre.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
        });
        jPanel1.add(nombre);
        nombre.setBounds(320, 170, 180, 25);

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        descripcion.setLineWrap(true);
        descripcion.setRows(5);
        descripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(descripcion);
        descripcion.setBounds(320, 230, 180, 50);

        costo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        costo.setSelectionColor(new java.awt.Color(102, 102, 255));
        costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                costoKeyPressed(evt);
            }
        });
        jPanel1.add(costo);
        costo.setBounds(320, 310, 180, 25);

        costoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        costoLabel.setText("Costo:");
        jPanel1.add(costoLabel);
        costoLabel.setBounds(240, 300, 50, 50);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(240, 170, 180, 30);

        descripcionLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        descripcionLabel.setText("Descripción:");
        jPanel1.add(descripcionLabel);
        descripcionLabel.setBounds(240, 230, 80, 30);

        listaMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMedicamentosActionPerformed(evt);
            }
        });
        jPanel1.add(listaMedicamentos);
        listaMedicamentos.setBounds(50, 230, 180, 25);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(0, -10, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void costoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoKeyPressed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed

    }//GEN-LAST:event_nombreKeyPressed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed

        String id_area1 = (String) listaMedicamentos.getSelectedItem();
        String[] partes = id_area1.split(" ");
        String cod_med = partes[0];

        if (cod_med.equals("")) {

            JOptionPane.showMessageDialog(null, "El campo de la consulta esta vacío.");

        } else if (!validaciones.validarNumero(cod_med)) {

            JOptionPane.showMessageDialog(null, "El campo consultar debe ser numérico.");

        } else {

            medicamento = controladorMedicamento.consultarDatosMedicamento(cod_med);

            if (medicamento != null) {
                botonAceptar.setEnabled(true);
                nombre.setText(medicamento.getNombre_medicamento());
                descripcion.setText(medicamento.getDescripcion());
                costo.setText(Integer.toString(medicamento.getCosto()));

            } else {

                JOptionPane.showMessageDialog(null, "El medicamento no existe.");
                nombre.setText(null);
                descripcion.setText(null);
                costo.setText(null);
            }
        }
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

        String codigoConsulta,cod, nom, des, cos = "";
        String id_area1 = (String) listaMedicamentos.getSelectedItem();
        String[] partes = id_area1.split(" ");
        codigoConsulta = partes[0];
        nom = nombre.getText();
        des = descripcion.getText();
        cos = costo.getText();
        
        if (cos.equals("") || nom.equals("") || codigoConsulta.equals("") || des.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        } else if (!validaciones.validarLetras(nom)){
            JOptionPane.showMessageDialog(null, "El campo del nombre debe ser de solo letras.");
        } else if (!validaciones.validarNumero(codigoConsulta) || !validaciones.validarNumero(cos)) {
            JOptionPane.showMessageDialog(null, "Los campos de consulta, y costo del medicamento deben ser de solo numeros.");
        }  else {
            
            if(controladorMedicamento.comprobar(codigoConsulta) == 1){
                
                if (nom.equals(medicamento.getNombre_medicamento()) && des.equals(medicamento.getDescripcion())
                        && cos.equals(String.valueOf(medicamento.getCosto()))){
                    
                    JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo.");
                } else {
                    
                    int resultado = controladorMedicamento.actualizarMedicamento(codigoConsulta, nom, des, cos);
                    
                    switch(resultado){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Los datos del medicamento se han modificado exitosamente.");
                            listaMedicamentos.removeAllItems();
                            ArrayList<String> lista = new ArrayList<String>();
                            lista = controladorMedicamento.llenarMedicamentos();
                            
                            for(int i=0; i < lista.size(); i++){
                                listaMedicamentos.addItem(lista.get(i));
                            }
                            nombre.setText(null);
                            costo.setText(null);
                            descripcion.setText(null);
                            botonAceptar.setEnabled(false);
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar el medicamento.");
                            break;
                    }
                }
            } else {
                
                JOptionPane.showMessageDialog(null, "El medicamento que desea modificar no existe.");
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        String id_area1 = (String) listaMedicamentos.getSelectedItem();
        String[] partes = id_area1.split(" ");
        String cod_med = partes[0];
        
        if (cod_med.equals("")){
            
            JOptionPane.showMessageDialog(null, "No ha ingresado ningún medicamento.");
        } else if (!validaciones.validarNumero(cod_med)){
            
            JOptionPane.showMessageDialog(null, "El campo debe ser numérico.");
        } else {
            
            medicamento = controladorMedicamento.consultarDatosMedicamento(cod_med);
            
            if(medicamento != null){
                
                int opcion = 5;
                opcion = JOptionPane.showConfirmDialog(null, "Está seguro que desea borrar este medicamento: \n" + medicamento.getNombre_medicamento()+ " ?", "Confirmar eliminación", JOptionPane.OK_CANCEL_OPTION);
                
                if(opcion == 0){
                    
                    int numFilas = controladorMedicamento.eliminarMedicamento(cod_med);
                    
                    if (numFilas == 1){
                        
                        JOptionPane.showMessageDialog(null, "El medicamento "+ medicamento.getNombre_medicamento()+ " ha sido eliminado.");
                        listaMedicamentos.removeAllItems();
                        ArrayList<String> lista = new ArrayList<String>();
                        lista = controladorMedicamento.llenarMedicamentos();
                        
                        for(int i=0; i < lista.size(); i++){
                            listaMedicamentos.addItem(lista.get(i));
                        }
                    }
                    else{
                        
                        JOptionPane.showMessageDialog(null, "Hubo un error eliminando el medicamento.");
                    }
                }
            } else {
                
                JOptionPane.showMessageDialog(null, "El medicamento: " + cod_med + " no existe.");
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

        GUI_InterfazMedicamentos operador = new GUI_InterfazMedicamentos();
        operador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void listaMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMedicamentosActionPerformed
        
                
    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_ModificarMedicamento().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel codigo_label;
    private javax.swing.JTextField costo;
    private javax.swing.JLabel costoLabel;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaMedicamentos;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel segundoNombreLabel;
    // End of variables declaration//GEN-END:variables
}