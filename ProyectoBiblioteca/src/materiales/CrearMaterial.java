/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materiales;

import ConexionBDD.MySQLMethods;

/**
 *
 * @author x360
 */
public class CrearMaterial {
  
  public void crearMaterial(String folio, String tipoDeMaterial, String titulo, 
          String editorial, String fechaDePublicacion, double precio, 
          String caracteristica){
    MySQLMethods sql = new MySQLMethods();
    switch(tipoDeMaterial){
      case "Libro":
        Libro nuevoLibro = new Libro(editorial, fechaDePublicacion, precio, 
                titulo, "disponible", folio, caracteristica);
        sql.registrarLibro(nuevoLibro);
        break;
      case "Mapa":
        Mapa nuevoMapa = new Mapa(editorial, fechaDePublicacion, precio, titulo, 
                "disponible", folio, caracteristica);
        sql.registrarMapa(nuevoMapa);
        break;
      case "Revista":
        Revista nuevoRevista = new Revista(editorial, fechaDePublicacion, precio, 
                titulo, "disponible", folio, caracteristica);
        sql.registrarRevista(nuevoRevista);
        break;
      case "Medios opticos":
        MedioOptico nuevoMedioOptico = new MedioOptico(editorial, 
                fechaDePublicacion, precio, titulo, "disponible", folio, caracteristica);
        sql.registrarMedioOptico(nuevoMedioOptico);
        break;
      case "Periodico":
        Periodico nuevoPeriodico = new Periodico (editorial, fechaDePublicacion, 
                precio, titulo, "disponible", folio, caracteristica);
        sql.registrarPeriodico(nuevoPeriodico);
        break;
      case "Software":
        float version = Float.parseFloat(caracteristica);
        Software nuevoSoftware = new Software (editorial, fechaDePublicacion, 
                precio, titulo, "disponible", folio, version);
        sql.registrarSoftware(nuevoSoftware);
        break;
    }
  }
  
}
