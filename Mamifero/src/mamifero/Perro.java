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
 * @time 1:55:03
 */
public class Perro extends Mamifero{
    
//    String color;
//    int peso;
    
    public Perro(String color, int peso){
        super(4,color, peso);
//        this.color = color;
//        this.peso = peso;
    }
    
    @Override
    public void comer(){
        System.out.println("\nSoy un perrillo comiendo un hueso");
    }
    @Override
    public void sonido(){
        System.out.print("Guau Guaaaauuuuu");
    }
    
      @Override
    public String toString() {
        return "de color " + color + ", con un peso de " + peso + " Kg";
    }
}
