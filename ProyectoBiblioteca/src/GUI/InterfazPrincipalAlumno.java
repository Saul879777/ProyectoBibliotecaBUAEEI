/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author José Eduardo
 */
public class InterfazPrincipalAlumno extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipalAlumno() {
        initComponents();
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
    botonAceptar = new javax.swing.JButton();
    txtNombre = new javax.swing.JTextField();
    txtpwd = new javax.swing.JPasswordField();
    jCheckBox1 = new javax.swing.JCheckBox();
    label1 = new java.awt.Label();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    botonAceptar1 = new javax.swing.JButton();
    txtNombre1 = new javax.swing.JTextField();
    txtpwd1 = new javax.swing.JPasswordField();
    jCheckBox2 = new javax.swing.JCheckBox();
    label2 = new java.awt.Label();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jLabel9 = new javax.swing.JLabel();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    jLabel10 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jButton3 = new javax.swing.JButton();

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    botonAceptar.setText("Aceptar");
    botonAceptar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonAceptarActionPerformed(evt);
      }
    });

    txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        txtNombreMouseClicked(evt);
      }
    });
    txtNombre.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNombreActionPerformed(evt);
      }
    });

    txtpwd.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        txtpwdMouseClicked(evt);
      }
    });

    jCheckBox1.setText("Mantener sesion iniciada");

    label1.setAlignment(java.awt.Label.CENTER);
    label1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    label1.setText("Usuario");

    jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jLabel1.setText("Contraseña");

    jLabel2.setIcon(new javax.swing.JLabel() {
      public javax.swing.Icon getIcon() {
        try {
          return new javax.swing.ImageIcon(
            new java.net.URL("http://1.bp.blogspot.com/-Ntq4MhUFfqM/VxYod459NCI/AAAAAAAAADI/gQdNp-Qpu-Yai9O-sX4P-0R7bce0c5cgwCK4B/s1600/Sin%2Bt%25C3%25ADtulo-1.jpg")
          );
        } catch (java.net.MalformedURLException e) {
        }
        return null;
      }
    }.getIcon());
    jLabel2.setText("jLabel2");

    jLabel3.setIcon(new javax.swing.JLabel() {
      public javax.swing.Icon getIcon() {
        try {
          return new javax.swing.ImageIcon(
            new java.net.URL("http://3.bp.blogspot.com/-6DU1m9msxsw/VxYod_e_eXI/AAAAAAAAADE/5WYpmfF4LaESgwBGBb0sJvzBMgveP-FKQCK4B/s1600/biblio.jpg")
          );
        } catch (java.net.MalformedURLException e) {
        }
        return null;
      }
    }.getIcon());
    jLabel3.setText("jLabel3");

    jButton1.setText("¿Olvidaste tu contraseña?");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    botonAceptar1.setText("Aceptar");
    botonAceptar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonAceptar1ActionPerformed(evt);
      }
    });

    txtNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        txtNombre1MouseClicked(evt);
      }
    });
    txtNombre1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNombre1ActionPerformed(evt);
      }
    });

    txtpwd1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        txtpwd1MouseClicked(evt);
      }
    });

    jCheckBox2.setText("Mantener sesion iniciada");

    label2.setAlignment(java.awt.Label.CENTER);
    label2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    label2.setText("Usuario");

    jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jLabel4.setText("Contraseña");

    jLabel5.setIcon(new javax.swing.JLabel() {
      public javax.swing.Icon getIcon() {
        try {
          return new javax.swing.ImageIcon(
            new java.net.URL("http://1.bp.blogspot.com/-Ntq4MhUFfqM/VxYod459NCI/AAAAAAAAADI/gQdNp-Qpu-Yai9O-sX4P-0R7bce0c5cgwCK4B/s1600/Sin%2Bt%25C3%25ADtulo-1.jpg")
          );
        } catch (java.net.MalformedURLException e) {
        }
        return null;
      }
    }.getIcon());
    jLabel5.setText("jLabel2");

    jLabel6.setIcon(new javax.swing.JLabel() {
      public javax.swing.Icon getIcon() {
        try {
          return new javax.swing.ImageIcon(
            new java.net.URL("http://3.bp.blogspot.com/-6DU1m9msxsw/VxYod_e_eXI/AAAAAAAAADE/5WYpmfF4LaESgwBGBb0sJvzBMgveP-FKQCK4B/s1600/biblio.jpg")
          );
        } catch (java.net.MalformedURLException e) {
        }
        return null;
      }
    }.getIcon());
    jLabel6.setText("jLabel3");

    jButton2.setText("¿Olvidaste tu contraseña?");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtpwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(349, 349, 349)
            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(294, 294, 294)
            .addComponent(jCheckBox2))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(332, 332, 332)
            .addComponent(botonAceptar1))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(344, 344, 344)
            .addComponent(jLabel4))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(53, 53, 53)
            .addComponent(jButton2)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtpwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(23, 23, 23)
        .addComponent(jCheckBox2)
        .addGap(18, 18, 18)
        .addComponent(botonAceptar1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
        .addComponent(jButton2)
        .addGap(87, 87, 87))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(349, 349, 349)
            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(294, 294, 294)
            .addComponent(jCheckBox1))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(332, 332, 332)
            .addComponent(botonAceptar))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(344, 344, 344)
            .addComponent(jLabel1))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(53, 53, 53)
            .addComponent(jButton1)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addContainerGap()))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(23, 23, 23)
        .addComponent(jCheckBox1)
        .addGap(18, 18, 18)
        .addComponent(botonAceptar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
        .addComponent(jButton1)
        .addGap(87, 87, 87))
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addContainerGap()))
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(819, 494));

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setPreferredSize(new java.awt.Dimension(819, 495));

    jLabel9.setIcon(new javax.swing.JLabel() {
      public javax.swing.Icon getIcon() {
        try {
          return new javax.swing.ImageIcon(
            new java.net.URL("http://3.bp.blogspot.com/-6DU1m9msxsw/VxYod_e_eXI/AAAAAAAAADE/5WYpmfF4LaESgwBGBb0sJvzBMgveP-FKQCK4B/s1600/biblio.jpg")
          );
        } catch (java.net.MalformedURLException e) {
        }
        return null;
      }
    }.getIcon());
    jLabel9.setText("jLabel3");

    jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    jButton4.setText("Revizar mis préstamos realizados");

    jButton5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    jButton5.setText("Consultar catálogo");

    jButton6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    jButton6.setText("Ver multas");

    jLabel10.setText("jLabel3");
    jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel7.setText("Hola Usuario Ejemplo!");

    jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jButton3.setText("Cerrar sesión");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
        .addComponent(jLabel7)
        .addGap(18, 18, 18)
        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(165, 165, 165))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addComponent(jButton3)
            .addContainerGap())))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)))
            .addGap(31, 31, 31))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
        .addComponent(jButton3)
        .addGap(21, 21, 21)
        .addComponent(jButton4)
        .addGap(18, 18, 18)
        .addComponent(jButton5)
        .addGap(18, 18, 18)
        .addComponent(jButton6)
        .addContainerGap(218, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
    InterfazPrincipalAlumno principal = new InterfazPrincipalAlumno();
    principal.setVisible(true);
    dispose();
  }//GEN-LAST:event_botonAceptarActionPerformed

  private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNombreMouseClicked

  private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNombreActionPerformed

  private void txtpwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpwdMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_txtpwdMouseClicked

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    RecuperarContraseña recuperar = new RecuperarContraseña();
    recuperar.setVisible(true);
    dispose();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void botonAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar1ActionPerformed
    InterfazPrincipalAlumno principal = new InterfazPrincipalAlumno();
    principal.setVisible(true);
    dispose();
  }//GEN-LAST:event_botonAceptar1ActionPerformed

  private void txtNombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombre1MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNombre1MouseClicked

  private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNombre1ActionPerformed

  private void txtpwd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpwd1MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_txtpwd1MouseClicked

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    RecuperarContraseña recuperar = new RecuperarContraseña();
    recuperar.setVisible(true);
    dispose();
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Login login = new Login();
    login.setVisible(true);
    dispose();
  }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipalAlumno().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton botonAceptar;
  private javax.swing.JButton botonAceptar1;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JCheckBox jCheckBox2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private java.awt.Label label1;
  private java.awt.Label label2;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtNombre1;
  private javax.swing.JPasswordField txtpwd;
  private javax.swing.JPasswordField txtpwd1;
  // End of variables declaration//GEN-END:variables
}
