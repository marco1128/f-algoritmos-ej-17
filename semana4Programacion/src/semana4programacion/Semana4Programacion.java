/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4programacion;

/**
 *
 * @author BVB09
 */
public class Semana4Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrera c = new Carrera();
        c.establecer_modalidad("Informatica");
        c.establecer_modalidad("Distancia");
        System.out.println(c);
        Carrera c2 = new Carrera("Electronica");
        System.out.println(c2.obtener_modalida());
        Carrera c3 = new Carrera("Semi precensial");
        System.out.println(c3.obtener_modalida());
        c3.establecer_modalidad("Distancia");
        System.out.println(c3.obtener_modalida());
        c3.establecer_modalidad(c3.obtener_modalida().toUpperCase());
        System.out.println(c3.obtener_modalida());

    }

}
