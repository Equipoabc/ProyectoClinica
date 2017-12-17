package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;


public class GUI_ProgramarCita extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorPaciente controladorPaciente;
    ControladorMedico controladorMedico;
    ControladorCita controladorCita;
        
    public GUI_ProgramarCita(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorPaciente = new ControladorPaciente();
        controladorMedico = new ControladorMedico();
        controladorCita = new ControladorCita();
        validaciones = new Validaciones();
        fecha.setMinSelectableDate(GetDateNow());
        fecha.setDate(GetDateNow());
        fecha.getDateEditor().setEnabled(false);
    }
    
    private Date GetDateNow() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        programarCitaLabel = new javax.swing.JLabel();
        horaLabel = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        preciolabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        id_empleado = new javax.swing.JTextField();
        idMedicoLabel = new javax.swing.JLabel();
        idPacienteLabel = new javax.swing.JLabel();
        id_paciente = new javax.swing.JTextField();
        programarCita = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        horas = new javax.swing.JComboBox<>();
        minutos = new javax.swing.JComboBox<>();
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

        programarCitaLabel.setBackground(new java.awt.Color(255, 255, 255));
        programarCitaLabel.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        programarCitaLabel.setForeground(new java.awt.Color(255, 255, 255));
        programarCitaLabel.setText("Programar Cita");
        jPanel1.add(programarCitaLabel);
        programarCitaLabel.setBounds(140, 50, 210, 50);

        horaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        horaLabel.setText("Hora:");
        jPanel1.add(horaLabel);
        horaLabel.setBounds(390, 200, 70, 40);

        precio.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        precio.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(precio);
        precio.setBounds(150, 260, 180, 25);

        preciolabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        preciolabel.setText("Precio:");
        jPanel1.add(preciolabel);
        preciolabel.setBounds(90, 260, 180, 20);

        fechaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        fechaLabel.setText("Fecha:");
        jPanel1.add(fechaLabel);
        fechaLabel.setBounds(90, 210, 170, 20);

        id_empleado.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        id_empleado.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(id_empleado);
        id_empleado.setBounds(460, 150, 180, 25);

        idMedicoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idMedicoLabel.setText("Id Medico:");
        jPanel1.add(idMedicoLabel);
        idMedicoLabel.setBounds(390, 150, 180, 20);

        idPacienteLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idPacienteLabel.setText("Id Paciente:");
        jPanel1.add(idPacienteLabel);
        idPacienteLabel.setBounds(70, 150, 70, 20);

        id_paciente.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        id_paciente.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(id_paciente);
        id_paciente.setBounds(150, 150, 180, 25);

        programarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        programarCita.setBorder(null);
        programarCita.setBorderPainted(false);
        programarCita.setContentAreaFilled(false);
        programarCita.setFocusPainted(false);
        programarCita.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        programarCita.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        programarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programarCitaActionPerformed(evt);
            }
        });
        programarCita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                programarCitaKeyPressed(evt);
            }
        });
        jPanel1.add(programarCita);
        programarCita.setBounds(220, 380, 160, 70);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(3471314481000L));
        fecha.setMinSelectableDate(new java.util.Date(-1262282319000L));
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fecha);
        fecha.setBounds(150, 210, 180, 25);

        horas.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        horas.setForeground(new java.awt.Color(102, 102, 255));
        horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", " " }));
        horas.setFocusable(false);
        jPanel1.add(horas);
        horas.setBounds(460, 200, 60, 40);

        minutos.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        minutos.setForeground(new java.awt.Color(102, 102, 255));
        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "30", " " }));
        minutos.setFocusable(false);
        jPanel1.add(minutos);
        minutos.setBounds(540, 200, 53, 40);

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
        
        GUI_Operador operador = new GUI_Operador();
        operador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void programarCita(){
        String id_empleadoS, id_pacienteS, fechaS, hora, min, horario, validar, precioS;
        validar = "";
        fechaS = "";
        id_empleadoS = id_empleado.getText();
        id_pacienteS = id_paciente.getText();
        try {
            fechaS = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }
        precioS = precio.getText();
        hora = (String) horas.getSelectedItem();
        min = (String) minutos.getSelectedItem();
        horario = hora + ":" + min;
        
        if (id_empleadoS.equals("") || id_pacienteS.equals("") || fechaS.equals("") || precioS.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios" + validar + ".");
        }
        else if(!validaciones.validarNumero(id_empleadoS) || !validaciones.validarNumero(id_pacienteS)
                || !validaciones.validarNumero(precioS)) {
            JOptionPane.showMessageDialog(null, "Los campos id y precio deben ser números (sin puntos).");
        }
        else {
            int numFilas = controladorCita.insertarCita(id_empleadoS, id_pacienteS, fechaS, horario, precioS);
            switch (numFilas) {
                case 2:
                    JOptionPane.showMessageDialog(null, "Horario no disponible del medico.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Cita creada exitosamente.");
                    id_empleado.setText(null);
                    id_paciente.setText(null);
                    precio.setText(null);
                    horas.setSelectedItem("0");
                    minutos.setSelectedItem("0");
                    fecha.setDate(GetDateNow());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El medico no se encuentra registrado.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El paciente no se encuentra registrado.");
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al crear la cita.");
                    break;
            }
        }
    }
    private void programarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programarCitaActionPerformed
        
        programarCita();
    }//GEN-LAST:event_programarCitaActionPerformed

    private void programarCitaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_programarCitaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            programarCita();
        }
    }//GEN-LAST:event_programarCitaKeyPressed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_ProgramarCita().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel horaLabel;
    private javax.swing.JComboBox<String> horas;
    private javax.swing.JLabel idMedicoLabel;
    private javax.swing.JLabel idPacienteLabel;
    private javax.swing.JTextField id_empleado;
    private javax.swing.JTextField id_paciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> minutos;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel preciolabel;
    private javax.swing.JButton programarCita;
    private javax.swing.JLabel programarCitaLabel;
    // End of variables declaration//GEN-END:variables
    
}