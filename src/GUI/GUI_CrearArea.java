
package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
//import java.util.Date;

public class GUI_CrearArea extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorArea controladorArea;
    String id;
    
    
    public GUI_CrearArea(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorArea = new ControladorArea();
        validaciones = new Validaciones();
    }
    
    private Date GetDateNow() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
    void setId(String idGerente) {
        this.id = idGerente;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        descripcion = new javax.swing.JTextArea();
        botonCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        crearEvento = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        descripcion.setLineWrap(true);
        descripcion.setRows(5);
        descripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(descripcion);
        descripcion.setBounds(160, 270, 224, 94);

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
        jLabel6.setText("Crear Área");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 200, 50);

        descripcionLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        descripcionLabel.setText("Descripción:");
        jPanel1.add(descripcionLabel);
        descripcionLabel.setBounds(70, 270, 80, 30);

        nombre.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
        });
        jPanel1.add(nombre);
        nombre.setBounds(150, 210, 180, 25);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(90, 210, 180, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Código:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(90, 150, 50, 50);

        codigo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        codigo.setSelectionColor(new java.awt.Color(102, 102, 255));
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoKeyPressed(evt);
            }
        });
        jPanel1.add(codigo);
        codigo.setBounds(150, 160, 180, 25);

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
        
    private void crearArea(){
        String nom, cod , des = "";
        nom = nombre.getText();
        cod = codigo.getText();
        des = descripcion.getText();

        if(nom.equals("") || cod.equals("") || des.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }
        else if(!validaciones.validarNumero(cod)) {
            JOptionPane.showMessageDialog(null, "El campo Código debe ser numerico");
        }
        else if(!validaciones.validarLetrasYNumerosEspacios(nom)||
                !validaciones.validarLetrasYNumerosEspacios(des)) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos.");
        }
        else if(validaciones.validarNumero(nom) || validaciones.validarNumero(des)) {
            JOptionPane.showMessageDialog(null, "Los campos nombre y descripción no pueden ser solo números.");
        }
        
        else {
            int numFilas = controladorArea.insertarArea(cod, nom, des, id);
            switch (numFilas) {
                case 2:
                    JOptionPane.showMessageDialog(null, "El área ya se encuentra registrada en el sistema.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Área creada exitosamente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrió un problema al guardar el área.");
                    break;
            }
        }
    }
    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearArea();
        }
    }//GEN-LAST:event_fechaKeyPressed

    //Inicio eventos del teclado
    private void crearEventoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crearEventoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearArea();
        }
    }//GEN-LAST:event_crearEventoKeyPressed

    private void crearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEventoActionPerformed

        crearArea();
    }//GEN-LAST:event_crearEventoActionPerformed

    private void codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearArea();
        }
    }//GEN-LAST:event_codigoKeyPressed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearArea();
        }
    }//GEN-LAST:event_nombreKeyPressed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

        GUI_InterfazAreas gerenteLogin = new GUI_InterfazAreas();
        gerenteLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    //Fin eventos del teclado
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_CrearArea().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton crearEvento;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel segundoNombreLabel;
    // End of variables declaration//GEN-END:variables
    
}