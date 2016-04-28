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
	
	/*public String getContrasenaAcademico() {
		return contrasenaAcademico;
	}*/

	public void setContrasenaAcademico(String contrasenaAcademico) {
		this.contrasenaAcademico = contrasenaAcademico;
	}
	
	public Academico(String nombre, String direccion, String eMail, 
			String telefono, boolean estado, String fechaDeIngreso, 
			String usuario, String contrasena, 
			String numeroDePersonal, String contrasenaAcademico) {
		super(nombre, direccion, eMail, telefono, estado, 
				fechaDeIngreso, numeroDePersonal, contrasenaAcademico);
		
	}
	
}
