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
public class PaisArreglo {
    private int indice;

    public PaisArreglo(int indice) {
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    public boolean agregar(Pais p){
        return false;
    }
    
    public Pais getPais(String codigo){
        return null;
    }
      
    public boolean eliminar(String codigo){
        return false;
    }
    
}
