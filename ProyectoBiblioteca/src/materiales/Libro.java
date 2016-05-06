package materiales;

public class Libro extends Material {
  private String autor;
	
  public Libro(String editorial, String fechaDePublicacion, double precio, 
          String titulo, String estado, String folio, String autor) {
    super(editorial, fechaDePublicacion, precio, titulo, estado, folio);
    this.autor = autor;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }
	
}
