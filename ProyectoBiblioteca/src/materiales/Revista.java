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
public class Revista extends Material {
  private String volumen;

  public Revista(String editorial, String fechaDePublicacion, double precio, 
          String titulo, String estado, String folio, String volumen) {
    super(editorial, fechaDePublicacion, precio, titulo, estado, folio);
    this.volumen=volumen;
  }

  public String getVolumen() {
    return volumen;
  }

  public void setVolumen(String volumen) {
    this.volumen = volumen;
  }
  
  
}
