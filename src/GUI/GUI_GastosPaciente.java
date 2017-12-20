package GUI;
import Controladores.*;
import Logica.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GUI_GastosPaciente extends javax.swing.JFrame {
    
    Validaciones validaciones;
    DefaultTableModel modelo;
    ControladorPaciente controladorPaciente;
    ControladorCita controladorCita;
    
    public GUI_GastosPaciente(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        validaciones = new Validaciones();
        controladorPaciente = new ControladorPaciente();
        controladorCita = new ControladorCita();
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fila, int columna){
                
                return false;
            }
        };
        
        tabla.setModel(modelo);
        
        modelo.addColumn("Cedula");
        modelo.addColumn("Paciente");
        modelo.addColumn("Consultas");
        modelo.addColumn("Medicamentos");
        
        tabla.getTableHeader().setReorderingAllowed(false);
        tipoReporte.setSelectedIndex(0);
        
        meses.addItem("01 Enero");
        meses.addItem("02 Febrero");
        meses.addItem("03 Marzo");
        meses.addItem("04 Abril");
        meses.addItem("05 Mayo");
        meses.addItem("06 Junio");
        meses.addItem("07 Julio");
        meses.addItem("08 Agosto");
        meses.addItem("09 Septiembre");
        meses.addItem("10 Octubre");
        meses.addItem("11 Noviembre");
        meses.addItem("12 Diciembre");
        /*
        anos.addItem("2000");
        anos.addItem("2001");
        anos.addItem("2002");
        anos.addItem("2003");
        anos.addItem("2004");
        anos.addItem("2005");
        anos.addItem("2017");*/
        
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorCita.llenarAnos();
        
        for(int i=0; i < lista.size(); i++){
            
            anos.addItem(lista.get(i));
        }
        
        meses.setVisible(false);
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
        botonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tipoReporte = new javax.swing.JComboBox<>();
        anos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        meses = new javax.swing.JComboBox<>();
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
        jLabel6.setText("Gastos promedio pacientes");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 410, 50);

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
        botonCancelar.setBounds(620, 130, 120, 60);

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

        jLabel1.setText("Reporte:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 140, 60, 20);

        tipoReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anual", "Mensual" }));
        tipoReporte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoReporteItemStateChanged(evt);
            }
        });
        tipoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoReporteActionPerformed(evt);
            }
        });
        jPanel1.add(tipoReporte);
        tipoReporte.setBounds(30, 170, 90, 30);

        jPanel1.add(anos);
        anos.setBounds(130, 170, 80, 30);

        jLabel2.setText("Cedula:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 124, 60, 20);
        jPanel1.add(campoCedula);
        campoCedula.setBounds(380, 120, 170, 30);

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar);
        consultar.setBounds(450, 160, 100, 30);

        jPanel1.add(meses);
        meses.setBounds(220, 170, 100, 30);

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

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        
        consultarGastos();
    }//GEN-LAST:event_consultarActionPerformed

    private void tipoReporteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoReporteItemStateChanged
        
        String tipo = (String) tipoReporte.getSelectedItem();        
        
        if(tipo.equals("Mensual")){
            
            meses.setVisible(true);
        }
        else {
            
            meses.setVisible(false);
        }
    }//GEN-LAST:event_tipoReporteItemStateChanged

    private void tipoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoReporteActionPerformed
    
    private void consultarGastos(){
        
        String cedula, tipo, datoA, datoMAux, datoM;
        cedula = campoCedula.getText(); 
        tipo = (String) tipoReporte.getSelectedItem();
        datoA = (String) anos.getSelectedItem();        
        campoCedula.setText("");
        
        while(modelo.getRowCount() != 0){
            
            modelo.removeRow(0);
        }
        
        if(cedula.equals("")){
            
            if(tipo.equals("Mensual")){
                
                datoMAux = (String) meses.getSelectedItem();
                String[] partes = datoMAux.split(" ");
                datoM = partes[0];
                controladorPaciente.consultarGastosPacientesMensual(datoM, datoA, modelo, tabla);
            }
            else {
                
                controladorPaciente.consultarGastosPacientesAnual(datoA, modelo, tabla);
            }
        }
        else{
            
            if(tipo.equals("Mensual")){
                
                datoMAux = (String) meses.getSelectedItem();
                String[] partes = datoMAux.split(" ");
                datoM = partes[0];
                controladorPaciente.consultarGastosPacienteMensual(cedula, datoM, datoA, modelo, tabla);
            }          
            else {
                
                controladorPaciente.consultarGastosPacienteAnual(cedula, datoA, modelo, tabla);
            }            
        }
    }
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_GastosPaciente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anos;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JButton consultar;
    private javax.swing.JLabel fondo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> meses;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipoReporte;
    // End of variables declaration//GEN-END:variables
}