package materiales;

public class Material {
  private String editorial;
  private String fechaDePublicacion;
  private double precio;
  private String titulo;
  private String estado;
  private String folio;
  private int tipoDeMaterial;

  public Material(String editorial, String fechaDePublicacion, double precio, String titulo, String estado, String folio, int tipoDeMaterial) {
    this.editorial = editorial;
    this.fechaDePublicacion = fechaDePublicacion;
    this.precio = precio;
    this.titulo = titulo;
    this.estado = estado;
    this.folio = folio;
    this.tipoDeMaterial = tipoDeMaterial;
  }
	
  public String getEditorial() {
    return editorial;
  }
	
  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }
	
  public String getFechaDePublicacion() {
    return fechaDePublicacion;
  }
	
  public void setFechaDePublicacion(String fechaDePublicacion) {
    this.fechaDePublicacion = fechaDePublicacion;
  }
	
  public double getPrecio() {
    return precio;
  }
	
  public void setPrecio(double precio) {
    this.precio = precio;
  }
	
  public String getTitulo() {
    return titulo;
  }
	
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
	
  public String getEstado() {
    return estado;
  }
	
  public void setEstado(String estado) {
    this.estado = estado;
  }
	
  public String getFolio() {
    return folio;
  }
	
  public void setFolio(String folio) {
    this.folio = folio;
  }
	
  public int getTipoDeMaterial() {
    return tipoDeMaterial;
  }
	
  public void setTipoDeMaterial(int tipoDeMaterial) {
    this.tipoDeMaterial = tipoDeMaterial;
  }
}
