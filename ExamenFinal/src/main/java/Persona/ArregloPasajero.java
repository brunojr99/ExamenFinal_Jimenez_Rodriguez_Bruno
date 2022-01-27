/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Configuracion.Config;

/**
 *
 * @author USER
 */
public class ArregloPasajero {
    private static int indice;
    private Pasajero arregloP[];
    private int tamaño;
    
    public ArregloPasajero(int tamaño) {
        this.indice = 0;
        this.tamaño = tamaño;
        this.arregloP = new Pasajero[tamaño];
    }
    
        
    public boolean PasajeroValido(Pasajero documento){//Ver si un usuario ya esta registrado antes de crear otro
        boolean result = false;
        
        //valida si son iguales
         
            if(indice>0){//si el indice es mayor a 0
                for(int i=0; i<this.indice;i++){//recorre el indice
                    if(documento.getNroDocumento().equals(this.arregloP[i].getNroDocumento())){//compara si hay un documento ya registrado
                    result = false;
                    
                    break;
                    }  
                }
            }
        
        
        return result;
    }
    public boolean agregarPasajero(Pasajero usuario){
        boolean result = false;
        Pasajero documento = null;
        documento = usuario;
            if(PasajeroValido(documento)){//Si es true va a agregar
                if(PasajeroLleno()){//Si esta lleno aumentara tamaño
                    crecerPasajero(); 
                }
            this.arregloP[this.indice] = usuario;
            this.indice = indice +1;
            result = true;
        
            }
        
        return result;
    }
    private void crecerPasajero(){//hara que el arreglo crezca
        Pasajero arregloP2[];
        if(PasajeroLleno()){
            arregloP2 = new Pasajero[tamaño];
            for(int i=0;i<tamaño;i++){
                arregloP2[i] = arregloP[i];
            }
            arregloP = new Pasajero[tamaño+1];
            for(int i=0;i<tamaño-1;i++){
                arregloP[i]=arregloP2[i];
            }
        }
    }
    private boolean PasajeroLleno(){//metodo para validar si el arreglo esta lleno para hacerlo crecer
        boolean result = false;
        if(this.indice == this.tamaño){
            
            result = true;
        }
        return result;
    }
        
    private boolean PasajeroVacio(){
        boolean result = false;
        if(this.indice == 0){
            result=true;
        }
        return result;
    }

    public Pasajero[] getArregloP() {
        return arregloP;
    }

    public void setArregloP(Pasajero[] arregloP) {
        this.arregloP = arregloP;
    }

    public static int getIndice() {
        return indice;
    }

    public static void setIndice(int indice) {
        ArregloPasajero.indice = indice;
    }
    
    
    
    @Override
    public String toString() {
        String result=" ";
        
        for(int i =0;i<this.indice;i++){
            result += this.arregloP[i];
            
        }
        
        return result;
    }
    
    
    
    
    
    
    
}
