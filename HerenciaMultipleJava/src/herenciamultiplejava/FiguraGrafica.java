/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamultiplejava;
/**
 *
 * @author Fco Manuel Guerrero Jimènez
 */
public interface FiguraGrafica {
    //Todas las variables definidas en una interfaz automáticamente son definidas como globales y constantes (static y final) 
    //aunque no se indique explícitamente, por lo que deben tener un valor asignado y visibilidad pública o de paquete.
    int grosorBorde = 2;   // variable global 
            
    //FiguraGrafica es Abstracto y no puede ser instaciado

    public void pintarBorde(String color);
    
    public void colorear(String color);
}   

