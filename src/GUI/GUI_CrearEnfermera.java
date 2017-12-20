package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GUI_CrearEnfermera extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorEnfermera controladorEnfermera;
    ControladorArea controladorArea;
    String id_empleado;
    
    public GUI_CrearEnfermera(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        id_empleado = "";
        controladorEnfermera = new ControladorEnfermera();
        controladorArea = new ControladorArea();
        validaciones = new Validaciones();
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorArea.llenarCombo();
        
        for(int i=0; i < lista.size(); i++){
            listaAreas.addItem(lista.get(i));
        }
        habilidadesBoton.setVisible(false);
        habilidadesCampo.setVisible(false);
        habilidadesTitulo.setVisible(false);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaOpciones = new javax.swing.JList<>();
        cedulaLabel1 = new javax.swing.JLabel();
        primerNombreLabel6 = new javax.swing.JLabel();
        adicionar3 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAdiciones = new javax.swing.JList<>();
        cedulaLabel2 = new javax.swing.JLabel();
        adicionar4 = new javax.swing.JButton();
        eliminar1 = new javax.swing.JButton();
        adicionar5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        registrarEnfermeraLabel = new javax.swing.JLabel();
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
        crearEnfermera = new javax.swing.JButton();
        listaAreas = new javax.swing.JComboBox<>();
        salario = new javax.swing.JTextField();
        salarioLabel = new javax.swing.JLabel();
        idJefeLabel = new javax.swing.JLabel();
        idJefe = new javax.swing.JTextField();
        cargoLabel = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        correoLabel = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        anos = new javax.swing.JTextField();
        anosLabel = new javax.swing.JLabel();
        habilidadesBoton = new javax.swing.JButton();
        habilidadesCampo = new javax.swing.JTextField();
        habilidadesTitulo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jScrollPane1.setViewportView(listaOpciones);

        cedulaLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel1.setText("Causas disponibles");

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel6.setText("Agregar causas");

        adicionar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        adicionar3.setBorder(null);
        adicionar3.setBorderPainted(false);
        adicionar3.setContentAreaFilled(false);
        adicionar3.setFocusPainted(false);
        adicionar3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        adicionar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        adicionar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionar3ActionPerformed(evt);
            }
        });

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setFocusPainted(false);
        eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarPeq.png"))); // NOI18N
        eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaAdiciones);

        cedulaLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel2.setText("Causas seleccionadas");

        adicionar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        adicionar4.setBorder(null);
        adicionar4.setBorderPainted(false);
        adicionar4.setContentAreaFilled(false);
        adicionar4.setFocusPainted(false);
        adicionar4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        adicionar4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        adicionar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionar4ActionPerformed(evt);
            }
        });

        eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
        eliminar1.setBorder(null);
        eliminar1.setBorderPainted(false);
        eliminar1.setContentAreaFilled(false);
        eliminar1.setFocusPainted(false);
        eliminar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarPeq.png"))); // NOI18N
        eliminar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar1ActionPerformed(evt);
            }
        });

        adicionar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        adicionar5.setBorder(null);
        adicionar5.setBorderPainted(false);
        adicionar5.setContentAreaFilled(false);
        adicionar5.setFocusPainted(false);
        adicionar5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        adicionar5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        adicionar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionar5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        registrarEnfermeraLabel.setBackground(new java.awt.Color(255, 255, 255));
        registrarEnfermeraLabel.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        registrarEnfermeraLabel.setForeground(new java.awt.Color(255, 255, 255));
        registrarEnfermeraLabel.setText("Registrar Enfermera");
        jPanel1.add(registrarEnfermeraLabel);
        registrarEnfermeraLabel.setBounds(130, 50, 280, 50);

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
        botonCancelar.setBounds(330, 430, 130, 70);

        tel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(tel);
        tel.setBounds(140, 260, 180, 20);

        telLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telLabel.setText("Telefono:");
        jPanel1.add(telLabel);
        telLabel.setBounds(60, 260, 60, 20);

        dir.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        dir.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(dir);
        dir.setBounds(530, 260, 180, 20);

        dirLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        dirLabel.setText("Dirección:");
        jPanel1.add(dirLabel);
        dirLabel.setBounds(440, 260, 70, 20);

        areaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        areaLabel.setText("Area:");
        jPanel1.add(areaLabel);
        areaLabel.setBounds(80, 230, 40, 20);

        nombre.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombre);
        nombre.setBounds(530, 230, 180, 20);

        nombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombreLabel.setText("Nombre:");
        jPanel1.add(nombreLabel);
        nombreLabel.setBounds(450, 230, 60, 20);

        idLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idLabel.setText("Id Enfermera:");
        jPanel1.add(idLabel);
        idLabel.setBounds(40, 200, 90, 20);

        id.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        id.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(id);
        id.setBounds(140, 200, 180, 20);

        crearEnfermera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        crearEnfermera.setBorder(null);
        crearEnfermera.setBorderPainted(false);
        crearEnfermera.setContentAreaFilled(false);
        crearEnfermera.setFocusPainted(false);
        crearEnfermera.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        crearEnfermera.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        crearEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEnfermeraActionPerformed(evt);
            }
        });
        crearEnfermera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                crearEnfermeraKeyPressed(evt);
            }
        });
        jPanel1.add(crearEnfermera);
        crearEnfermera.setBounds(160, 430, 160, 70);

        jPanel1.add(listaAreas);
        listaAreas.setBounds(140, 230, 180, 20);

        salario.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        salario.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(salario);
        salario.setBounds(530, 290, 180, 20);

        salarioLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        salarioLabel.setText("Salario:");
        jPanel1.add(salarioLabel);
        salarioLabel.setBounds(450, 290, 50, 20);

        idJefeLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idJefeLabel.setText("Id Jefe:");
        jPanel1.add(idJefeLabel);
        idJefeLabel.setBounds(70, 320, 50, 20);

        idJefe.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idJefe.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(idJefe);
        idJefe.setBounds(140, 320, 180, 20);

        cargoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cargoLabel.setText("Cargo:");
        jPanel1.add(cargoLabel);
        cargoLabel.setBounds(450, 320, 60, 20);

        cargo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cargo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cargo);
        cargo.setBounds(530, 320, 180, 20);

        correoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        correoLabel.setText("Correo:");
        jPanel1.add(correoLabel);
        correoLabel.setBounds(60, 290, 50, 20);

        correo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(140, 290, 180, 20);

        anos.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        anos.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(anos);
        anos.setBounds(530, 200, 180, 20);

        anosLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        anosLabel.setText("Años Experiencia:");
        jPanel1.add(anosLabel);
        anosLabel.setBounds(410, 200, 110, 20);

        habilidadesBoton.setText("Agregar habilidad");
        habilidadesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habilidadesBotonActionPerformed(evt);
            }
        });
        jPanel1.add(habilidadesBoton);
        habilidadesBoton.setBounds(560, 440, 130, 23);
        jPanel1.add(habilidadesCampo);
        habilidadesCampo.setBounds(540, 410, 160, 20);

        habilidadesTitulo.setText("Agregar habilidades");
        jPanel1.add(habilidadesTitulo);
        habilidadesTitulo.setBounds(540, 380, 130, 14);

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
        
        GUI_InterfazEmpleados operador = new GUI_InterfazEmpleados();
        operador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void crearEnfermera(){
        
        String id_jefe, id_area, id_area1, nombre_empleado, direccion, telefono, sal, email, car, anosS;
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
        anosS = anos.getText();
                
        if (nombre_empleado.equals("") || id_empleado.equals("") || id_jefe.equals("") || id_area.equals("") ||
                sal.equals("") || email.equals("") || car.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }
        else if(!validaciones.validarLetrasEspacios(nombre_empleado) || !validaciones.validarLetrasEspacios(car)) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos en nombre o cargo.");
        }
        else if(!validaciones.validarNumero(id_empleado) || !validaciones.validarNumero(telefono) || !validaciones.validarNumero(id_jefe)
                || !validaciones.validarNumero(sal) || !validaciones.validarNumero(anosS)) {
            JOptionPane.showMessageDialog(null, "Los campos de id, teléfono, años y salario deben ser numéricos.");
        }
        else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(direccion)) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos en la dirección.");
        }
        else {
                int salInt = Integer.parseInt(sal);
                int anosI = 0;
                if(!anosS.equals("")){
                   anosI = Integer.parseInt (anosS); 
                }
                
                int numFilas = controladorEnfermera.insertarEnfermera(id_empleado, 
                        id_jefe, id_area, nombre_empleado, direccion, telefono, salInt, email, car, anosI);
                
                switch (numFilas) {
                    case 2:
                        habilidadesBoton.setVisible(true);
                        habilidadesCampo.setVisible(true);
                        habilidadesTitulo.setVisible(true);
                        crearEnfermera.setEnabled(false);
                        JOptionPane.showMessageDialog(null, "Enfermera creado exitosamente.");
                        id.setText(null);
                        nombre.setText(null);
                        idJefe.setText(null);
                        dir.setText(null);
                        tel.setText(null);
                        cargo.setText(null);
                        salario.setText(null);
                        correo.setText(null);
                        anos.setText(null);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Ya existe un empleado registrado con este id.");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "El jefe ingresado no se encuentra en la base de datos.");
                        break;     
                    default:
                        JOptionPane.showMessageDialog(null, "Ocurrió un problema al guardar la enfermera.");
                        break;
                }
        }
    }
    
    private void crearEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEnfermeraActionPerformed
        
        crearEnfermera();        
    }//GEN-LAST:event_crearEnfermeraActionPerformed
    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed

    }//GEN-LAST:event_fechaKeyPressed
    private void crearEnfermeraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crearEnfermeraKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearEnfermera();}
    }//GEN-LAST:event_crearEnfermeraKeyPressed
    private void adicionar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionar3ActionPerformed

    }//GEN-LAST:event_adicionar3ActionPerformed
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

    }//GEN-LAST:event_eliminarActionPerformed
    private void adicionar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionar4ActionPerformed

    }//GEN-LAST:event_adicionar4ActionPerformed
    private void eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar1ActionPerformed

    }//GEN-LAST:event_eliminar1ActionPerformed
    private void adicionar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionar5ActionPerformed

    }//GEN-LAST:event_adicionar5ActionPerformed

    private void habilidadesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habilidadesBotonActionPerformed
        
        String habilidadX = "";
        habilidadX = habilidadesCampo.getText();
        habilidadesCampo.setText("");
        
        if(habilidadX.length() > 20){
            
            JOptionPane.showMessageDialog(null, "El campo habilidad es de 20 caracteres maximo.");
        }
        else {
            int resultado = controladorEnfermera.agregarHabilidad(id_empleado, habilidadX);        
            if(resultado == 1){
            
                JOptionPane.showMessageDialog(null, "Se agrego la habilidad " + habilidadX + " correctamente.");
            }   
            else {
            
                JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar la habilidad.");
            }
        }
    }//GEN-LAST:event_habilidadesBotonActionPerformed
        
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_CrearEnfermera().setVisible(true);
            }
        });
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar3;
    private javax.swing.JButton adicionar4;
    private javax.swing.JButton adicionar5;
    private javax.swing.JTextField anos;
    private javax.swing.JLabel anosLabel;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField cargo;
    private javax.swing.JLabel cargoLabel;
    private javax.swing.JLabel cedulaLabel1;
    private javax.swing.JLabel cedulaLabel2;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JButton crearEnfermera;
    private javax.swing.JTextField dir;
    private javax.swing.JLabel dirLabel;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminar1;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton habilidadesBoton;
    private javax.swing.JTextField habilidadesCampo;
    private javax.swing.JLabel habilidadesTitulo;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idJefe;
    private javax.swing.JLabel idJefeLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaAdiciones;
    private javax.swing.JComboBox<String> listaAreas;
    private javax.swing.JList<String> listaOpciones;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel primerNombreLabel6;
    private javax.swing.JLabel registrarEnfermeraLabel;
    private javax.swing.JTextField salario;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel telLabel;
    // End of variables declaration//GEN-END:variables
}