/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBDD;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author x360
 */
public class Conexion {
  Connection con = null;
  String usuario = "root";
  String contrasena = "SaulRoot";
  String url = "jdbc:mysql://127.0.0.1:3306/biblioteca";
  public Connection conectar() {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(url, usuario, contrasena);
      JOptionPane.showMessageDialog(null, "Conexión está establecida");
    }
    catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error de conexión \n"+e);
    }
    return con;
  }
}
