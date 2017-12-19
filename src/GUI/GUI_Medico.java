package GUI;

public class GUI_Medico extends javax.swing.JFrame {
    
    String id;
    
    public GUI_Medico(){
        
        initComponents();
        this.setLocationRelativeTo(null);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bienvenido = new javax.swing.JLabel();
        nombreMedico = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JLabel();
        registro = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        bienvenido.setBackground(new java.awt.Color(255, 255, 255));
        bienvenido.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenido.setText("  Bienvenido(a) ");
        jPanel1.add(bienvenido);
        bienvenido.setBounds(10, 240, 200, 50);

        nombreMedico.setBackground(new java.awt.Color(255, 255, 255));
        nombreMedico.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        nombreMedico.setForeground(new java.awt.Color(255, 255, 255));
        nombreMedico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(nombreMedico);
        nombreMedico.setBounds(20, 280, 190, 50);

        Label.setBackground(new java.awt.Color(255, 255, 255));
        Label.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        Label.setForeground(new java.awt.Color(108, 101, 247));
        Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label.setText("<html><body> <center>Crear<br>Registro</center></body></html>");
        jPanel1.add(Label);
        Label.setBounds(390, 250, 140, 90);

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Medico");
        jPanel1.add(titulo);
        titulo.setBounds(140, 40, 200, 50);

        CerrarSesion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(CerrarSesion);
        CerrarSesion.setBounds(610, 40, 120, 50);

        registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        registro.setBorder(null);
        registro.setBorderPainted(false);
        registro.setContentAreaFilled(false);
        registro.setFocusPainted(false);
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        jPanel1.add(registro);
        registro.setBounds(370, 240, 180, 110);

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAdministrador1.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setId(String id){
        
        this.id = id;
    }
            
    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        
        GUI_Login interfazLogin = new GUI_Login();
        interfazLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionMouseClicked
        
    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        
        GUI_CrearRegistro interfaz = new GUI_CrearRegistro();
        interfaz.setCedula_medico(id);
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registroActionPerformed

    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_Medico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel bienvenido;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreMedico;
    private javax.swing.JButton registro;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}