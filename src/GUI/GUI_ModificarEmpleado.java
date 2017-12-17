package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;
import java.util.*;

public class GUI_ModificarEmpleado extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorEnfermera controladorEnfermera;
    ControladorMedico controladorMedico;
    ControladorArea controladorArea;
    Medico medico;
    Enfermera enfermera;
   
    public GUI_ModificarEmpleado() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorArea = new ControladorArea();
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorArea.llenarCombo();
        
        for(int i=0; i < lista.size(); i++){
            listaAreas.addItem(lista.get(i));
        }
        controladorEnfermera = new ControladorEnfermera();
        controladorMedico = new ControladorMedico();
        validaciones = new Validaciones();
        botonAceptar.setEnabled(false);
        ingresarCedulaLabel.setVisible(false);
        botonConsultarMedico.setVisible(false);
        anos.setVisible(false);
        anosLabel.setVisible(false);
        areaLabel.setVisible(false);
        botonAceptar.setVisible(false);
        botonCancelar.setVisible(false);
        botonAceptarE.setVisible(false);
        botonConsultarEnfermera.setVisible(false);
        botonConsultarMedico.setVisible(false);
        cargo.setVisible(false);
        cargoLabel.setVisible(false);
        confirmarLabel10.setVisible(false);
        confirmarpass.setVisible(false);
        consultarLabel.setVisible(false);
        correo.setVisible(false);
        correoLabel.setVisible(false);
        dir.setVisible(false);
        dirLabel.setVisible(false);
        especialidad.setVisible(false);
        especialidadLabel.setVisible(false);
        idJefe.setVisible(false);
        idJefeLabel.setVisible(false);
        ingresarCedulaLabel.setVisible(false);
        licencia.setVisible(false);
        licenciaLabel.setVisible(false);
        listaAreas.setVisible(false);
        nombre.setVisible(false);
        nombreLabel.setVisible(false);
        pass.setVisible(false);
        passLabel9.setVisible(false);
        salario.setVisible(false);
        salarioLabel.setVisible(false);
        tel.setVisible(false);
        telLabel.setVisible(false);
        universidad.setVisible(false);
        universidadLabel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        idJefe = new javax.swing.JTextField();
        idJefeLabel = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        correoLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        listaAreas = new javax.swing.JComboBox<>();
        areaLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        dir = new javax.swing.JTextField();
        dirLabel = new javax.swing.JLabel();
        salarioLabel = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        cargo = new javax.swing.JTextField();
        cargoLabel = new javax.swing.JLabel();
        anosLabel = new javax.swing.JLabel();
        anos = new javax.swing.JTextField();
        modificarEmpleadoLabel = new javax.swing.JLabel();
        preguntaLabel = new javax.swing.JLabel();
        botonAceptarE = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        ingresarCedulaLabel = new javax.swing.JLabel();
        consultarLabel = new javax.swing.JTextField();
        botonConsultarMedico = new javax.swing.JButton();
        botonConsultarEnfermera = new javax.swing.JButton();
        desapareceLabel = new javax.swing.JLabel();
        confirmarLabel10 = new javax.swing.JLabel();
        opcionMedico = new javax.swing.JButton();
        desapareceLabel2 = new javax.swing.JLabel();
        opcionEnfermera = new javax.swing.JButton();
        licencia = new javax.swing.JTextField();
        licenciaLabel = new javax.swing.JLabel();
        universidadLabel = new javax.swing.JLabel();
        universidad = new javax.swing.JTextField();
        confirmarpass = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        passLabel9 = new javax.swing.JLabel();
        especialidadLabel = new javax.swing.JLabel();
        especialidad = new javax.swing.JTextField();
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

        idJefe.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idJefe.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(idJefe);
        idJefe.setBounds(560, 240, 180, 20);

        idJefeLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idJefeLabel.setText("Id Jefe:");
        jPanel1.add(idJefeLabel);
        idJefeLabel.setBounds(490, 240, 130, 20);

        correo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(290, 210, 180, 20);

        correoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        correoLabel.setText("Correo:");
        jPanel1.add(correoLabel);
        correoLabel.setBounds(180, 210, 130, 20);

        telLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telLabel.setText("Telefono:");
        jPanel1.add(telLabel);
        telLabel.setBounds(180, 180, 130, 20);

        tel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(tel);
        tel.setBounds(290, 180, 180, 20);

        jPanel1.add(listaAreas);
        listaAreas.setBounds(290, 150, 180, 20);

        areaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        areaLabel.setText("Area:");
        jPanel1.add(areaLabel);
        areaLabel.setBounds(180, 150, 170, 20);

        nombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombreLabel.setText("Nombre:");
        jPanel1.add(nombreLabel);
        nombreLabel.setBounds(490, 120, 180, 20);

        nombre.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombre);
        nombre.setBounds(560, 120, 180, 20);

        dir.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        dir.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(dir);
        dir.setBounds(560, 150, 180, 20);

        dirLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        dirLabel.setText("Dirección:");
        jPanel1.add(dirLabel);
        dirLabel.setBounds(490, 150, 180, 20);

        salarioLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        salarioLabel.setText("Salario:");
        jPanel1.add(salarioLabel);
        salarioLabel.setBounds(490, 180, 130, 20);

        salario.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        salario.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(salario);
        salario.setBounds(560, 180, 180, 20);

        cargo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cargo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cargo);
        cargo.setBounds(560, 210, 180, 20);

        cargoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cargoLabel.setText("Cargo:");
        jPanel1.add(cargoLabel);
        cargoLabel.setBounds(490, 210, 130, 20);

        anosLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        anosLabel.setText("Años Experiencia:");
        jPanel1.add(anosLabel);
        anosLabel.setBounds(180, 240, 130, 20);

        anos.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        anos.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(anos);
        anos.setBounds(290, 240, 180, 20);

        modificarEmpleadoLabel.setBackground(new java.awt.Color(255, 255, 255));
        modificarEmpleadoLabel.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        modificarEmpleadoLabel.setForeground(new java.awt.Color(255, 255, 255));
        modificarEmpleadoLabel.setText("Modificar Empleado");
        jPanel1.add(modificarEmpleadoLabel);
        modificarEmpleadoLabel.setBounds(140, 40, 320, 50);

        preguntaLabel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        preguntaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preguntaLabel.setText("Qué tipo de empleado desea modificar?");
        jPanel1.add(preguntaLabel);
        preguntaLabel.setBounds(0, 160, 750, 30);

        botonAceptarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        botonAceptarE.setBorder(null);
        botonAceptarE.setBorderPainted(false);
        botonAceptarE.setContentAreaFilled(false);
        botonAceptarE.setFocusPainted(false);
        botonAceptarE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        botonAceptarE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        botonAceptarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarEActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptarE);
        botonAceptarE.setBounds(240, 370, 140, 90);

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

        ingresarCedulaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        ingresarCedulaLabel.setText("Ingresar Cédula:");
        jPanel1.add(ingresarCedulaLabel);
        ingresarCedulaLabel.setBounds(40, 130, 100, 40);

        consultarLabel.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        consultarLabel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(consultarLabel);
        consultarLabel.setBounds(20, 170, 140, 25);

        botonConsultarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        botonConsultarMedico.setBorder(null);
        botonConsultarMedico.setBorderPainted(false);
        botonConsultarMedico.setContentAreaFilled(false);
        botonConsultarMedico.setFocusPainted(false);
        botonConsultarMedico.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        botonConsultarMedico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        botonConsultarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(botonConsultarMedico);
        botonConsultarMedico.setBounds(10, 200, 160, 70);

        botonConsultarEnfermera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        botonConsultarEnfermera.setBorder(null);
        botonConsultarEnfermera.setBorderPainted(false);
        botonConsultarEnfermera.setContentAreaFilled(false);
        botonConsultarEnfermera.setFocusPainted(false);
        botonConsultarEnfermera.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        botonConsultarEnfermera.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        botonConsultarEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarEnfermeraActionPerformed(evt);
            }
        });
        jPanel1.add(botonConsultarEnfermera);
        botonConsultarEnfermera.setBounds(10, 200, 160, 70);

        desapareceLabel.setBackground(new java.awt.Color(255, 255, 255));
        desapareceLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        desapareceLabel.setForeground(new java.awt.Color(108, 101, 247));
        desapareceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desapareceLabel.setText("Medico");
        jPanel1.add(desapareceLabel);
        desapareceLabel.setBounds(190, 270, 140, 90);

        confirmarLabel10.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        confirmarLabel10.setText("Confirmar:");
        jPanel1.add(confirmarLabel10);
        confirmarLabel10.setBounds(180, 300, 150, 20);

        opcionMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        opcionMedico.setBorder(null);
        opcionMedico.setBorderPainted(false);
        opcionMedico.setContentAreaFilled(false);
        opcionMedico.setFocusPainted(false);
        opcionMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(opcionMedico);
        opcionMedico.setBounds(180, 260, 160, 110);

        desapareceLabel2.setBackground(new java.awt.Color(255, 255, 255));
        desapareceLabel2.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        desapareceLabel2.setForeground(new java.awt.Color(108, 101, 247));
        desapareceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desapareceLabel2.setText("Enfermera");
        jPanel1.add(desapareceLabel2);
        desapareceLabel2.setBounds(420, 270, 140, 90);

        opcionEnfermera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        opcionEnfermera.setBorder(null);
        opcionEnfermera.setBorderPainted(false);
        opcionEnfermera.setContentAreaFilled(false);
        opcionEnfermera.setFocusPainted(false);
        opcionEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionEnfermeraActionPerformed(evt);
            }
        });
        jPanel1.add(opcionEnfermera);
        opcionEnfermera.setBounds(410, 260, 160, 110);

        licencia.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        licencia.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(licencia);
        licencia.setBounds(560, 270, 180, 20);

        licenciaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        licenciaLabel.setText("No° Licencia:");
        jPanel1.add(licenciaLabel);
        licenciaLabel.setBounds(480, 270, 130, 20);

        universidadLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        universidadLabel.setText("Universidad:");
        jPanel1.add(universidadLabel);
        universidadLabel.setBounds(480, 300, 130, 20);

        universidad.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        universidad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(universidad);
        universidad.setBounds(560, 300, 180, 20);

        confirmarpass.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        confirmarpass.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(confirmarpass);
        confirmarpass.setBounds(290, 300, 180, 20);

        pass.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        pass.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(pass);
        pass.setBounds(290, 270, 180, 20);

        passLabel9.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        passLabel9.setText("Contraseña:");
        jPanel1.add(passLabel9);
        passLabel9.setBounds(180, 270, 160, 20);

        especialidadLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        especialidadLabel.setText("Especialidad:");
        jPanel1.add(especialidadLabel);
        especialidadLabel.setBounds(180, 240, 130, 20);

        especialidad.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        especialidad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(especialidad);
        especialidad.setBounds(290, 240, 180, 20);

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
        
        GUI_Administrador adminLogin = new GUI_Administrador();
        adminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
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
        id_empleado = consultarLabel.getText();
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
            
            if ( id_jefe.equals(medico.getId_jefe()) && id_area.equals(medico.getId_area()) 
                 && nombre_empleado.equals(medico.getNombre_empleado()) && direccion.equals(medico.getDireccion()) 
                 && telefono.equals(medico.getTelefono()) && salInt == medico.getSalario()
                 && email.equals(medico.getEmail()) && car.equals(medico.getCargo()) 
                 && numLi.equals(medico.getNumero_licencia()) && espe.equals(medico.getEspecialidad()) 
                 && uni.equals(medico.getUniversidad()) && contrasena.equals(medico.getContrasena())) {
                    
                    JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo.");
                } 
            else {
                int resultado = controladorMedico.actualizarMedico(id_empleado, id_jefe, id_area, nombre_empleado, 
                        direccion, telefono, sal, email, car, numLi, espe, uni, contrasena);
                    
                    switch(resultado){
                        case 2:
                            JOptionPane.showMessageDialog(null, "Los datos se han modificado exitosamente.");
                            consultarLabel.setText(null);           
                            cargo.setText(null);
                            confirmarpass.setText(null);
                            pass.setText(null);
                            dir.setText(null);                        
                            correo.setText(null);
                            tel.setText(null);
                            especialidad.setText(null);
                            idJefe.setText(null);
                            licencia.setText(null);
                            nombre.setText(null);
                            salario.setText(null);universidad.setText(null);
                            botonAceptar.setEnabled(false);
                            break;
                          
                        case 4:
                        JOptionPane.showMessageDialog(null, "El jefe ingresado no se encuentra en la base de datos.");
                        break;
                        
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar el medico.");
                            break;
                    }
                }
             
        }
    }//GEN-LAST:event_botonAceptarActionPerformed
    
    private void botonConsultarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarMedicoActionPerformed
        
        String cedulaConsulta = consultarLabel.getText();
        
        if (cedulaConsulta.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo de la consulta esta vacio.");
            
        } else if (!validaciones.validarNumero(cedulaConsulta)) {
            
            JOptionPane.showMessageDialog(null, "El campo consultar debe ser numerico.");
            
        } else {
            
           medico = controladorMedico.consultarDatosMedico(cedulaConsulta);
            
            if (medico != null) {

                listaAreas.setSelectedItem(controladorArea.seleccionArea(medico.getId_area()));
                cargo.setText(medico.getCargo());
                correo.setText(medico.getEmail());
                dir.setText(medico.getDireccion());
                especialidad.setText(medico.getEspecialidad());
                idJefe.setText(medico.getId_jefe());
                licencia.setText(medico.getNumero_licencia());
                nombre.setText(medico.getNombre_empleado());
                pass.setText(medico.getContrasena());
                confirmarpass.setText(medico.getContrasena());
                int sal = medico.getSalario();
                String salS = String.valueOf(sal);                        
                salario.setText(salS);
                tel.setText(medico.getTelefono());
                universidad.setText(medico.getUniversidad());
                botonAceptar.setEnabled(true);
                   
            } else {
                
                JOptionPane.showMessageDialog(null, "El medico no se encuentra registrado.");
            }
        }        
    }//GEN-LAST:event_botonConsultarMedicoActionPerformed
    
    private void botonConsultarEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarEnfermeraActionPerformed
        String cedulaConsulta = consultarLabel.getText();
        
        if (cedulaConsulta.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo de la consulta esta vacio.");
            
        } else if (!validaciones.validarNumero(cedulaConsulta)) {
            
            JOptionPane.showMessageDialog(null, "El campo consultar debe ser numerico.");
            
        } else {
            
           enfermera = controladorEnfermera.consultarDatosEnfermera(cedulaConsulta);
            
            if (enfermera != null) {

                listaAreas.setSelectedItem(controladorArea.seleccionArea(enfermera.getId_area()));
                cargo.setText(enfermera.getCargo());
                correo.setText(enfermera.getEmail());
                dir.setText(enfermera.getDireccion());
                idJefe.setText(enfermera.getId_jefe());
                nombre.setText(enfermera.getNombre_empleado());
                int sal = enfermera.getSalario();
                String salS = String.valueOf(sal);                        
                salario.setText(salS);
                tel.setText(enfermera.getTelefono());
                int an = enfermera.getAnos_experiencia();
                String anS = String.valueOf(an);                        
                anos.setText(anS);
                botonAceptarE.setEnabled(true);
                   
            } else {
                
                JOptionPane.showMessageDialog(null, "La enfermera no se encuentra registrada.");
            }
        } 
    }//GEN-LAST:event_botonConsultarEnfermeraActionPerformed

    private void opcionMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMedicoActionPerformed
        
        desapareceLabel.setVisible(false);
        desapareceLabel2.setVisible(false);
        preguntaLabel.setVisible(false);
        opcionMedico.setVisible(false);
        opcionEnfermera.setVisible(false);
        ingresarCedulaLabel.setVisible(true);
        botonConsultarMedico.setVisible(true);
        areaLabel.setVisible(true);
        botonAceptar.setVisible(true);
        botonCancelar.setVisible(true);
        cargo.setVisible(true);
        cargoLabel.setVisible(true);
        confirmarLabel10.setVisible(true);
        confirmarpass.setVisible(true);
        consultarLabel.setVisible(true);
        correo.setVisible(true);
        correoLabel.setVisible(true);
        dir.setVisible(true);
        dirLabel.setVisible(true);
        especialidad.setVisible(true);
        especialidadLabel.setVisible(true);
        idJefe.setVisible(true);
        idJefeLabel.setVisible(true);
        ingresarCedulaLabel.setVisible(true);
        licencia.setVisible(true);
        licenciaLabel.setVisible(true);
        listaAreas.setVisible(true);
        nombre.setVisible(true);
        nombreLabel.setVisible(true);
        pass.setVisible(true);
        passLabel9.setVisible(true);
        salario.setVisible(true);
        salarioLabel.setVisible(true);
        tel.setVisible(true);
        telLabel.setVisible(true);
        universidad.setVisible(true);
        universidadLabel.setVisible(true);
    }//GEN-LAST:event_opcionMedicoActionPerformed

    private void opcionEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionEnfermeraActionPerformed
        desapareceLabel.setVisible(false);
        desapareceLabel2.setVisible(false);
        preguntaLabel.setVisible(false);
        opcionMedico.setVisible(false);
        opcionEnfermera.setVisible(false);
        ingresarCedulaLabel.setVisible(true);
        botonConsultarEnfermera.setVisible(true);
        areaLabel.setVisible(true);
        botonAceptarE.setVisible(true);
        botonAceptarE.setEnabled(false);
        botonCancelar.setVisible(true);
        anosLabel.setVisible(true);
        anos.setVisible(true);
        cargo.setVisible(true);
        cargoLabel.setVisible(true);
        consultarLabel.setVisible(true);
        correo.setVisible(true);
        correoLabel.setVisible(true);
        dir.setVisible(true);
        dirLabel.setVisible(true);
        idJefe.setVisible(true);
        idJefeLabel.setVisible(true);
        ingresarCedulaLabel.setVisible(true);
        listaAreas.setVisible(true);
        nombre.setVisible(true);
        nombreLabel.setVisible(true);
        salario.setVisible(true);
        salarioLabel.setVisible(true);
        tel.setVisible(true);
        telLabel.setVisible(true);
        
    }//GEN-LAST:event_opcionEnfermeraActionPerformed

    private void botonAceptarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarEActionPerformed
         String id_empleado, id_jefe, id_area, id_area1, nombre_empleado, direccion, telefono, sal, email, car, an;
        an = "0";
        an = anos.getText();
        sal = "0";
        id_area1 = (String) listaAreas.getSelectedItem();
        String[] partes = id_area1.split(" ");
        id_area = partes[0];
        id_empleado = consultarLabel.getText();
        id_jefe = idJefe.getText();
        nombre_empleado = nombre.getText();
        direccion = dir.getText();
        telefono = tel.getText();
        sal = salario.getText();
        email = correo.getText();
        car = cargo.getText();
        
        if (nombre_empleado.equals("") || id_empleado.equals("") || id_jefe.equals("")  || id_area.equals("") ||
                sal.equals("") || email.equals("") || car.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }
        else if(!validaciones.validarLetrasEspacios(nombre_empleado) || !validaciones.validarLetrasEspacios(car) ) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos en nombre o cargo.");
        }
        else if(!validaciones.validarNumero(id_empleado) || !validaciones.validarNumero(telefono) || !validaciones.validarNumero(id_jefe)
                || !validaciones.validarNumero(sal) || !validaciones.validarNumero(an)) {
            JOptionPane.showMessageDialog(null, "Los campos de id, teléfono, años de experiencia y salario deben ser numéricos.");
        }
        else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(direccion)) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos en la dirección.");
        }
        else {
            int salInt = Integer.parseInt(sal);
            int anosI = 0;
                if(!an.equals("")){
                   anosI = Integer.parseInt (an); 
                }
            
            if ( id_jefe.equals(enfermera.getId_jefe()) && id_area.equals(enfermera.getId_area()) 
                 && nombre_empleado.equals(enfermera.getNombre_empleado()) && direccion.equals(enfermera.getDireccion()) 
                 && telefono.equals(enfermera.getTelefono()) && salInt == enfermera.getSalario()
                 && email.equals(enfermera.getEmail()) && car.equals(enfermera.getCargo()) 
                 && anosI == enfermera.getAnos_experiencia()) {
                    
                    JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo.");
                } 
            else {
                int resultado = controladorEnfermera.actualizarEnfermera(id_empleado, id_jefe, id_area, nombre_empleado, 
                        direccion, telefono, sal, email, car, an);
                    
                    switch(resultado){
                        case 2:
                            JOptionPane.showMessageDialog(null, "Los datos se han modificado exitosamente.");
                            consultarLabel.setText(null);           
                            cargo.setText(null);
                            anos.setText(null);
                            dir.setText(null);                        
                            correo.setText(null);
                            tel.setText(null);
                            idJefe.setText(null);
                            nombre.setText(null);
                            salario.setText(null);
                            botonAceptar.setEnabled(false);
                            break;
                          
                        case 4:
                        JOptionPane.showMessageDialog(null, "El jefe ingresado no se encuentra en la base de datos.");
                        break;
                        
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar la enfermera.");
                            break;
                    }
                }
             
        }
    }//GEN-LAST:event_botonAceptarEActionPerformed
    
    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_ModificarEmpleado().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anos;
    private javax.swing.JLabel anosLabel;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAceptarE;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultarEnfermera;
    private javax.swing.JButton botonConsultarMedico;
    private javax.swing.JTextField cargo;
    private javax.swing.JLabel cargoLabel;
    private javax.swing.JLabel confirmarLabel10;
    private javax.swing.JPasswordField confirmarpass;
    private javax.swing.JTextField consultarLabel;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JLabel desapareceLabel;
    private javax.swing.JLabel desapareceLabel2;
    private javax.swing.JTextField dir;
    private javax.swing.JLabel dirLabel;
    private javax.swing.JTextField especialidad;
    private javax.swing.JLabel especialidadLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField idJefe;
    private javax.swing.JLabel idJefeLabel;
    private javax.swing.JLabel ingresarCedulaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField licencia;
    private javax.swing.JLabel licenciaLabel;
    private javax.swing.JComboBox<String> listaAreas;
    private javax.swing.JLabel modificarEmpleadoLabel;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JButton opcionEnfermera;
    private javax.swing.JButton opcionMedico;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passLabel9;
    private javax.swing.JLabel preguntaLabel;
    private javax.swing.JTextField salario;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel telLabel;
    private javax.swing.JTextField universidad;
    private javax.swing.JLabel universidadLabel;
    // End of variables declaration//GEN-END:variables
}