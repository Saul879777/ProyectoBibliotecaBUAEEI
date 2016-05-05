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
public class Periodico extends Material {
  private String fechaDia;

  public Periodico(String editorial, String fechaDePublicacion, double precio, 
          String titulo, String estado, String folio, int tipoDeMaterial, 
          String fechaDia) {
    super(editorial, fechaDePublicacion, precio, titulo, estado, folio, 
            tipoDeMaterial);
    this.fechaDia = fechaDia;
  }

  public String getFechaDia() {
    return fechaDia;
  }

  public void setFechaDia(String fechaDia) {
    this.fechaDia = fechaDia;
  }
}
