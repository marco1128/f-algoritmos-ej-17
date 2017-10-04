/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author BVB09
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num ;
        int resultado;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el numero a multiplucar");
        num = entrada.nextInt();
        for (int i = 0; i < 12; i++) {
            resultado = num * i;
            System.out.printf("%d X %d = %d\n",num, i ,resultado);   
        }
        
        
    }
    
}
