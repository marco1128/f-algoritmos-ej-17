/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundasemana;

/**
 *
 * @author BVB09
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    computadora c= new computadora();
        System.out.println(c.obtener_velocidad_procesador());  
        c.establecer_velocidad_procesador(5.2);
        System.out.println(c.obtener_velocidad_procesador());
    }
    
}
