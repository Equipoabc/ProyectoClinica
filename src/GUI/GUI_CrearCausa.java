package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;

public class GUI_CrearCausa extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorCausas controladorCausas;  
    
    public GUI_CrearCausa(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorCausas = new ControladorCausas();
        validaciones = new Validaciones();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        des = new javax.swing.JTextField();
        primerNombreLabel2 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        crearEvento = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
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
        botonCancelar.setBounds(370, 380, 160, 70);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Crear Causa");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 200, 50);

        des.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        des.setSelectionColor(new java.awt.Color(102, 102, 255));
        des.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                desKeyPressed(evt);
            }
        });
        jPanel1.add(des);
        des.setBounds(320, 265, 180, 70);

        primerNombreLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel2.setText("Descripción:");
        jPanel1.add(primerNombreLabel2);
        primerNombreLabel2.setBounds(230, 260, 180, 30);

        nom.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nom.setSelectionColor(new java.awt.Color(102, 102, 255));
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomKeyPressed(evt);
            }
        });
        jPanel1.add(nom);
        nom.setBounds(320, 210, 180, 25);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(260, 210, 180, 30);

        crearEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        crearEvento.setBorder(null);
        crearEvento.setBorderPainted(false);
        crearEvento.setContentAreaFilled(false);
        crearEvento.setFocusPainted(false);
        crearEvento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        crearEvento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        crearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEventoActionPerformed(evt);
            }
        });
        crearEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                crearEventoKeyPressed(evt);
            }
        });
        jPanel1.add(crearEvento);
        crearEvento.setBounds(220, 380, 160, 70);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 750, 500);

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
        
        GUI_InterfazMedicamentos operador = new GUI_InterfazMedicamentos();
            operador.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void crearCausa(){
        
        String nombre, descripcion;
        nombre = nom.getText();      
        descripcion = des.getText();
        
        if (nombre.equals("") || descripcion.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        } else if(!validaciones.validarLetrasYNumerosEspacios(descripcion) || !validaciones.validarLetrasYNumerosEspacios(nombre)){
            JOptionPane.showMessageDialog(null, "Caracteres inválidos.");
        } 
        else {
            int resultado = controladorCausas.registrarCausa(descripcion, nombre);
            
            switch (resultado){
                case 1:
                    JOptionPane.showMessageDialog(null, "Causa registrada exitosamente.");
                    nom.setText(null);
                    des.setText(null);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar la causa.");
                    break;
            }
        }
    }
    
    private void crearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEventoActionPerformed
        crearCausa();
    }//GEN-LAST:event_crearEventoActionPerformed
    private void crearEventoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crearEventoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearCausa();}
    }//GEN-LAST:event_crearEventoKeyPressed
    private void nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearCausa();}
    }//GEN-LAST:event_nomKeyPressed
    private void desKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_desKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearCausa();}
    }//GEN-LAST:event_desKeyPressed
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_CrearCausa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton crearEvento;
    private javax.swing.JTextField des;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel primerNombreLabel2;
    private javax.swing.JLabel segundoNombreLabel;
    // End of variables declaration//GEN-END:variables
    
}