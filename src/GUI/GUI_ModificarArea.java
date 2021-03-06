package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;
import java.util.ArrayList;

public class GUI_ModificarArea extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorArea controladorArea;
    Area area;

    public GUI_ModificarArea() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorArea = new ControladorArea();
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

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        codigo_label = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextArea();
        segundoNombreLabel = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        listaArea = new javax.swing.JComboBox<>();
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

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modificar Área");
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

        listaArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAreaActionPerformed(evt);
            }
        });
        jPanel1.add(listaArea);
        listaArea.setBounds(50, 230, 180, 25);

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
        
        GUI_InterfazAreas operador = new GUI_InterfazAreas();
            operador.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
        String area1 = (String) listaArea.getSelectedItem();
        String[] partes = area1.split(" ");
        String codigoConsulta, nom, des = "";
        codigoConsulta = partes[0];
        nom = nombre.getText();
        des = descripcion.getText();
        
        
        if (nom.equals("") || codigoConsulta.equals("") || des.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        } else if (!validaciones.validarLetras(nom)){
            JOptionPane.showMessageDialog(null, "El campo del nombre debe ser de solo letras.");
        } else if (!validaciones.validarNumero(codigoConsulta)) {
            JOptionPane.showMessageDialog(null, "El código de consulta debe ser númerico.");
        }  else {
            
            if(controladorArea.comprobar(codigoConsulta) == 1){
                
                
                if ( nom.equals(area.getNombre_area()) && des.equals(area.getDescripcion())){
                    
                    JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo.");
                } else {
                    
                    int resultado = controladorArea.actualizarArea(codigoConsulta, nom, des);
                    
                    switch(resultado){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Los datos del área se han modificado exitosamente.");
                            listaArea.removeAllItems();
                            ArrayList<String> lista = new ArrayList<String>();
                            lista = controladorArea.llenarCombo();
                            
                            for(int i=0; i < lista.size(); i++){
                                listaArea.addItem(lista.get(i));
                            }
                            nombre.setText(null);
                            descripcion.setText(null);
                            botonAceptar.setEnabled(false);
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar el área.");
                            break;
                    }
                }
            } else {
                
                JOptionPane.showMessageDialog(null, "El área que desea modificar no existe.");
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed
    
    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        
        String area1 = (String) listaArea.getSelectedItem();
        String[] partes = area1.split(" ");
        String cod_area = partes[0];
        
        if (cod_area.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo de la consulta esta vacio.");
            
        } else if (!validaciones.validarNumero(cod_area)) {
            
            JOptionPane.showMessageDialog(null, "El campo consultar debe ser numerico.");
            
        } else {
            
            area = controladorArea.consultarDatosArea(cod_area);
            
            if (area != null) {
                botonAceptar.setEnabled(true);
                nombre.setText(area.getNombre_area());
                descripcion.setText(area.getDescripcion());
                
               
            } else {
                
                JOptionPane.showMessageDialog(null, "El área no existe.");
                nombre.setText(null);
                descripcion.setText(null);
            }
        }        
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void listaAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAreaActionPerformed
        
    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_ModificarArea().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JLabel codigo_label;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaArea;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel segundoNombreLabel;
    // End of variables declaration//GEN-END:variables
}