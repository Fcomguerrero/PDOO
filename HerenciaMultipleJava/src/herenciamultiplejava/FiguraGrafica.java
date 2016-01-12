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
    
    int grosorBorde=2; // variable global al paquete
    
    public void pintarBorde(String color);
    
    public void colorear(String color);
}   

