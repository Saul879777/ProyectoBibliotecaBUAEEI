/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import ConexionBDD.MySQLMethods;

/**
 *
 * @author x360
 */
public class CrearUsuario {
  
  public void crearNuevoUsuario(String matriculaONoDePersonal, String password, String AlumnoOMaestro, String nombre, String direccion, 
          String eMail, String telefono, int estado, String fechaDeIngreso, 
          String usuario, String carrera){
    MySQLMethods sql = new MySQLMethods();
    int tipoDeUsuario = getTipoUsuario(AlumnoOMaestro);
    if (tipoDeUsuario == 1){
      Academico nuevoAcademico = new Academico(matriculaONoDePersonal, password, nombre, direccion, eMail, telefono, 1, 
              "TODO implementar fecha de ingreso", matriculaONoDePersonal);
      sql.registrarAcademico(nuevoAcademico);
    }
    else{
      Alumno nuevoAlumno = new Alumno(matriculaONoDePersonal, carrera, password, nombre, direccion, eMail, telefono, 2, 
              "TODO implementar fecha de ingreso", matriculaONoDePersonal);
      sql.registrarAlumno(nuevoAlumno);
    }
  }
  
  private int getTipoUsuario(String AlumnoOMaestro){
    if (AlumnoOMaestro.equals("Maestro")){  
      return 1;
    }
    else{
      return 2;
    }
  }
  
}
