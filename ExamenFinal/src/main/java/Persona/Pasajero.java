/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Pasajero {
    private String tipoDocumento;
    private String nroDocumento;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int codAsiento;
    private char filaAsiento;
    public Pasajero(String tipoDocumento, String nroDocumento, String nombre, String apellido, String fechaNacimiento) {
       
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
       
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodAsiento() {
        return codAsiento;
    }

    public void setCodAsiento(int codAsiento) {
        this.codAsiento = codAsiento;
    }

    public char getFilaAsiento() {
        return filaAsiento;
    }

    public void setFilaAsiento(char filaAsiento) {
        this.filaAsiento = filaAsiento;
    }



   
    public String toString() {
        return "\nnombre= " + nombre + 
                "\napellido=" + apellido+
                "\ndocumento= " + nroDocumento+ 
                "\nfecha de nacimiento=" + fechaNacimiento +"\n";
                
    }
    
    
}
