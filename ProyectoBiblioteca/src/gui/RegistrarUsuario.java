/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import usuarios.CrearUsuario;

/**
 *
 * @author x360
 */
public class RegistrarUsuario extends javax.swing.JFrame {

  /**
   * Creates new form RegistraUsuarios
   */
  public RegistrarUsuario() {
    initComponents();
    setLocationRelativeTo(null);
    lblMatriculaONoPersonal.setVisible(false);
    txtFMatriculaONoPersonal.setVisible(false);
    lblCarrera.setVisible(false);
    cBCarrera.setVisible(false);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    txtFNombre = new javax.swing.JTextField();
    txtFMatriculaONoPersonal = new javax.swing.JTextField();
    lblMatriculaONoPersonal = new javax.swing.JLabel();
    lblNombre = new javax.swing.JLabel();
    lblDireccion = new javax.swing.JLabel();
    lblEMail = new javax.swing.JLabel();
    lblTelefono = new javax.swing.JLabel();
    lblContrasena = new javax.swing.JLabel();
    txtFDireccion = new javax.swing.JTextField();
    txtFEMail = new javax.swing.JTextField();
    txtFTelefono = new javax.swing.JTextField();
    pfContrasena = new javax.swing.JPasswordField();
    jLabel1 = new javax.swing.JLabel();
    pfConfirmarContrasena = new javax.swing.JPasswordField();
    btnConfirmar = new javax.swing.JToggleButton();
    btnCancelar = new javax.swing.JButton();
    txtFTipoDeUsuario = new javax.swing.JLabel();
    cBTipoDeUsuario = new javax.swing.JComboBox<>();
    cBCarrera = new javax.swing.JComboBox<>();
    lblCarrera = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    lblMatriculaONoPersonal.setText("Matrícula o No. Personal:");

    lblNombre.setText("Nombre:");

    lblDireccion.setText("Dirección:");

    lblEMail.setText("E-mail:");

    lblTelefono.setText("Teléfono:");

    lblContrasena.setText("Contraseña");

    jLabel1.setText("Confirmar contraseña:");

    btnConfirmar.setText("Confirmar");
    btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnConfirmarActionPerformed(evt);
      }
    });

    btnCancelar.setText("Cancelar");

    txtFTipoDeUsuario.setText("TipoDeUsuario:");

    cBTipoDeUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Usuario...", "Alumno", "Maestro"}));
    cBTipoDeUsuario.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cBTipoDeUsuarioItemStateChanged(evt);
      }
    });

    cBCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carrera: ", "Ingeniería de Software", "Redes", "Tecnologías computacionales" }));

    lblCarrera.setText("Carrera:");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(33, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(btnCancelar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConfirmar))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblMatriculaONoPersonal)
              .addComponent(txtFTipoDeUsuario))
            .addGap(48, 48, 48)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtFMatriculaONoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(cBTipoDeUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblDireccion)
              .addComponent(lblEMail)
              .addComponent(lblTelefono)
              .addComponent(lblNombre)
              .addComponent(lblContrasena)
              .addComponent(jLabel1))
            .addGap(60, 60, 60)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(pfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(pfConfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtFEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(lblCarrera)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cBCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(45, 45, 45))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtFTipoDeUsuario)
          .addComponent(cBTipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblMatriculaONoPersonal)
          .addComponent(txtFMatriculaONoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblNombre))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblDireccion)
          .addComponent(txtFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtFEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblEMail))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(txtFTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(pfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblContrasena))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(pfConfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblCarrera)
          .addComponent(cBCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnCancelar)
          .addComponent(btnConfirmar))
        .addContainerGap(40, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
    String matriculaONoPersonal, nombre, direccion, eMail, telefono;
    char contrasena [];
    matriculaONoPersonal = txtFMatriculaONoPersonal.getText();
    nombre=txtFNombre.getText();
    direccion=txtFDireccion.getText();
    eMail=txtFEMail.getText();
    telefono=txtFTelefono.getText();
    contrasena=pfContrasena.getPassword();
    String password = new String (contrasena);
    Object ObjetoCarrera = cBCarrera.getSelectedItem();
    String carrera = ObjetoCarrera.toString();
    Object ObjetoAlumnoOMaestro = cBCarrera.getSelectedItem();
    String AlumnoOMaestro = ObjetoAlumnoOMaestro.toString();
    CrearUsuario nuevoUsuario = new CrearUsuario();
    int estado = 0;
    String fechaDeIngreso = "TODO implementar en la base de datos";
    nuevoUsuario.crearNuevoUsuario(matriculaONoPersonal, password, AlumnoOMaestro, nombre, direccion, 
          eMail, telefono, estado, fechaDeIngreso, matriculaONoPersonal, carrera);
  }//GEN-LAST:event_btnConfirmarActionPerformed
 
  private void cBTipoDeUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cBTipoDeUsuarioItemStateChanged
    if (cBTipoDeUsuario.getSelectedItem().equals("Alumno")){
      lblMatriculaONoPersonal.setText("Matricula");
      lblMatriculaONoPersonal.setVisible(true);
      txtFMatriculaONoPersonal.setVisible(true);
      lblCarrera.setVisible(true);
      cBCarrera.setVisible(true);
    }else { 
      if (cBTipoDeUsuario.getSelectedItem().equals("Maestro")){
        lblMatriculaONoPersonal.setText("No. de Personal");
        lblMatriculaONoPersonal.setVisible(true);
        txtFMatriculaONoPersonal.setVisible(true);
        lblCarrera.setVisible(false);
        cBCarrera.setVisible(false);
      }
      else{
        lblMatriculaONoPersonal.setVisible(false);
        txtFMatriculaONoPersonal.setVisible(false);
      }
    }
  }//GEN-LAST:event_cBTipoDeUsuarioItemStateChanged

  public void limpiarCampos(){
    txtFNombre.setText(" ");
    txtFMatriculaONoPersonal.setText(" ");
    txtFDireccion.setText(" ");
    txtFEMail.setText(" ");
    txtFTelefono.setText(" ");
    pfContrasena.setText(" ");
  }
  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RegistrarUsuario().setVisible(true);
        
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancelar;
  private javax.swing.JToggleButton btnConfirmar;
  private javax.swing.JComboBox<String> cBCarrera;
  private javax.swing.JComboBox<String> cBTipoDeUsuario;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lblCarrera;
  private javax.swing.JLabel lblContrasena;
  private javax.swing.JLabel lblDireccion;
  private javax.swing.JLabel lblEMail;
  private javax.swing.JLabel lblMatriculaONoPersonal;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JLabel lblTelefono;
  private javax.swing.JPasswordField pfConfirmarContrasena;
  private javax.swing.JPasswordField pfContrasena;
  private javax.swing.JTextField txtFDireccion;
  private javax.swing.JTextField txtFEMail;
  private javax.swing.JTextField txtFMatriculaONoPersonal;
  private javax.swing.JTextField txtFNombre;
  private javax.swing.JTextField txtFTelefono;
  private javax.swing.JLabel txtFTipoDeUsuario;
  // End of variables declaration//GEN-END:variables
}
