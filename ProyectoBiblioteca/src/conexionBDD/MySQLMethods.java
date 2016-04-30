/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBDD;

import GUI.RegistrarUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import usuarios.Academico;
import usuarios.Alumno;

/**
 *
 * @author x360
 */
public class MySQLMethods {
    
  public void registrarAcademico(Academico nuevoMaestro) {
    Conexion con = new Conexion();
    Connection registro = con.conectar();
    String comandoSQL;
    comandoSQL = "INSERT INTO usuario (idUsuario, tipoUsuario_idTipoUsuario, nombre, direccion, "
              + "email, telefono, contrasena, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
      try {
        PreparedStatement pst = registro.prepareStatement(comandoSQL);
        pst.setString(1, nuevoMaestro.getNumeroDePersonal());
        pst.setInt(2, 1);
        pst.setString(3, nuevoMaestro.getNombre());
        pst.setString(4, nuevoMaestro.getDireccion());
        pst.setString(5, nuevoMaestro.geteMail());
        pst.setString(6, nuevoMaestro.getTelefono());
        pst.setString(7, nuevoMaestro.getContrasenaAcademico());
        pst.setBoolean(8, true);
        int n = pst.executeUpdate();
        if (n < 0){
          JOptionPane.showMessageDialog(null, "El usuario ha sido registrado exitosamente");
        }
      } catch (SQLException ex) {
        Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public void registrarAlumno (Alumno nuevoAlumno) {
    Conexion con = new Conexion();
    Connection registro = con.conectar();
    String comandoSQL;
    comandoSQL = "INSERT INTO usuario (idUsuario, tipoUsuario_idTipoUsuario, nombre, direccion, "
              + "email, telefono, contrasena, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
      try {
        PreparedStatement pst = registro.prepareStatement(comandoSQL);
        pst.setString(1, nuevoAlumno.getMatricula());
        pst.setInt(2, 1);
        pst.setString(3, nuevoAlumno.getNombre());
        pst.setString(4, nuevoAlumno.getDireccion());
        pst.setString(5, nuevoAlumno.geteMail());
        pst.setString(6, nuevoAlumno.getTelefono());
        pst.setString(7, nuevoAlumno.getContrasenaAlumno());
        pst.setBoolean(8, true);
        int n = pst.executeUpdate();
        if (n < 0){
          JOptionPane.showMessageDialog(null, "El usuario ha sido registrado exitosamente");
        }
      } catch (SQLException ex) {
        Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
}
