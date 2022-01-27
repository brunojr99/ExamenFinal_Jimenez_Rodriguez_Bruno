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
public class Asiento {
    private int nroAsiento;
    private char fila;
    private String estado;

    public Asiento(int nroAsiento, char fila) {
        this.nroAsiento = nroAsiento;
        this.fila = fila;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public boolean reservarAsiento(){
        
    return false;
    }
     public boolean cancelarAsiento(){
        
    return false;
    }
      public boolean venderAsiento(){
        
    return false;
    }
    @Override
    public String toString() {
        return  "\nNro de Asiento=" + nroAsiento+
                "\nFila= " + fila + 
                "\n";
                
    }
}
