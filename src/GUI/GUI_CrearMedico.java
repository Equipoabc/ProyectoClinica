package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GUI_CrearMedico extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorMedico controladorMedico;
    ControladorArea controladorArea;
    
    public GUI_CrearMedico(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorMedico = new ControladorMedico();
        controladorArea = new ControladorArea();
        validaciones = new Validaciones();
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorArea.llenarCombo();
        
        for(int i=0; i < lista.size(); i++){
            listaAreas.addItem(lista.get(i));
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registrarMedicoLabel = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        tel = new javax.swing.JTextField();
        telLabel = new javax.swing.JLabel();
        dir = new javax.swing.JTextField();
        dirLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        crearMedico = new javax.swing.JButton();
        listaAreas = new javax.swing.JComboBox<>();
        salario = new javax.swing.JTextField();
        salarioLabel = new javax.swing.JLabel();
        idJefeLabel = new javax.swing.JLabel();
        idJefe = new javax.swing.JTextField();
        cargoLabel = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        correoLabel = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        licencia = new javax.swing.JTextField();
        licenciaLabel = new javax.swing.JLabel();
        especialidadLabel = new javax.swing.JLabel();
        especialidad = new javax.swing.JTextField();
        universidadLabel = new javax.swing.JLabel();
        universidad = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        confirmarpass = new javax.swing.JPasswordField();
        confirmarLabel10 = new javax.swing.JLabel();
        passLabel9 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        registrarMedicoLabel.setBackground(new java.awt.Color(255, 255, 255));
        registrarMedicoLabel.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        registrarMedicoLabel.setForeground(new java.awt.Color(255, 255, 255));
        registrarMedicoLabel.setText("Registrar Medico");
        jPanel1.add(registrarMedicoLabel);
        registrarMedicoLabel.setBounds(130, 40, 280, 50);

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
        botonCancelar.setBounds(390, 380, 130, 70);

        tel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(tel);
        tel.setBounds(210, 230, 180, 20);

        telLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telLabel.setText("Telefono:");
        jPanel1.add(telLabel);
        telLabel.setBounds(100, 230, 130, 20);

        dir.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        dir.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(dir);
        dir.setBounds(520, 200, 180, 20);

        dirLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        dirLabel.setText("Dirección:");
        jPanel1.add(dirLabel);
        dirLabel.setBounds(450, 200, 180, 20);

        areaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        areaLabel.setText("Area:");
        jPanel1.add(areaLabel);
        areaLabel.setBounds(100, 200, 170, 20);

        nombre.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombre);
        nombre.setBounds(520, 170, 180, 20);

        nombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombreLabel.setText("Nombre:");
        jPanel1.add(nombreLabel);
        nombreLabel.setBounds(450, 170, 180, 20);

        idLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idLabel.setText("Id Medico:");
        jPanel1.add(idLabel);
        idLabel.setBounds(100, 170, 170, 20);

        id.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        id.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(id);
        id.setBounds(210, 170, 180, 20);

        crearMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        crearMedico.setBorder(null);
        crearMedico.setBorderPainted(false);
        crearMedico.setContentAreaFilled(false);
        crearMedico.setFocusPainted(false);
        crearMedico.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        crearMedico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        crearMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMedicoActionPerformed(evt);
            }
        });
        crearMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                crearMedicoKeyPressed(evt);
            }
        });
        jPanel1.add(crearMedico);
        crearMedico.setBounds(230, 380, 160, 70);

        jPanel1.add(listaAreas);
        listaAreas.setBounds(210, 200, 180, 20);

        salario.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        salario.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(salario);
        salario.setBounds(520, 230, 180, 20);

        salarioLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        salarioLabel.setText("Salario:");
        jPanel1.add(salarioLabel);
        salarioLabel.setBounds(450, 230, 130, 20);

        idJefeLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idJefeLabel.setText("Id Jefe:");
        jPanel1.add(idJefeLabel);
        idJefeLabel.setBounds(100, 290, 130, 20);

        idJefe.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idJefe.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(idJefe);
        idJefe.setBounds(210, 290, 180, 20);

        cargoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cargoLabel.setText("Cargo:");
        jPanel1.add(cargoLabel);
        cargoLabel.setBounds(450, 260, 130, 20);

        cargo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cargo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cargo);
        cargo.setBounds(520, 260, 180, 20);

        correoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        correoLabel.setText("Correo:");
        jPanel1.add(correoLabel);
        correoLabel.setBounds(100, 260, 130, 20);

        correo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(210, 260, 180, 20);

        licencia.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        licencia.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(licencia);
        licencia.setBounds(520, 290, 180, 20);

        licenciaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        licenciaLabel.setText("No° Licencia:");
        jPanel1.add(licenciaLabel);
        licenciaLabel.setBounds(440, 290, 130, 20);

        especialidadLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        especialidadLabel.setText("Especialidad:");
        jPanel1.add(especialidadLabel);
        especialidadLabel.setBounds(100, 320, 130, 20);

        especialidad.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        especialidad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(especialidad);
        especialidad.setBounds(210, 320, 180, 20);

        universidadLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        universidadLabel.setText("Universidad:");
        jPanel1.add(universidadLabel);
        universidadLabel.setBounds(440, 320, 130, 20);

        universidad.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        universidad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(universidad);
        universidad.setBounds(520, 320, 180, 20);

        pass.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        pass.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(pass);
        pass.setBounds(210, 350, 180, 20);

        confirmarpass.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        confirmarpass.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(confirmarpass);
        confirmarpass.setBounds(520, 350, 180, 20);

        confirmarLabel10.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        confirmarLabel10.setText("Confirmar:");
        jPanel1.add(confirmarLabel10);
        confirmarLabel10.setBounds(440, 350, 150, 20);

        passLabel9.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        passLabel9.setText("Contraseña:");
        jPanel1.add(passLabel9);
        passLabel9.setBounds(100, 350, 160, 20);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_InterfazEmpleados operador = new GUI_InterfazEmpleados();
            operador.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void crearMedico(){
        
        String id_empleado, id_jefe, id_area, id_area1, nombre_empleado, direccion, telefono, sal, email, car, numLi, espe,
                uni, contrasena, confirmar;
        
        numLi = licencia.getText();
        espe = especialidad.getText();
        uni = universidad.getText();
        contrasena = pass.getText();
        confirmar = confirmarpass.getText();
        sal = "0";
        id_area1 = (String) listaAreas.getSelectedItem();
        String[] partes = id_area1.split(" ");
        id_area = partes[0];
        id_empleado = id.getText();
        id_jefe = idJefe.getText();
        nombre_empleado = nombre.getText();
        direccion = dir.getText();
        telefono = tel.getText();
        sal = salario.getText();
        email = correo.getText();
        car = cargo.getText();
                
        if (nombre_empleado.equals("") || id_empleado.equals("") || id_jefe.equals("")  || id_area.equals("") ||
                sal.equals("") || email.equals("") || car.equals("") || numLi.equals("") || uni.equals("") || contrasena.equals("")
                || confirmar.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }
        else if(!validaciones.validarLetrasEspacios(nombre_empleado) || !validaciones.validarLetrasEspacios(car) 
                || !validaciones.validarLetrasEspacios(espe) || !validaciones.validarLetrasEspacios(uni)) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos en nombre, universidad, especialidad o cargo.");
        }
        else if(!validaciones.validarNumero(id_empleado) || !validaciones.validarNumero(telefono) || !validaciones.validarNumero(id_jefe)
                || !validaciones.validarNumero(sal) || !validaciones.validarNumero(numLi)) {
            JOptionPane.showMessageDialog(null, "Los campos de id, teléfono, licencia y salario deben ser numéricos.");
        }
        else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(direccion)) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos en la dirección.");
        }
        else if(!validaciones.validarLetrasYNumeros(contrasena) || contrasena.length() < 8) {
            JOptionPane.showMessageDialog(null, "El campo contraseña debe tener mínimo 8 caracteres válidos.");
        }
        else if(!contrasena.equals(confirmar)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
        }
        else {
                int salInt = Integer.parseInt(sal);
                int numFilas = controladorMedico.insertarMedico(id_empleado, 
                        id_jefe, id_area, nombre_empleado, direccion, telefono, salInt, 
                        email, car, numLi, espe, uni, contrasena);
                
                switch (numFilas) {
                    case 2:
                        JOptionPane.showMessageDialog(null, "Medico creado exitosamente.");
                        id.setText(null);
                        nombre.setText(null);
                        idJefe.setText(null);
                        dir.setText(null);
                        tel.setText(null);
                        cargo.setText(null);
                        salario.setText(null);
                        correo.setText(null);
                        licencia.setText(null);
                        especialidad.setText(null);
                        universidad.setText(null);
                        pass.setText(null);
                        confirmarpass.setText(null);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Ya existe un empleado registrado con este id.");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "El jefe ingresado no se encuentra en la base de datos.");
                        break;    
                    default:
                        JOptionPane.showMessageDialog(null, "Ocurrió un problema al guardar el medico.");
                        break;
                }
        }
    }
    private void crearMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMedicoActionPerformed
        crearMedico();
        
    }//GEN-LAST:event_crearMedicoActionPerformed
/*
    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed

    }//GEN-LAST:event_fechaKeyPressed
*/
    private void crearMedicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crearMedicoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearMedico();}
    }//GEN-LAST:event_crearMedicoKeyPressed
    
    
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_CrearMedico().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaLabel;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField cargo;
    private javax.swing.JLabel cargoLabel;
    private javax.swing.JLabel confirmarLabel10;
    private javax.swing.JPasswordField confirmarpass;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JButton crearMedico;
    private javax.swing.JTextField dir;
    private javax.swing.JLabel dirLabel;
    private javax.swing.JTextField especialidad;
    private javax.swing.JLabel especialidadLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idJefe;
    private javax.swing.JLabel idJefeLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField licencia;
    private javax.swing.JLabel licenciaLabel;
    private javax.swing.JComboBox<String> listaAreas;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passLabel9;
    private javax.swing.JLabel registrarMedicoLabel;
    private javax.swing.JTextField salario;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel telLabel;
    private javax.swing.JTextField universidad;
    private javax.swing.JLabel universidadLabel;
    // End of variables declaration//GEN-END:variables
}