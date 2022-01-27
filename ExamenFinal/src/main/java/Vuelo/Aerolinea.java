/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vuelo;

/**
 *
 * @author USER
 */
public class Aerolinea {
    private String nombre;
    private String RUC;

    public Aerolinea(String nombre, String RUC) {
        this.nombre = nombre;
        this.RUC = RUC;
    }
      @Override
    public String toString() {
        return  "\nnombre =" + nombre+
                "\nRUC = " + RUC + 
                "\n";
                
    }
}
