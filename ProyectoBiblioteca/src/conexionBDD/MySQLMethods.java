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
import materiales.Libro;
import materiales.Mapa;
import materiales.MedioOptico;
import materiales.Periodico;
import materiales.Revista;
import materiales.Software;
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
  
  public void registrarLibro (Libro nuevoLibro) {
    Conexion con = new Conexion();
    Connection registro = con.conectar();
    String comandoSQL;
    comandoSQL = "INSERT INTO material (folio, fechaDePublicacion, precio, titulo, "
              + "estado, autor) VALUES (?, ?, ?, ?, ?, ?)";
      try {
        PreparedStatement pst = registro.prepareStatement(comandoSQL);
        pst.setString(1, nuevoLibro.getFolio());
        pst.setString(2, nuevoLibro.getFechaDePublicacion());
        pst.setDouble(3, nuevoLibro.getPrecio());
        pst.setString(4, nuevoLibro.getTitulo());
        pst.setString(5, nuevoLibro.getEstado());
        pst.setString(6, nuevoLibro.getAutor());
        int n = pst.executeUpdate();
        if (n < 0){
          JOptionPane.showMessageDialog(null, "El libro ha sido registrado exitosamente");
        }
      } catch (SQLException ex) {
        Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public void registrarMedioOptico (MedioOptico nuevoMedioOptico) {
    Conexion con = new Conexion();
    Connection registro = con.conectar();
    String comandoSQL;
    comandoSQL = "INSERT INTO material (folio, fechaDePublicacion, precio, titulo, "
              + "estado, tipo) VALUES (?, ?, ?, ?, ?, ?)";
      try {
        PreparedStatement pst = registro.prepareStatement(comandoSQL);
        pst.setString(1, nuevoMedioOptico.getFolio());
        pst.setString(2, nuevoMedioOptico.getFechaDePublicacion());
        pst.setDouble(3, nuevoMedioOptico.getPrecio());
        pst.setString(4, nuevoMedioOptico.getTitulo());
        pst.setString(5, nuevoMedioOptico.getEstado());
        pst.setString(6, nuevoMedioOptico.getTipo());
        int n = pst.executeUpdate();
        if (n < 0){
          JOptionPane.showMessageDialog(null, "El libro ha sido registrado exitosamente");
        }
      } catch (SQLException ex) {
        Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public void registrarSoftware (Software nuevoSoftware) {
    Conexion con = new Conexion();
    Connection registro = con.conectar();
    String comandoSQL;
    comandoSQL = "INSERT INTO material (folio, fechaDePublicacion, precio, titulo, "
              + "estado, version) VALUES (?, ?, ?, ?, ?, ?)";
      try {
        PreparedStatement pst = registro.prepareStatement(comandoSQL);
        pst.setString(1, nuevoSoftware.getFolio());
        pst.setString(2, nuevoSoftware.getFechaDePublicacion());
        pst.setDouble(3, nuevoSoftware.getPrecio());
        pst.setString(4, nuevoSoftware.getTitulo());
        pst.setString(5, nuevoSoftware.getEstado());
        pst.setFloat(6, nuevoSoftware.getVersion());
        int n = pst.executeUpdate();
        if (n < 0){
          JOptionPane.showMessageDialog(null, "El libro ha sido registrado exitosamente");
        }
      } catch (SQLException ex) {
        Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public void registrarPeriodico (Periodico nuevoPeriodico) {
    Conexion con = new Conexion();
    Connection registro = con.conectar();
    String comandoSQL;
    comandoSQL = "INSERT INTO material (folio, fechaDePublicacion, precio, titulo, "
              + "estado, fechaDia) VALUES (?, ?, ?, ?, ?, ?)";
      try {
        PreparedStatement pst = registro.prepareStatement(comandoSQL);
        pst.setString(1, nuevoPeriodico.getFolio());
        pst.setString(2, nuevoPeriodico.getFechaDePublicacion());
        pst.setDouble(3, nuevoPeriodico.getPrecio());
        pst.setString(4, nuevoPeriodico.getTitulo());
        pst.setString(5, nuevoPeriodico.getEstado());
        pst.setString(6, nuevoPeriodico.getFechaDia());
        int n = pst.executeUpdate();
        if (n < 0){
          JOptionPane.showMessageDialog(null, "El libro ha sido registrado exitosamente");
        }
      } catch (SQLException ex) {
        Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public void registrarMapa (Mapa nuevoMapa) {
    Conexion con = new Conexion();
    Connection registro = con.conectar();
    String comandoSQL;
    comandoSQL = "INSERT INTO material (folio, fechaDePublicacion, precio, titulo, "
              + "estado, tipoDeMapa) VALUES (?, ?, ?, ?, ?, ?)";
      try {
        PreparedStatement pst = registro.prepareStatement(comandoSQL);
        pst.setString(1, nuevoMapa.getFolio());
        pst.setString(2, nuevoMapa.getFechaDePublicacion());
        pst.setDouble(3, nuevoMapa.getPrecio());
        pst.setString(4, nuevoMapa.getTitulo());
        pst.setString(5, nuevoMapa.getEstado());
        pst.setString(6, nuevoMapa.getTipoDeMapa());
        int n = pst.executeUpdate();
        if (n < 0){
          JOptionPane.showMessageDialog(null, "El libro ha sido registrado exitosamente");
        }
      } catch (SQLException ex) {
        Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public void registrarRevista (Revista nuevaRevista) {
    Conexion con = new Conexion();
    Connection registro = con.conectar();
    String comandoSQL;
    comandoSQL = "INSERT INTO material (folio, fechaDePublicacion, precio, titulo, "
              + "estado, volumen) VALUES (?, ?, ?, ?, ?, ?)";
      try {
        PreparedStatement pst = registro.prepareStatement(comandoSQL);
        pst.setString(1, nuevaRevista.getFolio());
        pst.setString(2, nuevaRevista.getFechaDePublicacion());
        pst.setDouble(3, nuevaRevista.getPrecio());
        pst.setString(4, nuevaRevista.getTitulo());
        pst.setString(5, nuevaRevista.getEstado());
        pst.setString(6, nuevaRevista.getVolumen());
        int n = pst.executeUpdate();
        if (n < 0){
          JOptionPane.showMessageDialog(null, "El libro ha sido registrado exitosamente");
        }
      } catch (SQLException ex) {
        Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}
