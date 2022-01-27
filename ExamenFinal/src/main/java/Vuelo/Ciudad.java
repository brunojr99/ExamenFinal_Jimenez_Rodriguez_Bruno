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
    

    public Ciudad(String codigo, String nombre, String CodPais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codPais = CodPais;
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

 

   
    /*
    public static Aeropuerto getAeropuerto(String codCiudad){
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
*/

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "codigo=" + codigo + ", nombre=" + nombre + ", codPais=" + codPais + ", aeropuerto=" + aeropuerto + '}';
    }

    
   

    
}
