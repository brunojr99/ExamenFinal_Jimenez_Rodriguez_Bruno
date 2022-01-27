/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Vuelo.Aeropuerto;
import Vuelo.ArregloAeropuerto;
import Vuelo.Ciudad;
import Vuelo.Pais;

/**
 *
 * @author USER
 */
public class App {
    public static void main(String[] args) {
        // Inicializando ciudades
        Ciudad[] ciudad = new Ciudad[3];
        ciudad[0] = new Ciudad("100C", "Lima", );
        ciudad[1] = new Ciudad("200C", "Cuzco");  
        ciudad[2] = new Ciudad("300C", "Arequipa");
        // Inicializando paises
        Pais[] pais = new Pais[2];
        pais[0] = new Pais("100P", "Peru");
        pais[1] = new Pais("200P", "Paraguay");
        // Aeropuertos
        Aeropuerto a = new Aeropuerto("Aeropuerto Quiñonez", "Av. Marina 123");
        // Inicializand AeropuertoArreglo
        ArregloAeropuerto aeropuertos = new ArregloAeropuerto(0);
        aeropuertos.agregar(a);
    }
}
