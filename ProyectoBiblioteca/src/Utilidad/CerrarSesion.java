/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import GUI.InterfazPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author RICHY
 */
public class CerrarSesion extends Exception{
    
    public CerrarSesion(){
    }
    
   /**
    * Da la opcion al usuario para conemplar su cierre de sesion 
    * @return Regresara un valor booleano, En donde se indicara si confirmo el cierre de sesion
    */
    public boolean cierreDeSesion(){
         int confirmarCerrarSesion = JOptionPane.showConfirmDialog(null,"Estas seguro de que desea salir?");
        if(confirmarCerrarSesion == JOptionPane.YES_OPTION){
            InterfazPrincipal regresarinicio = new InterfazPrincipal();
            regresarinicio.setVisible(true);
            return true;
        }
        return false;
    } 

    private void dispose() {
        
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    

