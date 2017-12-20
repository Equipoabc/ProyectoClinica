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
import java.util.Date;
import javax.swing.JOptionPane;

public class GUI_ModificarCampana extends javax.swing.JFrame {

    Validaciones validaciones;
    ControladorMedico controladorMedico;
    ControladorAdministrador controladorAdministrador;
    Campana campana;    
    ControladorCampana controladorCampana;
    String idNombre;
    
    public void setId(String id) {
        this.idNombre = id;
    }

    public GUI_ModificarCampana() {

        initComponents();
        this.setLocationRelativeTo(null);
        controladorMedico = new ControladorMedico();
        controladorCampana = new ControladorCampana();   
        validaciones = new Validaciones();
        botonAceptar.setEnabled(false);
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorMedico.llenarCombo();
        
        for(int i=0; i < lista.size(); i++){
            listaMedico.addItem(lista.get(i));
        }        
    }

    public String organizarFecha(String fecha){
        
        String[] arreglo = fecha.split("/");
        return arreglo[2] + "-" + arreglo[1] + "-" + arreglo[0];
    }
    
    public static Date parseFecha(String fecha){ 
        
        fecha = fecha.replace("-","/") ; 
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd"); 
        Date fechaDate = null; 
        try {
            fechaDate = formato.parse(fecha); 
        } 
        catch (ParseException ex) 
        { 
            System.out.println("Error: " + ex); 
        } 
        return fechaDate; 
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
        consultar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        objetivoText = new javax.swing.JTextArea();
        listaMedico = new javax.swing.JComboBox<>();
        fechaText = new com.toedter.calendar.JDateChooser();
        primerNombreLabel1 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
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
        ingresarCodigoLabel.setText("Ingresar Código:");
        jPanel1.add(ingresarCodigoLabel);
        ingresarCodigoLabel.setBounds(100, 180, 150, 40);

        ciudadLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        ciudadLabel1.setText("Médico:");
        jPanel1.add(ciudadLabel1);
        ciudadLabel1.setBounds(280, 300, 60, 30);

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
        jLabel6.setText("Modificar Campaña");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 40, 310, 50);

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
        calleLabel.setText("Objetivo:");
        jPanel1.add(calleLabel);
        calleLabel.setBounds(280, 170, 100, 30);

        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar);
        consultar.setBounds(90, 220, 120, 30);

        objetivoText.setColumns(20);
        objetivoText.setRows(5);
        jScrollPane2.setViewportView(objetivoText);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(360, 170, 230, 80);

        listaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(listaMedico);
        listaMedico.setBounds(360, 300, 180, 25);

        fechaText.setBackground(new java.awt.Color(255, 255, 255));
        fechaText.setForeground(new java.awt.Color(102, 102, 255));
        fechaText.setFocusable(false);
        fechaText.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fechaText.setMaxSelectableDate(new java.util.Date(3471314481000L));
        fechaText.setMinSelectableDate(new java.util.Date(-1262282319000L));
        fechaText.setRequestFocusEnabled(false);
        fechaText.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fechaText);
        fechaText.setBounds(360, 260, 180, 25);

        primerNombreLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel1.setText("Fecha:");
        jPanel1.add(primerNombreLabel1);
        primerNombreLabel1.setBounds(280, 260, 60, 30);

        nombreText.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombreText.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombreText);
        nombreText.setBounds(360, 130, 180, 25);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(280, 130, 70, 30);

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

        GUI_InterfazCampana operador = new GUI_InterfazCampana();
            operador.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed

        botonAceptar.setEnabled(true);
        String codigo = consultar.getText(); 
        
        if (codigo.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo de la consulta se encuentra vacío.");
        } else if (!validaciones.validarNumero(codigo)) {
            
            JOptionPane.showMessageDialog(null, "El campo consultar debe ser numérico.");
        } else {
            
            campana = controladorCampana.consultarDatosCampana(codigo);
            
            if (campana != null) {
                
                nombreText.setText(campana.getNombre_campana());
                fechaText.setDate(parseFecha(campana.getFecha_realizacion()));
                objetivoText.setText(campana.getObjetivo());
                listaMedico.setSelectedItem(controladorMedico.seleccionMedico(campana.getId_empleado()));
                
            } else {
                
                JOptionPane.showMessageDialog(null, "La campaña no existe.");
                
                nombreText.setText(null);
                fechaText.setDate(null);
                objetivoText.setText(null);
            }
        }
         
    }//GEN-LAST:event_botonConsultarActionPerformed
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

        String  medico1, medico, objetivo, nombre, codigo, fecha = "", validar = "";
        
        medico1 = (String) listaMedico.getSelectedItem();
        objetivo = objetivoText.getText();
        nombre = nombreText.getText();
        String[] partes = medico1.split(" ");
        medico = partes[0];
        codigo = consultar.getText();
        
        try {
            fecha = new SimpleDateFormat("dd/MM/YYYY").format(fechaText.getDate());
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }

        if ( nombre.equals("") || objetivo.equals("") || fecha.equals("") ){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios." + validar);
        }  else if (!validaciones.validarLetrasYNumerosEspacios(nombre)){
            JOptionPane.showMessageDialog(null, "Caracteres invalidos en el campo nombre.");
        } else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(objetivo)){
            JOptionPane.showMessageDialog(null, "Caracteres inválidos en el campo objetivo.");
        } else if ( !validaciones.validarNumero(codigo)) {
            JOptionPane.showMessageDialog(null, "El campo de consulta debe ser numérico.");
        } else {
            
            if(controladorCampana.comprobar(codigo) == 1){
                fecha = organizarFecha(fecha);
                
                if (nombre.equals(campana.getNombre_campana()) 
                        && (objetivo.equals(campana.getObjetivo())) && medico.equals(campana.getId_empleado())
                        && fecha.equals(campana.getFecha_realizacion())){
                    JOptionPane.showMessageDialog(null, "No se ha modificado ningún campo.");
                } else {
                    int numFilas = controladorCampana.actualizarCampana(codigo, nombre, objetivo, fecha, medico);
                    
                    switch (numFilas) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Los datos de la campaña se han modificado exitosamente.");                                                   
                            nombreText.setText(null);
                            consultar.setText(null);
                            objetivoText.setText(null);
                            fechaText.setDate(null);    
                            botonAceptar.setEnabled(false);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al hacer la actualización.");
                            break;
                    }
                }
            }
            
            else{
                JOptionPane.showMessageDialog(null, "La campaña que desea modificar no existe.");
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void listaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMedicoActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new GUI_ModificarCampana().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JLabel calleLabel;
    private javax.swing.JLabel ciudadLabel1;
    private javax.swing.JTextField consultar;
    private com.toedter.calendar.JDateChooser fechaText;
    private javax.swing.JLabel ingresarCodigoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listaMedico;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextArea objetivoText;
    private javax.swing.JLabel primerNombreLabel1;
    private javax.swing.JLabel primerNombreLabel5;
    private javax.swing.JLabel segundoNombreLabel;
    // End of variables declaration//GEN-END:variables
}
