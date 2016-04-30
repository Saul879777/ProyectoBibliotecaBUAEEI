package usuarios;

public class Alumno extends Usuario {
  private String matricula;
  private String carrera;
  private String contrasenaAlumno;

  public Alumno(String matricula, String carrera, String contrasenaAlumno, String nombre, String direccion, String eMail, 
          String telefono, int estado, String fechaDeIngreso, String usuario) {
    super(nombre, direccion, eMail, telefono, estado, fechaDeIngreso, usuario);
    this.matricula = matricula;
    this.carrera = carrera;
    this.contrasenaAlumno = contrasenaAlumno;
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
