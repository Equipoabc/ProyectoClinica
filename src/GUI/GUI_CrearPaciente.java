package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GUI_CrearPaciente extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorPaciente controladorPaciente;
    String tipo;
    
    public GUI_CrearPaciente(){
        
        initComponents();
        tipo = "";
        this.setLocationRelativeTo(null);
        controladorPaciente = new ControladorPaciente();
        validaciones = new Validaciones();
        fecha.setMaxSelectableDate(GetDateNow());
        ((JTextField) fecha.getDateEditor()).setEditable(false);
    }
    
    public void setTipo(String tipo){
        
        this.tipo = tipo;
    }
    
    private Date GetDateNow(){
        
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        confirmarLabel10 = new javax.swing.JLabel();
        passLabel9 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        celLabel7 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        telefonoLabel6 = new javax.swing.JLabel();
        fechaLabel5 = new javax.swing.JLabel();
        ced = new javax.swing.JTextField();
        cedulaLabel3 = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        crearUsuario = new javax.swing.JButton();
        num_seguro = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();
        actividad_eco = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrar Paciente");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 50, 260, 50);

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
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
        botonCancelar.setBounds(390, 380, 130, 70);

        confirmarLabel10.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        confirmarLabel10.setText("Actividad economica:");
        jPanel1.add(confirmarLabel10);
        confirmarLabel10.setBounds(30, 260, 130, 20);

        passLabel9.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        passLabel9.setText("Numero de seguro:");
        jPanel1.add(passLabel9);
        passLabel9.setBounds(400, 230, 120, 20);

        direccion.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        direccion.setSelectionColor(new java.awt.Color(102, 102, 255));
        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direccionKeyPressed(evt);
            }
        });
        jPanel1.add(direccion);
        direccion.setBounds(520, 200, 180, 20);

        celLabel7.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        celLabel7.setText("Direccion:");
        jPanel1.add(celLabel7);
        celLabel7.setBounds(450, 200, 60, 20);

        tel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telKeyPressed(evt);
            }
        });
        jPanel1.add(tel);
        tel.setBounds(520, 170, 180, 20);

        telefonoLabel6.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telefonoLabel6.setText("Teléfono:");
        jPanel1.add(telefonoLabel6);
        telefonoLabel6.setBounds(450, 170, 60, 20);

        fechaLabel5.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        fechaLabel5.setText("Fecha Nacimiento:");
        jPanel1.add(fechaLabel5);
        fechaLabel5.setBounds(50, 230, 110, 20);

        ced.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        ced.setSelectionColor(new java.awt.Color(102, 102, 255));
        ced.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedKeyPressed(evt);
            }
        });
        jPanel1.add(ced);
        ced.setBounds(170, 200, 180, 20);

        cedulaLabel3.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel3.setText("Cédula:");
        jPanel1.add(cedulaLabel3);
        cedulaLabel3.setBounds(110, 200, 50, 20);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(100, 170, 60, 20);

        nom.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nom.setSelectionColor(new java.awt.Color(102, 102, 255));
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomKeyPressed(evt);
            }
        });
        jPanel1.add(nom);
        nom.setBounds(170, 170, 180, 20);

        crearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        crearUsuario.setBorderPainted(false);
        crearUsuario.setContentAreaFilled(false);
        crearUsuario.setFocusPainted(false);
        crearUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        crearUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });
        crearUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                crearUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(crearUsuario);
        crearUsuario.setBounds(230, 380, 160, 70);
        jPanel1.add(num_seguro);
        num_seguro.setBounds(520, 230, 180, 20);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(1514786511000L));
        fecha.setMinSelectableDate(new java.util.Date(-1577901489000L));
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
        });
        jPanel1.add(fecha);
        fecha.setBounds(170, 230, 180, 20);
        jPanel1.add(actividad_eco);
        actividad_eco.setBounds(170, 260, 180, 20);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        if(tipo.equals("Administrador")){
            
            GUI_Administrador administrador = new GUI_Administrador();
            administrador.setVisible(true);
            this.dispose();
        }        
        else {
            
            GUI_Operador operador = new GUI_Operador();
            operador.setVisible(true);
            this.dispose();
        }   
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void crearPaciente(){
        
        String nombre, cedula, fechaNacimiento, telefono, direc, numero_seguro, act_economica, validar = "";
        
        LocalDate fechaNac = LocalDate.now();
        fechaNacimiento = "";
        nombre = nom.getText();
        cedula = ced.getText();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");        
        try {            
            fechaNacimiento = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
            fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }   
        telefono = tel.getText();
        direc = direccion.getText();
        numero_seguro = num_seguro.getText();
        act_economica = actividad_eco.getText();
        
        if (nombre.equals("") || cedula.equals("") || fechaNacimiento.equals("")
                || telefono.equals("") || numero_seguro.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios." + validar);
        }
        else if(!validaciones.validarLetrasEspacios(nombre)){
            JOptionPane.showMessageDialog(null, "El campo nombre deben ser de solo letras y espacios.");
        }
        else if(!validaciones.validarNumero(cedula) || !validaciones.validarNumero(telefono) || !validaciones.validarNumero(numero_seguro)){
            JOptionPane.showMessageDialog(null, "Los campos de cédula, teléfono y numero de seguro deben ser numéricos.");
        }  
        else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(direc)){
            JOptionPane.showMessageDialog(null, "El campo de dirección solo acepta numeros, letras, espacios y los caracteres '.' y '-'.");
        }
        else if(!validaciones.validarLetrasEspacios(act_economica)){
            JOptionPane.showMessageDialog(null, "El campo de actividad economica solo acepta lestras y espacios.");
        }         
        else {             
            int resultado = controladorPaciente.crearPaciente(nombre, cedula, fechaNacimiento, telefono, direc, numero_seguro, act_economica);
                
            switch(resultado){                    
                case 1:
                    JOptionPane.showMessageDialog(null, "Paciente registrado exitosamente.");
                    ControladorHistoria_clinica controladorHistoria_clinica = new ControladorHistoria_clinica();
                    controladorHistoria_clinica.crearHistoria(GetDateNow().toString(), cedula);
                    nom.setText(null);
                    ced.setText(null);
                    tel.setText(null);
                    direccion.setText(null);
                    num_seguro.setText(null);
                    actividad_eco.setText(null);
                    fecha.setDate(null);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "El paciente ya se encuentra registrado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrió un problema al registrar el paciente.");
                    break;
            }            
        }
    }
    
    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        crearPaciente();
    }//GEN-LAST:event_crearUsuarioActionPerformed
    private void nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearPaciente();}
    }//GEN-LAST:event_nomKeyPressed
    private void cedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearPaciente();}
    }//GEN-LAST:event_cedKeyPressed
    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearPaciente();}
    }//GEN-LAST:event_fechaKeyPressed
    private void telKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearPaciente();}
    }//GEN-LAST:event_telKeyPressed
    private void crearUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crearUsuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearPaciente();}
    }//GEN-LAST:event_crearUsuarioKeyPressed
    private void direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearPaciente();}
    }//GEN-LAST:event_direccionKeyPressed
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_CrearPaciente().setVisible(true);
            }
        });
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actividad_eco;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField ced;
    private javax.swing.JLabel cedulaLabel3;
    private javax.swing.JLabel celLabel7;
    private javax.swing.JLabel confirmarLabel10;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JTextField direccion;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaLabel5;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField num_seguro;
    private javax.swing.JLabel passLabel9;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel telefonoLabel6;
    // End of variables declaration//GEN-END:variables
}