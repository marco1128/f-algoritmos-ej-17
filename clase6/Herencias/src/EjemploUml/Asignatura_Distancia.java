    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploUml;

/**
 *
 * @author BVB09
 */
public class Asignatura_Distancia extends Asignatura {
    private int numero_creditos;

    public Asignatura_Distancia(String nombre, String tipo, double costo, int numero_creditos) {
        super(nombre, tipo, costo);
        setNumero_creditos(numero_creditos);
    }

    public int getNumero_creditos() {
        return numero_creditos;
    }

    public void setNumero_creditos(int numero_creditos) {
        this.numero_creditos = numero_creditos;
    }
    @Override
    public String toString (){
        return String.format("%s"
                + "Humero de creditos: %d",super.toString(), getNumero_creditos());
        
    }
   

    

   
    
}
