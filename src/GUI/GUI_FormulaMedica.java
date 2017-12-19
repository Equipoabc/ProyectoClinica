package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;
import java.util.ArrayList;

public class GUI_FormulaMedica extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorMedicamento controladorMedicamento;
    ControladorFormula_medica controladorFormulaMedica;
    ControladorFormulas_medicas_Medicamentos controladorFormulaMedicaMedicamento;
    ControladorMedico controladorMedico;
    String idMedico;
    int registro;
    String nombrePaciente;
    DefaultListModel listaOpcion;
    DefaultListModel listaAdicion;
    
    public GUI_FormulaMedica(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorFormulaMedica = new ControladorFormula_medica();
        controladorMedico = new ControladorMedico();
        controladorMedicamento = new ControladorMedicamento();
        controladorFormulaMedicaMedicamento = new ControladorFormulas_medicas_Medicamentos();
        validaciones = new Validaciones();  
        listaOpcion = new DefaultListModel();
        listaAdicion = new DefaultListModel();
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorMedicamento.llenarMedicamentos();    
               
        for(int i=0; i < lista.size(); i++){
            
            listaOpcion.addElement(lista.get(i));       
        }
        
        listaOpciones.setModel(listaOpcion);
        listaAdiciones.setModel(listaAdicion);        
    }
    
    public void setIdMedico(String id_medico){
        
        idMedico = id_medico;
        Medico doc = controladorMedico.consultarDatosMedico(idMedico);
        medico.setText("Medico: " + doc.getNombre_empleado());
    }
    
    public void setRegistro(int x){
        
        registro = x;
    }
    
    public void setNombrePaciente(String x){
        
        nombrePaciente = x;        
        paciente.setText("Paciente: " + nombrePaciente);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        cedulaLabel2 = new javax.swing.JLabel();
        cedulaLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAdiciones = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaOpciones = new javax.swing.JList<>();
        medico = new javax.swing.JLabel();
        paciente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));
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
        botonCancelar.setBounds(370, 400, 140, 90);

        adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        adicionar.setBorder(null);
        adicionar.setBorderPainted(false);
        adicionar.setContentAreaFilled(false);
        adicionar.setFocusPainted(false);
        adicionar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        adicionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });
        jPanel1.add(adicionar);
        adicionar.setBounds(310, 230, 140, 90);

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
        jPanel1.add(eliminar);
        eliminar.setBounds(310, 290, 140, 90);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fórmula Médica");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 40, 260, 50);

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
        botonAceptar.setBounds(240, 400, 140, 90);

        cedulaLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel2.setText("Medicamentos Formulados");
        jPanel1.add(cedulaLabel2);
        cedulaLabel2.setBounds(470, 200, 180, 30);

        cedulaLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel1.setText("Medicamentos Disponibles");
        jPanel1.add(cedulaLabel1);
        cedulaLabel1.setBounds(120, 200, 180, 30);

        jScrollPane2.setViewportView(listaAdiciones);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(460, 230, 200, 160);

        jScrollPane1.setViewportView(listaOpciones);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(110, 230, 190, 160);

        medico.setText("Medico: ");
        jPanel1.add(medico);
        medico.setBounds(110, 130, 270, 50);

        paciente.setText("Paciente: ");
        jPanel1.add(paciente);
        paciente.setBounds(400, 130, 270, 50);

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setFocusable(false);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -10, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Medico interfaz = new GUI_Medico();
        interfaz.setId(idMedico);
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
       
        ListModel l = listaAdiciones.getModel();
        
        if(l.getSize() == 0){
            
            JOptionPane.showMessageDialog(null, "La fórmula médica se encuentra vacía, sin medicamentos.");
        }
        else {
           
            int ifFormula = controladorFormulaMedica.crearFormulaMedica(idMedico, registro);
            boolean error = false;
            
            for(int i = 0; i < l.getSize(); i++){
            
                String medicamento = (String) l.getElementAt(i);
                String[] partes = medicamento.split(" ");
                String codigo = partes[0];
                int resultado = controladorFormulaMedicaMedicamento.insertarFormula(ifFormula, codigo);
                
                if(resultado != 1){
                    
                    error = true;
                }
            }
            
            if(error){
                
                JOptionPane.showMessageDialog(null, "Ocurrio un error a la hora de ingresar los medicamentos.");
            }
            else {
                
                JOptionPane.showMessageDialog(null, "Se ha agragado la formula medica con exito.");
                botonAceptar.setEnabled(false);
            }
        }        
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
           
        String nombre = "";
        nombre = listaOpciones.getSelectedValue();
        if (nombre != null){
            
            listaAdicion.addElement(nombre);
            listaOpcion.remove(listaOpciones.getSelectedIndex());  
        }
    }//GEN-LAST:event_adicionarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        
        String nombre = "";
        nombre = listaAdiciones.getSelectedValue();
        if (nombre != null){
            
            listaOpcion.addElement(nombre);
            listaAdicion.remove(listaAdiciones.getSelectedIndex());  
        }             
    }//GEN-LAST:event_eliminarActionPerformed

    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_FormulaMedica().setVisible(true);
            }
        });
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel cedulaLabel1;
    private javax.swing.JLabel cedulaLabel2;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaAdiciones;
    private javax.swing.JList<String> listaOpciones;
    private javax.swing.JLabel medico;
    private javax.swing.JLabel paciente;
    // End of variables declaration//GEN-END:variables
}