package GUI;
import Controladores.*;
import Logica.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GUI_Login extends javax.swing.JFrame {
    
    ControladorAdministrador controladorAdministrador;
    ControladorMedico controladorMedico;
    ControladorOperador controladorOperador;
    
    public GUI_Login(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorAdministrador = new ControladorAdministrador();
        controladorMedico = new ControladorMedico();
        controladorOperador = new ControladorOperador();
        usuario.setBorder(new EmptyBorder(0,5,0,2));
        pass.setBorder(new EmptyBorder(0,5,0,2));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtUsuario = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        TxtPass = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        botonIniciarSesion = new javax.swing.JButton();
        botonOlvide = new javax.swing.JLabel();
        contornoPass = new javax.swing.JLabel();
        contornoUser = new javax.swing.JLabel();
        contornoDatos = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        TxtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TxtUsuario.setFont(new java.awt.Font("Cambria", 2, 20)); // NOI18N
        TxtUsuario.setText("Usuario:");
        jPanel1.add(TxtUsuario);
        TxtUsuario.setBounds(480, 130, 120, 40);

        usuario.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });
        jPanel1.add(usuario);
        usuario.setBounds(490, 180, 170, 30);

        TxtPass.setBackground(new java.awt.Color(255, 255, 255));
        TxtPass.setFont(new java.awt.Font("Cambria", 2, 20)); // NOI18N
        TxtPass.setText("Contraseña:");
        jPanel1.add(TxtPass);
        TxtPass.setBounds(470, 220, 190, 40);

        pass.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(490, 270, 170, 30);

        botonIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IngresarMed.png"))); // NOI18N
        botonIniciarSesion.setBorder(null);
        botonIniciarSesion.setBorderPainted(false);
        botonIniciarSesion.setContentAreaFilled(false);
        botonIniciarSesion.setFocusPainted(false);
        botonIniciarSesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IngresarPeq.png"))); // NOI18N
        botonIniciarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar.png"))); // NOI18N
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });
        botonIniciarSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonIniciarSesionKeyPressed(evt);
            }
        });
        jPanel1.add(botonIniciarSesion);
        botonIniciarSesion.setBounds(500, 310, 150, 70);

        botonOlvide.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        botonOlvide.setText("Olvidé mi contraseña");
        botonOlvide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonOlvideMouseClicked(evt);
            }
        });
        jPanel1.add(botonOlvide);
        botonOlvide.setBounds(550, 380, 160, 30);

        contornoPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campo.png"))); // NOI18N
        contornoPass.setText("jLabel3");
        jPanel1.add(contornoPass);
        contornoPass.setBounds(460, 260, 240, 50);

        contornoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campo.png"))); // NOI18N
        contornoUser.setText("jLabel3");
        jPanel1.add(contornoUser);
        contornoUser.setBounds(460, 170, 240, 50);

        contornoDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginF.png"))); // NOI18N
        contornoDatos.setText("jLabel1");
        jPanel1.add(contornoDatos);
        contornoDatos.setBounds(420, 90, 290, 340);

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GifClinica.gif"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void iniciarSesion(){
        String user, cont;
        user = usuario.getText();
        cont = pass.getText();
        
        Administrador admin;
        admin = controladorAdministrador.loginAdministrador(user);
        
        Medico med;
        med = controladorMedico.consultarDatosMedico(user);
        
        Operador ope;
        ope = controladorOperador.loginOperador(user);
        
        if((!user.equals("")) && (!cont.equals(""))){ 
            
            if(admin.getUsuario().equals(user)){
                
                if(admin.getContrasena().equals(cont)){
                    
                    GUI_Administrador interfazAdmin = new GUI_Administrador();
                    interfazAdmin.setVisible(true);
                    this.dispose();
                }
                else {
                    
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(med != null){
                if(med.getContrasena().equals(cont)){
                    GUI_Medico interfazMedico = new GUI_Medico();
                    interfazMedico.setId(med.getId_empleado());
                    //interfazMedico.personalizarBienvenida();
                    interfazMedico.setVisible(true);
                    this.dispose();
                }
                else {
                    
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(ope.getUsuario().equals(user) ){
                
                if(ope.getContrasena().equals(cont)){
                    
                    GUI_Operador interfazOperador = new GUI_Operador();
                    interfazOperador.setVisible(true);                    
                    this.dispose();
                }
                else {
                    
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                
                JOptionPane.showMessageDialog(null, "El usuario no existe.\nVerifique sus datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "No se ingresó un campo.\nVerifique sus datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        iniciarSesion();   
    }//GEN-LAST:event_botonIniciarSesionActionPerformed
    
    private void botonIniciarSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonIniciarSesionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            iniciarSesion();
        }
        
    }//GEN-LAST:event_botonIniciarSesionKeyPressed
    
    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            iniciarSesion();
        }
    }//GEN-LAST:event_passKeyPressed
    
    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            iniciarSesion();
        }
    }//GEN-LAST:event_usuarioKeyPressed

    private void botonOlvideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOlvideMouseClicked
        // TODO add your handling code here:
        /*GUI_CambiarContrasena cambiarC = new GUI_CambiarContrasena();
        cambiarC.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_botonOlvideMouseClicked
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                GUI_Login ventana = new GUI_Login();
                ventana.setVisible(true);
                              
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TxtPass;
    private javax.swing.JLabel TxtUsuario;
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JLabel botonOlvide;
    private javax.swing.JLabel contornoDatos;
    private javax.swing.JLabel contornoPass;
    private javax.swing.JLabel contornoUser;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
