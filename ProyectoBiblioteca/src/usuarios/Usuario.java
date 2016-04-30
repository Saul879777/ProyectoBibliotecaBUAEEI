package usuarios;

public class Usuario extends Persona {

  protected int estado;
  protected String fechaDeIngreso;
  protected String usuario;
	
  public Usuario (String nombre, String direccion, String eMail, 
    String telefono, int estado, String fechaDeIngreso, 
    String usuario) {
    super(nombre, direccion, eMail, telefono);
    this.estado = estado;
    this.fechaDeIngreso = fechaDeIngreso;
    this.usuario = usuario;
  }
	
  public int getEstado() {
    return estado;
  }
        
  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }
	
  public void setEstado(int estado) {
    this.estado = estado;
  }
	
  public String getFechaDeIngreso() {
    return fechaDeIngreso;
  }
	
  public void setFechaDeIngreso(String fechaDeIngreso) {
    this.fechaDeIngreso = fechaDeIngreso;
  }
	
}
