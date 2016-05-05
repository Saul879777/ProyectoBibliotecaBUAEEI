/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materiales;

/**
 *
 * @author x360
 */
public class MediosOpticos extends Material {
  private String tipo;

  public MediosOpticos(String editorial, String fechaDePublicacion, double precio, 
          String titulo, String estado, String folio, int tipoDeMaterial, String tipo) {
    super(editorial, fechaDePublicacion, precio, titulo, estado, folio, tipoDeMaterial);
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
}
