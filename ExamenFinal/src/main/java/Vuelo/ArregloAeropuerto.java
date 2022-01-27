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
public class ArregloAeropuerto {
    private int indice;
    public static Aeropuerto[] arregloAeropuertos; 
    public ArregloAeropuerto(int indice) {
        this.indice = indice;
        this.arregloAeropuertos = new Aeropuerto[50];
    }
   public boolean agregar(Aeropuerto a){
    try{arregloAeropuertos[this.indice]=a;
    this.indice++;
    return true;}
    catch(Exception e){
    return false;
    }
   
   } 

    public static Aeropuerto[] getArregloAeropuertos() {
        return arregloAeropuertos;
    }

    public static void setArregloAeropuertos(Aeropuerto[] arregloAeropuertos) {
        ArregloAeropuerto.arregloAeropuertos = arregloAeropuertos;
    }
   public Aeropuerto[] getAeropuerto(Pais pais){
       Ciudad[] ciudades = Pais.getCiudades(pais.getNombre()) ;
              
        Aeropuerto[] temp = new Aeropuerto[50];
        int i=0;
        int cont = 0;
       while(ciudades[i]!= null){
        if(ciudades[i].getAeropuerto()!= null){
            
            temp[cont]=ciudades[i].getAeropuerto();
            cont++;
        }
        i++;
       }
       
    return temp;
    
   
    
   }
    public Aeropuerto getAeropuerto(Ciudad ciudad){
        
    return Ciudad.getAeropuertos(ciudad.getNombre());
    
    
   }
    
}
