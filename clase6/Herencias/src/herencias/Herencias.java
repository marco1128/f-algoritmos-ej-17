/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import EjemploUml.Asignatura_Presencial;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Asignatura_Presencial asignatura [] = new Asignatura_Presencial[2]; 
        asignatura [0] = new Asignatura_Presencial ("Programacion", "comun", 100, 180);
        asignatura [1]= new Asignatura_Presencial ("Lietratura", "tronal", 300, 200);
        
        
        
        
        Estudiante e = new Estudiante("René", "Elizalde", 16, asignatura);
        System.out.println(e);
        
        
        
        
    }
    
}
