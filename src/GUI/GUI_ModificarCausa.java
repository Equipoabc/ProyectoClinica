package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;
import java.util.ArrayList;

public class GUI_ModificarCausa extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorCausas controladorCausas;
    Causa causa;

    public GUI_ModificarCausa() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorCausas = new ControladorCausas();
        validaciones = new Validaciones();
        causa = new Causa();
        botonAceptar.setEnabled(false);
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorCausas.llenarCausas();
        
        for(int i=0; i < lista.size(); i++){
            listaCausas.addItem(lista.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        causasGrande = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        codigo_label = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextArea();
        segundoNombreLabel = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        listaCausas = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

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

        causasGrande.setBackground(new java.awt.Color(255, 255, 255));
        causasGrande.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        causasGrande.setForeground(new java.awt.Color(255, 255, 255));
        causasGrande.setText("Modificar Causas");
        jPanel1.add(causasGrande);
        causasGrande.setBounds(140, 40, 320, 50);

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
        jPanel1.add(nombre);
        nombre.setBounds(340, 200, 180, 25);

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        descripcion.setLineWrap(true);
        descripcion.setRows(5);
        descripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(descripcion);
        descripcion.setBounds(340, 260, 180, 70);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(260, 200, 180, 30);

        descripcionLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        descripcionLabel.setText("Descripción:");
        jPanel1.add(descripcionLabel);
        descripcionLabel.setBounds(260, 260, 80, 30);

        listaCausas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCausasActionPerformed(evt);
            }
        });
        jPanel1.add(listaCausas);
        listaCausas.setBounds(50, 230, 180, 25);

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
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_InterfazMedicamentos operador = new GUI_InterfazMedicamentos();
            operador.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
        String codigoConsulta, nom, des = "";
        codigoConsulta = causa.getCodigo_causa();
        nom = nombre.getText();
        des = descripcion.getText();
        
        
        if (nom.equals("") || des.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        } else if (!validaciones.validarLetrasEspacios(nom)){
            JOptionPane.showMessageDialog(null, "El campo del nombre debe ser de solo letras.");
        }  else  {
            
            if ( nom.equals(causa.getNombre_causa()) && des.equals(causa.getDescripcion())){
                
                JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo.");
            } else {
                
                int resultado = controladorCausas.actualizarCausa(codigoConsulta, nom, des);
                
                switch(resultado){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Los datos del área se han modificado exitosamente.");
                        nombre.setText(null);
                        descripcion.setText(null);
                        botonAceptar.setEnabled(false);
                        listaCausas.removeAllItems();
                        ArrayList<String> lista = new ArrayList<String>();
                        lista = controladorCausas.llenarCausas();
                        
                        for(int i=0; i < lista.size(); i++){
                            listaCausas.addItem(lista.get(i));
                        }
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar la causa.");
                        break;
                }
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed
    
    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed

        
        String id_area1 = (String) listaCausas.getSelectedItem();
        String[] partes = id_area1.split(" ");
        String cod_causa = partes[0];
        
        if (cod_causa.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo de la consulta esta vacio.");
            
        } else if (!validaciones.validarNumero(cod_causa)) {
            
            JOptionPane.showMessageDialog(null, "El campo consultar debe ser numerico.");
            
        } else {
            
            causa = controladorCausas.consultarDatosCausa(cod_causa);
            
            if (causa != null) {
                botonAceptar.setEnabled(true);
                nombre.setText(causa.getNombre_causa());
                descripcion.setText(causa.getDescripcion());
               
            } else {
                
                JOptionPane.showMessageDialog(null, "La causa no está registrada.");
                nombre.setText(null);
                descripcion.setText(null);
            }
        }        
    }//GEN-LAST:event_botonConsultarActionPerformed
    
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        String id_area1 = (String) listaCausas.getSelectedItem();
        String[] partes = id_area1.split(" ");
        String cod_causa = partes[0];

        if (cod_causa.equals("")){

            JOptionPane.showMessageDialog(null, "No ha ingresado ninguna causa.");
        } else if (!validaciones.validarNumero(cod_causa)){

            JOptionPane.showMessageDialog(null, "El campo debe ser numérico.");
        } else {

            causa = controladorCausas.consultarDatosCausa(cod_causa);

            if(causa != null){

                int opcion = 5;
                opcion = JOptionPane.showConfirmDialog(null, "Está seguro que desea borrar esta causa: \n" + causa.getNombre_causa() + " ?", "Confirmar eliminación", JOptionPane.OK_CANCEL_OPTION);

                if(opcion == 0){

                    int numFilas = controladorCausas.eliminarCausa(cod_causa);

                    if (numFilas == 1){

                        JOptionPane.showMessageDialog(null, "La causa "+ causa.getNombre_causa()+ " ha sido eliminada.");
                        listaCausas.removeAllItems();
                        ArrayList<String> lista = new ArrayList<String>();
                        lista = controladorCausas.llenarCausas();
                        
                        for(int i=0; i < lista.size(); i++){
                            listaCausas.addItem(lista.get(i));
                        }
                        nombre.setText(null);
                        descripcion.setText(null);
                    }
                    else{

                        JOptionPane.showMessageDialog(null, "Hubo un error eliminando la causa.");
                    }
                }
            } else {

                JOptionPane.showMessageDialog(null, "La causa: " + cod_causa + " no existe.");
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void listaCausasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCausasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaCausasActionPerformed
    
    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_ModificarCausa().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel causasGrande;
    private javax.swing.JLabel codigo_label;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaCausas;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel segundoNombreLabel;
    // End of variables declaration//GEN-END:variables
}