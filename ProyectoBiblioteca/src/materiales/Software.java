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
public class Software extends Material {
  private float version;

  public Software(String editorial, String fechaDePublicacion, double precio, 
          String titulo, String estado, String folio, int tipoDeMaterial, 
          float version) {
    super(editorial, fechaDePublicacion, precio, titulo, estado, folio, 
            tipoDeMaterial);
    this.version = version;
  }
  
  public float getVersion() {
    return version;
  }

  public void setVersion(float version) {
    this.version = version;
  }
}
