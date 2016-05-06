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
public class Mapa extends Material {
  private String tipoDeMapa;

  public Mapa(String editorial, String fechaDePublicacion, double precio, 
          String titulo, String estado, String folio, String tipoDeMapa) {
    super(editorial, fechaDePublicacion, precio, titulo, estado, folio);
    this.tipoDeMapa = tipoDeMapa;
  }

  public String getTipoDeMapa() {
    return tipoDeMapa;
  }

  public void setTipoDeMapa(String tipoDeMapa) {
    this.tipoDeMapa = tipoDeMapa;
  }
  
  
  
}
