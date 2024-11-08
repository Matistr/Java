package proyectosaltoformularios;

public class Ventana_Principal extends javax.swing.JFrame {
 
    public Ventana_Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloVentanaPrincipal = new javax.swing.JLabel();
        btnVentana01 = new javax.swing.JButton();
        btnVentana02 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblNom = new javax.swing.JLabel();
        lblApe = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblDir = new javax.swing.JLabel();
        lblFono = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtFono = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloVentanaPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloVentanaPrincipal.setText("Ventana Principal");
        jPanel1.add(lblTituloVentanaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        btnVentana01.setText("Ventana 01");
        btnVentana01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentana01ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVentana01, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        btnVentana02.setText("Ventana 02");
        btnVentana02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentana02ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVentana02, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        lblNom.setText("Nombre:");
        jPanel1.add(lblNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblApe.setText("Apellido:");
        jPanel1.add(lblApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 85, 100, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 85, 100, -1));

        lblDir.setText("Dirección:");
        jPanel1.add(lblDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        lblFono.setText("Fono:");
        jPanel1.add(lblFono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 235, 100, -1));

        txtFono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtFono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 100, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentana01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentana01ActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        Principal.mostrarVentanaSecundaria1(nombre, apellido);
    }//GEN-LAST:event_btnVentana01ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVentana02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentana02ActionPerformed
        String direccion = txtDireccion.getText();
        String fono = txtFono.getText();
        Principal.mostrarVentanaSecundaria2(direccion, fono);
    }//GEN-LAST:event_btnVentana02ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtFono.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtFonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFonoActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentana01;
    private javax.swing.JButton btnVentana02;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApe;
    private javax.swing.JLabel lblDir;
    private javax.swing.JLabel lblFono;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblTituloVentanaPrincipal;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFono;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
