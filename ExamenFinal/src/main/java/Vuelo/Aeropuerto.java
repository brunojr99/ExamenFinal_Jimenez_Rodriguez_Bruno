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
public class Aeropuerto {
    
    private String nombreA;
    private String direccion;
    private boolean estado;
    private String  codCiudad;
    
    public Aeropuerto(String nombreA, String direccion, String codCiudad) {
        this.nombreA = nombreA;
        this.direccion = direccion;
        this.codCiudad = codCiudad;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }
    
    public boolean suspender(){
        this.estado = false;
        return false;
    }
    public boolean activar(){
    this.estado = true;
    return true;
    }
    
     @Override
    public String toString() {
        return "\nnombre= " + nombreA + 
                "\ndireccion=" + direccion+
                "\nestado= " + estado + 
                "\n";
                
    }
}
