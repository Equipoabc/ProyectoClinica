package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class GUI_RegistrarMedicamento extends javax.swing.JFrame {
    
   // Validaciones validaciones;
    ControladorMedicamento controladorMedicamento;
    Validaciones validaciones;
    
    public GUI_RegistrarMedicamento(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorMedicamento = new ControladorMedicamento();
        validaciones = new Validaciones();    

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        estadoLabel = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        numeroCamaLabel = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionText = new javax.swing.JTextArea();
        costoText = new javax.swing.JTextField();
        codigoText = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrar Medicamento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 40, 330, 50);

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
        botonCancelar.setBounds(380, 370, 130, 70);

        estadoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        estadoLabel.setText("Costo:");
        jPanel1.add(estadoLabel);
        estadoLabel.setBounds(260, 300, 170, 30);

        descripcionLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        descripcionLabel.setText("Descripción:");
        jPanel1.add(descripcionLabel);
        descripcionLabel.setBounds(250, 210, 170, 30);

        areaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        areaLabel.setText("Nombre:");
        jPanel1.add(areaLabel);
        areaLabel.setBounds(250, 170, 180, 30);

        numeroCamaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        numeroCamaLabel.setText("Código:");
        jPanel1.add(numeroCamaLabel);
        numeroCamaLabel.setBounds(250, 130, 170, 30);

        nombreText.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombreText.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombreText);
        nombreText.setBounds(360, 170, 180, 20);

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
        botonAceptar.setBounds(220, 370, 160, 70);

        descripcionText.setColumns(20);
        descripcionText.setRows(5);
        jScrollPane2.setViewportView(descripcionText);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(360, 210, 240, 80);

        costoText.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        costoText.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(costoText);
        costoText.setBounds(360, 300, 180, 20);

        codigoText.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        codigoText.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(codigoText);
        codigoText.setBounds(360, 130, 180, 20);

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
        
        GUI_InterfazMedicamentos operador = new GUI_InterfazMedicamentos();
            operador.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void registrarMedicamento(){
        String codigo, nombre, descripcion, validar = "";
        int costo = 0;
        codigo = codigoText.getText();
        nombre = nombreText.getText();
        descripcion = descripcionText.getText();
        costo = Integer.parseInt(costoText.getText());  
             
       
        if (nombre.equals("") || codigo.equals("") || descripcion.equals("") || costoText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios." + validar);
        }

        else if(!validaciones.validarNumero(codigo) ) {
            JOptionPane.showMessageDialog(null, "El campo código debe ser numérico.");
        }
        else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(descripcion) ) {
            JOptionPane.showMessageDialog(null, "Caracteres inválidos.");
        }        
        else {
                          
                int numFilas = controladorMedicamento.insertarMedicamento(codigo, nombre, descripcion, costo);
                                    
                switch (numFilas) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "El medicamento ha sido registrado existosamente.");
                        nombreText.setText(null);                     
                        descripcionText.setText(null);
                        break;                   
                    case 2:
                        JOptionPane.showMessageDialog(null, "El medicamento con código " + codigo + " ya existe.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ocurrió un problema. Intente nuevamente.");
                        break;
                }            

        }
    }
    //Inicio escuchas
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        registrarMedicamento();
        
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
     
    }//GEN-LAST:event_fechaKeyPressed
    //Fin escuchas
    
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_RegistrarMedicamento().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaLabel;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField codigoText;
    private javax.swing.JTextField costoText;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JTextArea descripcionText;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel numeroCamaLabel;
    // End of variables declaration//GEN-END:variables
}