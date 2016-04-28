package usuarios;

public class Usuario extends Persona {

	protected boolean estado;
	protected String fechaDeIngreso;
	protected String usuario;
	protected String contrasena;
	
	public Usuario (String nombre, String direccion, String eMail, 
			String telefono, boolean estado, String fechaDeIngreso, 
			String usuario, String contrasena) {
		super(nombre, direccion, eMail, telefono);
		this.estado = estado;
		this.fechaDeIngreso = fechaDeIngreso;
		this.usuario = usuario;
		this.usuario = contrasena;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	
	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	
}
