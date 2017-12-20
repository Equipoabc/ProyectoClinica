package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.util.*;

public class GUI_InscribirCampana extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorPaciente controladorPaciente;
    ControladorCampana controladorCampana;
    ControladorCampanas_Pacientes controladorCampanas_Pacientes;
    Paciente paciente;
    String tipo;

    public GUI_InscribirCampana(){
        
        initComponents();
        this.setLocationRelativeTo(null);  
        tipo = "";
        controladorPaciente = new ControladorPaciente();  
        controladorCampanas_Pacientes = new ControladorCampanas_Pacientes();
        controladorCampana = new ControladorCampana();
        paciente = new Paciente();
        validaciones = new Validaciones();
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorCampana.llenarCombo();
        
        for(int i=0; i < lista.size(); i++){
            listaCampanas.addItem(lista.get(i));
        }
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        cedulaText = new javax.swing.JTextField();
        cedulaLabel = new javax.swing.JLabel();
        campanaLabel = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        precioLabelEditar = new javax.swing.JLabel();
        nombreEventoEditar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cambioLabelEditar = new javax.swing.JLabel();
        listaCampanas = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
        botonCancelar.setBounds(360, 310, 140, 90);

        cedulaText.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedulaText.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cedulaText);
        cedulaText.setBounds(380, 150, 150, 25);

        cedulaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel.setText("Cédula del Paciente:");
        jPanel1.add(cedulaLabel);
        cedulaLabel.setBounds(190, 150, 130, 30);

        campanaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        campanaLabel.setText("Código de Campaña:");
        jPanel1.add(campanaLabel);
        campanaLabel.setBounds(190, 210, 140, 30);

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
        botonAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonAceptarKeyPressed(evt);
            }
        });
        jPanel1.add(botonAceptar);
        botonAceptar.setBounds(220, 310, 140, 90);

        precioLabelEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(precioLabelEditar);
        precioLabelEditar.setBounds(460, 330, 110, 20);

        nombreEventoEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(nombreEventoEditar);
        nombreEventoEditar.setBounds(460, 300, 110, 20);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Inscripción a Campaña");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 40, 340, 50);

        cambioLabelEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(cambioLabelEditar);
        cambioLabelEditar.setBounds(460, 390, 150, 20);

        jPanel1.add(listaCampanas);
        listaCampanas.setBounds(380, 210, 150, 25);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(0, -10, 750, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        if(validaciones.validarNumero(tipo)){
            GUI_Medico operador = new GUI_Medico();
            operador.setId(tipo);
            operador.setVisible(true);
            this.dispose();
        }
        else{
            GUI_Operador operador = new GUI_Operador();
            operador.setVisible(true);
            this.dispose();
        }
         
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void asignarCampana(){
       
        String cedula, codigoCampana, validar = "";         
        cedula = cedulaText.getText();
        String dato = (String) listaCampanas.getSelectedItem();
        String[] partes = dato.split(" ");
        codigoCampana = partes[0];
        int numFilas = 0;
        
        paciente = controladorPaciente.consultarDatosPaciente(cedula);
        if (cedula.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios" + validar + ".");
        }
        else if(!validaciones.validarNumero(cedula)) {
            JOptionPane.showMessageDialog(null, "Los campos de cédula deben ser numéricos.");
        }
        else if(paciente == null){
            JOptionPane.showMessageDialog(null, "El paciente con cédula: "+cedula+" no se encuentra registrado.");
        }      
        else {
                numFilas = controladorCampanas_Pacientes.asignarPaciente(cedula, codigoCampana);
           
            
            switch (numFilas) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Le paciente fue inscrito a la campaña exitosamente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El paciente ya se encuentra inscrito en esta campaña");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al inscribir el paciente.");
                    break;
            }
            
        }
    }
    

    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
      asignarCampana();
     
    }//GEN-LAST:event_botonAceptarActionPerformed
 
    private void botonAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonAceptarKeyPressed
      
    }//GEN-LAST:event_botonAceptarKeyPressed
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_InscribirCampana().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel cambioLabelEditar;
    private javax.swing.JLabel campanaLabel;
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JTextField cedulaText;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaCampanas;
    private javax.swing.JComboBox<String> listaCitas;
    private javax.swing.JComboBox<String> listaCitas1;
    private javax.swing.JLabel nombreEventoEditar;
    private javax.swing.JLabel precioLabelEditar;
    // End of variables declaration//GEN-END:variables

    void setTipo(String id) {
        this.tipo = id;
    }

    
    
}