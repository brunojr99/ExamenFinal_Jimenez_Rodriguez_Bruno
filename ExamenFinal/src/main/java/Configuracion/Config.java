/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import Persona.Pasajero;

/**
 *
 * @author USER
 */
public class Config {
        public static String loginUser = "admin";
    public static String loginPass = "ella";
    public static int pos;
    public static Pasajero pasajeroConectado;
    public static int aforo = 100;
    public static int fila;

    public static int getFila() {
        return fila;
    }

    public static void setFila(int fila) {
        Config.fila = fila;
    }

    
    
    
    public static int getAforo() {
        return aforo;
    }
    
    public static void setAforo(int aforo) {
        Config.aforo = aforo;
    }
}
