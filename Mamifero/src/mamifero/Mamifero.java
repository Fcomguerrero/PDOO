/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamifero;
/**
 *
 * @author Fco Manuel Guerrero Jimènez 
 * @date 18-ene-2016
 * @time 1:45:14
 */
public abstract class Mamifero {
     
    int numeroP;
    String color;
    int peso;
        
    public Mamifero(int num, String color, int peso) {
        numeroP = num;
        this.color = color;
        this.peso = peso;
    }

    public abstract void comer();
    public abstract void sonido();
    
    
    public String toString() {
        return "de color " + color + ", con un peso de " + peso + " Kg";
    }
}
