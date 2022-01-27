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
        // Aeropuertos
        Aeropuerto a1 = new Aeropuerto("Aeropuerto Quiñonez", "Av. Marina 123", "Lima");
        Aeropuerto a2 = new Aeropuerto("Tupac Amaru", "Av. Peru 313", "Cuzco");
        Aeropuerto a3 = new Aeropuerto("Machu Picchu", "Av. Universitaria 4241", "Buenos Aires");
        // ArregloAeropuertos
        ArregloAeropuerto aeropuertos = new ArregloAeropuerto(1);
        aeropuertos.agregar(a1);
        aeropuertos.agregar(a2);
        aeropuertos.agregar(a3);
        
        /*for (int i =0;i<ciudad.length;i++){
            System.out.println("Ciudad :"+ciudad[i].toString());
        }*/
        // Inicializando paises
        Pais[] pais = new Pais[2];
        pais[0] = new Pais("100P", "Peru");
        pais[1] = new Pais("200P", "Argentina");
        //
        // Inicializando ciudades
        Ciudad[] ciudades = new Ciudad[50];
        ciudades[0] = new Ciudad("100C", "Lima", "100P");
        ciudades[0].setAeropuerto(a1);
        ciudades[1] = new Ciudad("200C", "Cuzco", "100P");
        ciudades[1].setAeropuerto(a2);
        ciudades[2] = new Ciudad("300C", "Buenos Aires", "200P");
        ciudades[2].setAeropuerto(a3);
        Ciudad[] ciudad_del_pais = pais[0].getCiudades(pais[0].getCodigo(), ciudades);
        /*int i = 0;
        while(ciudad_del_pais[i]!=null){
            System.out.println("Ciudad :"+ciudad_del_pais[i].toString());
              i++;
        }*/
        
    }
}
