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
    
    public ArregloPasajero(int indice) {
        this.indice = indice;
        this.arregloP = new Pasajero[indice];
    }
    public boolean VerificaLogeoClie(String usuario, String contraseña){
        boolean result = false;
        for(int i=0;i<this.indice;i++){
            if(this.arregloP[i].getUsuario().equals(usuario)&&this.arregloP[i].getContraseña().equals(contraseña)){
                Config.pos=i;
                Config.pasajeroConectado =this.arregloP[i];
                result = true;
                break;
            }
        }
        return result;
    }
        
    public boolean ClieValido(Pasajero documento){//Ver si un usuario ya esta registrado antes de crear otro
        boolean result = false;
        
        if(documento.getContraseña().equals(documento.getConfPass())){//valida si son iguales
            result = true;
            if(indice>0){//si el indice es mayor a 0
                for(int i=0; i<this.indice;i++){//recorre el indice
                    if(documento.getNroDocumento().equals(this.arregloP[i].getNroDocumento())){//compara si hay un documento ya registrado
                    result = false;
                    
                    break;
                    }  
                }
            }
        }
        
        return result;
    }
    
    
}
