package usuarios;

public class Alumno extends Usuario {
  private String matricula;
  private String carrera;
  private String contrasenaAlumno;

  public Alumno(String nombre, String direccion, String eMail, String telefono, boolean estado, String fechaDeIngreso, String usuario) {
    super(nombre, direccion, eMail, telefono, estado, fechaDeIngreso, usuario);
    
  }
	
  public String getMatricula() {
    return matricula;
  }
  
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
  
  public String getCarrera() {
    return carrera;
  }
	
  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }

  public String getContrasenaAlumno() {
    return contrasenaAlumno;
  }

  public void setContrasenaAlumno(String contrasenaAlumno) {
    this.contrasenaAlumno = contrasenaAlumno;
  }
	
	
}
