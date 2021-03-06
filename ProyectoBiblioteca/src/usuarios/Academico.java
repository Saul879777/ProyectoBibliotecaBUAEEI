package usuarios;

public class Academico extends Usuario {

  private String numeroDePersonal;
  private String contrasenaAcademico;
	
  public String getNumeroDePersonal() {
    return numeroDePersonal;
  }
	
  public void setNumeroDePersonal(String numeroDePersonal) {
    this.numeroDePersonal = numeroDePersonal;
  }
	
  public String getContrasenaAcademico() {
    return contrasenaAcademico;
  }

  public void setContrasenaAcademico(String contrasenaAcademico) {
    this.contrasenaAcademico = contrasenaAcademico;
  }

  public Academico(String numeroDePersonal, String contrasenaAcademico, String nombre, String direccion, 
          String eMail, String telefono, int estado, String fechaDeIngreso, String usuario) {
    super(nombre, direccion, eMail, telefono, estado, fechaDeIngreso, usuario);
    this.numeroDePersonal = numeroDePersonal;
    this.contrasenaAcademico = contrasenaAcademico;
  }
	
}
