package GUI;
import Controladores.*;
import Logica.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_HistoriaClinica extends javax.swing.JFrame {
    
    Validaciones validaciones;
    DefaultTableModel modelo;
    ControladorPaciente controladorPaciente;
    ControladorRegistro controladorRegistro;
    ControladorHistoria_clinica controladorHistoria_clinica;
    ControladorCita controladorCita;
    private String tipos;
    
    public GUI_HistoriaClinica(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        validaciones = new Validaciones();
        controladorCita = new ControladorCita();
        controladorHistoria_clinica = new ControladorHistoria_clinica();
        controladorPaciente = new ControladorPaciente();
        controladorRegistro = new ControladorRegistro();
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fila, int columna){
                
                return false;
            }
        };
        
        tabla.setModel(modelo);
        
        modelo.addColumn("Número Registro");    
        modelo.addColumn("Formula Medica");

        tabla.getTableHeader().setReorderingAllowed(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        nombrePacienteLabel = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Historia Clinica");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 410, 50);

        nombreLabel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jPanel1.add(nombreLabel);
        nombreLabel.setBounds(130, 160, 510, 30);

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
        botonCancelar.setBounds(620, 150, 120, 60);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hora", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 210, 690, 270);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(380, 250, 0, 2);

        jLabel2.setText("Cedula:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 120, 60, 20);
        jPanel1.add(campoCedula);
        campoCedula.setBounds(450, 120, 170, 30);

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar);
        consultar.setBounds(630, 120, 100, 30);

        nombrePacienteLabel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        nombrePacienteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePacienteLabel.setText("Nombre:");
        jPanel1.add(nombrePacienteLabel);
        nombrePacienteLabel.setBounds(30, 160, 100, 30);

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
        
        GUI_InterfazInformes administrador = new GUI_InterfazInformes();
        administrador.setTipo(tipos);
        administrador.setVisible(true);
        
        this.dispose();                   
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        Paciente paciente = new Paciente();
        paciente = controladorPaciente.consultarDatosPaciente(campoCedula.getText());
        if (paciente == null){
            JOptionPane.showMessageDialog(null, "no existe el paciente.");
        }
        else {
            nombreLabel.setText(paciente.getNombre_paciente());
        }
            
        consultarHistoria();
    }//GEN-LAST:event_consultarActionPerformed
    
    private void consultarHistoria(){
        
        String cedula;
                
        cedula = campoCedula.getText(); 
        
        
        campoCedula.setText("");
        
        while(modelo.getRowCount() != 0){
            
            modelo.removeRow(0);
        }
        
        controladorHistoria_clinica.consultarHistoria(cedula, modelo, tabla);

    }
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_HistoriaClinica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JButton consultar;
    private javax.swing.JLabel fondo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombrePacienteLabel;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    void setTipo(String tipo) {
        this.tipos = tipo;
    }
}