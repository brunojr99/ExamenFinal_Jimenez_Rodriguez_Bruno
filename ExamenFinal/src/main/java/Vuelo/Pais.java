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
public class Pais {
    private String codigo;
    private String nombre;
    public Pais(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        //this.ciudadArreglo = new Ciudad[50];
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
    
    public Ciudad[] getCiudades(String codPais,Ciudad[] ciudades){
        Ciudad[] temp = new Ciudad[50];
        int cont = 0;
        int i = 0;
        while(ciudades[i]!=null){
        if(ciudades[i].getCodPais().equalsIgnoreCase(codPais)){         
            temp[cont]=ciudades[i];
            cont++;
        }
        i++;
       }
       return temp;
    }
    
    @Override
    public String toString() {
        return  "\ncodigo=" + codigo+
                "\nnombre= " + nombre + 
                "\n";
                
    }
}
