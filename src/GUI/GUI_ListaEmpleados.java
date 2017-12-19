package GUI;
import Controladores.*;
import java.text.*;
import Logica.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GUI_ListaEmpleados extends javax.swing.JFrame {
    
    Validaciones validaciones;
    DefaultTableModel modelo;
    ControladorEmpleado controladorEmpleado;
    ControladorArea controladorArea;
    String administrador;

    public GUI_ListaEmpleados(){
        
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
        
        modelo.addColumn("Area");
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Cargo");
        
        tabla.getTableHeader().setReorderingAllowed(false);
        
        areas.addItem("Todas");
        
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorArea.consultarAreas();
        
        for(int i=0; i < lista.size(); i++){
            
            areas.addItem(lista.get(i));
        } 
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
        areas = new javax.swing.JComboBox<>();
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
        jLabel6.setText("Empleados");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 200, 50);

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

        texto.setText("Area:");
        jPanel1.add(texto);
        texto.setBounds(120, 130, 27, 14);

        areas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areasActionPerformed(evt);
            }
        });
        jPanel1.add(areas);
        areas.setBounds(160, 130, 80, 20);

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar);
        consultar.setBounds(260, 123, 90, 30);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar);
        cancelar.setBounds(613, 130, 90, 23);

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

    private void areasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areasActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        
        String id_areaAux = (String) areas.getSelectedItem();
        String[] partes = id_areaAux.split(" ");
        String id_area = partes[0];        
        
        while(modelo.getRowCount() != 0){
            
            modelo.removeRow(0);
        }
        
        if(id_area.equals("Todas")){
                        
            controladorEmpleado.listarEmpleados(modelo, tabla);
        }
        else {
            
            String nombre = partes[1];
            controladorEmpleado.listarEmpleadosArea(nombre, id_area, modelo, tabla);
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        
        GUI_Administrador administrador = new GUI_Administrador();
        administrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_ListaEmpleados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> areas;
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
    private javax.swing.JTable tabla;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}