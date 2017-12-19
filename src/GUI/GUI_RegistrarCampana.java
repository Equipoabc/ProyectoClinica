
package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
//import java.util.Date;

public class GUI_RegistrarCampana extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorCampana controladorCampana;
    ControladorMedico controladorMedico;    
    String id;
    
    
    public GUI_RegistrarCampana(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorCampana = new ControladorCampana();
        controladorMedico = new ControladorMedico();        
        validaciones = new Validaciones();
        fechaText.setMinSelectableDate(GetDateNow());
        fechaText.getDateEditor().setEnabled(false);
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorMedico.llenarCombo();
        
        for(int i=0; i < lista.size(); i++){
            listaMedico.addItem(lista.get(i));
        }
           
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
        jLabel6 = new javax.swing.JLabel();
        primerNombreLabel8 = new javax.swing.JLabel();
        primerNombreLabel2 = new javax.swing.JLabel();
        primerNombreLabel1 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        codigoText = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        fechaText = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        objetivoText = new javax.swing.JTextArea();
        listaMedico = new javax.swing.JComboBox<>();
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
        botonCancelar.setBounds(370, 390, 160, 70);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrar Campaña");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 300, 50);

        primerNombreLabel8.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel8.setText("Médico:");
        jPanel1.add(primerNombreLabel8);
        primerNombreLabel8.setBounds(230, 320, 120, 30);

        primerNombreLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel2.setText("Objetivo:");
        jPanel1.add(primerNombreLabel2);
        primerNombreLabel2.setBounds(230, 230, 60, 30);

        primerNombreLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel1.setText("Fecha:");
        jPanel1.add(primerNombreLabel1);
        primerNombreLabel1.setBounds(240, 290, 60, 30);

        nombreText.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombreText.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombreText);
        nombreText.setBounds(300, 190, 180, 25);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(240, 190, 180, 30);

        codigoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        codigoLabel.setText("Código:");
        jPanel1.add(codigoLabel);
        codigoLabel.setBounds(240, 130, 50, 50);

        codigoText.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        codigoText.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(codigoText);
        codigoText.setBounds(300, 140, 180, 25);

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        aceptar.setBorder(null);
        aceptar.setBorderPainted(false);
        aceptar.setContentAreaFilled(false);
        aceptar.setFocusPainted(false);
        aceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        aceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(aceptar);
        aceptar.setBounds(220, 390, 160, 70);

        fechaText.setBackground(new java.awt.Color(255, 255, 255));
        fechaText.setForeground(new java.awt.Color(102, 102, 255));
        fechaText.setFocusable(false);
        fechaText.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fechaText.setMaxSelectableDate(new java.util.Date(3471314481000L));
        fechaText.setMinSelectableDate(new java.util.Date(-1262282319000L));
        fechaText.setRequestFocusEnabled(false);
        fechaText.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fechaText);
        fechaText.setBounds(300, 290, 180, 25);

        objetivoText.setColumns(20);
        objetivoText.setRows(5);
        jScrollPane1.setViewportView(objetivoText);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 230, 230, 40);

        listaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(listaMedico);
        listaMedico.setBounds(300, 330, 180, 25);

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
        
        GUI_InterfazCampana operador = new GUI_InterfazCampana();
            operador.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void registrarCampana(){
        String codigo, nombre, objetivo, medico, date = "", validar = "";
        nombre = nombreText.getText();
        codigo = codigoText.getText();
        objetivo = objetivoText.getText();
        
        try {
            date = new SimpleDateFormat("dd/MM/YYYY").format(fechaText.getDate());
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }
        
        String id_medico = (String) listaMedico.getSelectedItem();
        String[] partes = id_medico.split(" ");
        medico = partes[0];

        
        if (nombre.equals("") || codigo.equals("") || date.equals("") || objetivo.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios. " + validar + ".");
        }
        else if(!validaciones.validarNumero(codigo)) {
            JOptionPane.showMessageDialog(null, "El campo código debe ser numérico.");
        }
        else if(!validaciones.validarLetrasYNumerosEspacios(nombre) || !validaciones.validarLetrasYNumerosEspacios(objetivo)) {
            JOptionPane.showMessageDialog(null, "Caracteres inválidos.");
        }
        else {
            int numFilas = controladorCampana.insertarCampana(nombre, codigo, objetivo, medico, date);
            switch (numFilas) {
                case 2:
                    JOptionPane.showMessageDialog(null, "La campaña con código " + codigo + " ya existe.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "La campaña ha sido creada exitosamente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al registrar la campaña.");
                    break;
            }
        }
    }
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
       registrarCampana();
    }//GEN-LAST:event_aceptarActionPerformed

    private void listaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMedicoActionPerformed

   //Fin eventos del teclado
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_RegistrarCampana().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoText;
    private com.toedter.calendar.JDateChooser fechaText;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listaMedico;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextArea objetivoText;
    private javax.swing.JLabel primerNombreLabel1;
    private javax.swing.JLabel primerNombreLabel2;
    private javax.swing.JLabel primerNombreLabel8;
    private javax.swing.JLabel segundoNombreLabel;
    // End of variables declaration//GEN-END:variables
    
}