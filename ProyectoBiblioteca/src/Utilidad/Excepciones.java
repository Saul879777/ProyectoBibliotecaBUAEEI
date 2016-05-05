/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Excepciones extends Exception{
    
    public Excepciones(){
    };
    /**
     * Sirve para decirle al usuario que 
     */
    public void campoVacio(){
        JOptionPane.showMessageDialog(null, "Llene todos los campos", "Invalid TextFields", JOptionPane.ERROR_MESSAGE);
    }
    
    public  boolean comprobarMatricula(){
        //S14011613
        return true;
    
    }
    public boolean usuarioExcistente(){
        return false;
    
    }
}
