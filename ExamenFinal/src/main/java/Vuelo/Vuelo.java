/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vuelo;

import Persona.Pasajero;

/**
 *
 * @author USER
 */
public class Vuelo {
    private String codigo;
    private String fecha;
    private String hora;
    private int puertadeembarque;
    private boolean activo;

    public Vuelo(String codigo, String fecha, String hora, int puertadeembarque) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.puertadeembarque = puertadeembarque;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPuertadeembarque() {
        return puertadeembarque;
    }

    public void setPuertadeembarque(int puertadeembarque) {
        this.puertadeembarque = puertadeembarque;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public boolean venderAsiento(Pasajero p, int nroasiento, char fila){
        if(p.getCodAsiento() == nroasiento && p.getFilaAsiento() == fila){
            return true;
        }
        return false;
    }
    
}
