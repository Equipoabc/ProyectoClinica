package GUI;
import Controladores.*;
import java.text.*;
import Logica.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_CitasMes extends javax.swing.JFrame {
    
    Validaciones validaciones;
    DefaultTableModel modelo;
    ControladorEmpleado controladorEmpleado;
    ControladorArea controladorArea;
    String administrador;
    private String tipo;

    public GUI_CitasMes(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorEmpleado = new ControladorEmpleado();
        controladorArea = new ControladorArea();
        validaciones = new Validaciones();
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fila, int columna){
                
                return false;
            }
        };
        
        tabla.setModel(modelo);
        
        modelo.addColumn("ID Médico");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad de citas");
        
        tabla.getTableHeader().setReorderingAllowed(false);
        
        meses.addItem("Enero");
        meses.addItem("Febrero");
        meses.addItem("Marzo");
        meses.addItem("Abril");
        meses.addItem("Mayo");
        meses.addItem("Junio");
        meses.addItem("Julio");
        meses.addItem("Agosto");
        meses.addItem("Septiembre");
        meses.addItem("Octubre");
        meses.addItem("Noviembre");
        meses.addItem("Diciembre");
        
        
        
    }
    
    public void setAdministrador(String administrador){
        
        this.administrador = administrador;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        texto = new javax.swing.JLabel();
        meses = new javax.swing.JComboBox<>();
        consultar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
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
        jLabel6.setText("Informe Citas por mes");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 290, 50);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Médico", "Nombre Médico", "Numero de Citas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        texto.setText("Mes:");
        jPanel1.add(texto);
        texto.setBounds(120, 130, 27, 30);

        meses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesesActionPerformed(evt);
            }
        });
        jPanel1.add(meses);
        meses.setBounds(160, 130, 180, 20);

        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        consultar.setBorderPainted(false);
        consultar.setContentAreaFilled(false);
        consultar.setFocusPainted(false);
        consultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        consultar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar);
        consultar.setBounds(330, 110, 130, 50);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
        cancelar.setBorderPainted(false);
        cancelar.setContentAreaFilled(false);
        cancelar.setFocusPainted(false);
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        cancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarPeq.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar);
        cancelar.setBounds(580, 110, 130, 50);

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

    private void mesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesesActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        
        String mes = (String) meses.getSelectedItem();
        int id_mes =0;
        
        while(modelo.getRowCount() != 0){
            
            modelo.removeRow(0);
            
        }
            if( mes.equals("Enero")){
                id_mes = 1;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
            else if( mes.equals("Febrero")){
                id_mes = 2;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
           else if( mes.equals("Marzo")){
                id_mes = 3;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
           else if( mes.equals("Abril")){
                id_mes = 4;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
           else if( mes.equals("Mayo")){
                id_mes = 5;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
           else if( mes.equals("Junio")){
                id_mes = 6;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
           else if( mes.equals("Julio")){
                id_mes = 7;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
           else  if( mes.equals("Agosto")){
                id_mes = 8;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
           else if( mes.equals("Septiembre")){
                id_mes = 9;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
           else if( mes.equals("Octubre")){
                id_mes = 10;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
           else if( mes.equals("Noviembre")){
                id_mes = 11;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
           else if( mes.equals("Diciembre")){
                id_mes = 12;
            controladorEmpleado.listarCitasMeses(id_mes, modelo, tabla);
            }
            
         if(modelo.getRowCount() == 0){
            JOptionPane.showMessageDialog(null,"La consulta no arrojó resultados");
        }
           
    }//GEN-LAST:event_consultarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        
        GUI_InterfazInformes administrador = new GUI_InterfazInformes();
        administrador.setTipo(this.tipo);
        administrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_CitasMes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton consultar;
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
    private javax.swing.JComboBox<String> meses;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables

    void setTipo(String tipo) {
        this.tipo = tipo;
    }
}