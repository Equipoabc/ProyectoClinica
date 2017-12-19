package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class GUI_Agenda extends javax.swing.JFrame {
    
    Validaciones validaciones;
    DefaultTableModel modelo;
    ControladorCita controladorCita;
    ControladorMedico controladorMedico;
    String medico;
    
    public GUI_Agenda(String id){
        
        initComponents();
        medico = id;
        this.setLocationRelativeTo(null);
        controladorCita = new ControladorCita();
        controladorMedico = new ControladorMedico();
        validaciones = new Validaciones();
        if (validaciones.validarNumero(id)){
            listaMedico.setVisible(false);
            medicoLabel.setVisible(false);
        }
        else{
            ArrayList<String> lista = new ArrayList<String>();
            lista = controladorMedico.llenarCombo();
            
            for(int i=0; i < lista.size(); i++){
                listaMedico.addItem(lista.get(i));
            }
        }
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fila, int columna){
                
                return false;
            }
        };
        
        tabla.setModel(modelo);
        
        modelo.addColumn("Hora");
        modelo.addColumn("Paciente");
        modelo.addColumn("Nombre");
        
        tabla.getTableHeader().setReorderingAllowed(false);
        date.getDateEditor().setEnabled(false);
        date.getDateEditor().addPropertyChangeListener(
                
                new PropertyChangeListener() {
                    
                    @Override
                    public void propertyChange(PropertyChangeEvent e) {
                        
                        consultarAgenda();
                    }
                });
        date.setDate(GetDateNow());
    }
    
    private Date GetDateNow(){
        
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
    public void setMedico(String medico){
        
        this.medico = medico;
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
        listaMedico = new javax.swing.JComboBox<>();
        botonCancelar = new javax.swing.JButton();
        medicoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        date = new com.toedter.calendar.JDateChooser();
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
        jLabel6.setText("Agenda");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 200, 50);

        listaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(listaMedico);
        listaMedico.setBounds(450, 120, 180, 25);

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
        botonCancelar.setBounds(610, 100, 160, 70);

        medicoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        medicoLabel.setText("Médico:");
        jPanel1.add(medicoLabel);
        medicoLabel.setBounds(370, 120, 120, 30);

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
        jScrollPane1.setBounds(30, 170, 690, 310);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(380, 250, 0, 2);

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setForeground(new java.awt.Color(102, 102, 255));
        date.setFocusable(false);
        date.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        date.setMaxSelectableDate(new java.util.Date(3471314481000L));
        date.setMinSelectableDate(new java.util.Date(-1262282319000L));
        date.setRequestFocusEnabled(false);
        date.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(date);
        date.setBounds(140, 120, 180, 25);

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
    
    private void listaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMedicoActionPerformed
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        System.out.println(medico);
        if (validaciones.validarNumero(medico)){
            GUI_Medico medi = new GUI_Medico();
            medi.setId(medico);
            medi.setVisible(true);
            this.dispose();
        }
        else{
            GUI_InterfazInformes medi = new GUI_InterfazInformes();
            medi.setTipo(medico);
            medi.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void consultarAgenda(){
        
        String fecha = "";
        try {
            fecha = new SimpleDateFormat("dd/MM/YYYY").format(date.getDate());
        } catch(Exception e){
            System.out.println("Error al obtener la fecha.");
        }
        while(modelo.getRowCount() != 0){
            
            modelo.removeRow(0);
        }
        if (validaciones.validarNumero(medico)){
            controladorCita.consutarAgenda(fecha, medico, modelo, tabla);
        }
        else{
            String id_medico = (String) listaMedico.getSelectedItem();
            String[] partes = id_medico.split(" ");
            String medico_id = partes[0];
            controladorCita.consutarAgenda(fecha, medico_id, modelo, tabla);
        }
    }
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_Agenda("").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel fondo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> listaMedico;
    private javax.swing.JLabel medicoLabel;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}