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
public class Ciudad {
    private String codigo;
    private String nombre;
    private String codPais;
    private Aeropuerto aeropuerto;
    

    public Ciudad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }
    
    public static Aeropuerto getAeropuertos(String codCiudad){
        Aeropuerto[] aeropuertoArreglo = ArregloAeropuerto.getArregloAeropuertos() ;
        Aeropuerto temp = null;
        
        int i=0;
       while(aeropuertoArreglo[i]!= null){
        if(aeropuertoArreglo[i].getCodCiudad().equalsIgnoreCase(codCiudad)){
            
            temp=aeropuertoArreglo[i];
            break;
        }
        i++;
       }
       
    return temp;
    }


    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    
}
