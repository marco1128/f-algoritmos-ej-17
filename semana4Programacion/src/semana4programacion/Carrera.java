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
class Carrera {
    private String nombre;
    private String modalidad;
    
public void establecer_nombre(String n){
    nombre= n;
}
public String obtener_nombre(){
   return nombre; 
}
public void establecer_modalidad(String n){
    modalidad = n;
}
public String obtener_modalida(){
    return modalidad;
}
public Carrera (){
    modalidad = "Distancia";
}
public Carrera(String md){
    modalidad= md;
}
public Carrera (String md, String x){
    modalidad=md;
    nombre =x;
}

}
