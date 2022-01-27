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
    public static Pais[] arregloPaises;
    public PaisArreglo(int indice) {
        this.indice = indice;
        this.arregloPaises = new Pais[50];
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    public boolean agregar(Pais p){
        try{arregloPaises[this.indice]=p;
        this.indice++;
        return true;}
        catch(Exception e){
        return false;
    }
        
    }
    
    public Pais getPais(String codigo){
        int i= 0;
        while(arregloPaises[i]!=null){
            if(arregloPaises[i].getCodigo().equalsIgnoreCase(codigo)){
                return arregloPaises[i];
                
            }
            i++;
        }
        return null;
    }
      
    public boolean eliminar(String codigo){
        int i= 0;
        while(arregloPaises[i]!=null){
            if(arregloPaises[i].getCodigo().equalsIgnoreCase(codigo)){
               while(arregloPaises[i+1]!=null){
                   arregloPaises[i]= arregloPaises[i+1];
                   i++;
               }
               arregloPaises[i]=null;
               this.indice--;
               return true;
            }
            i++;
        }
               
        return false;
    }
    
}
