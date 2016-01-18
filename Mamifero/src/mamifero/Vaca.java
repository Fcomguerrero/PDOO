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
 * @time 1:48:33
 */
public class Vaca extends Mamifero{
    
//    String color;
//    int peso;
    
    public Vaca(String color, int peso){
        super(4,color,peso);
//        this.color = color;
//        this.peso = peso;
    }
    @Override
    public void comer(){
       System.out.println("Soy una vaca comiendo hierva");
    }
    @Override
    public void sonido(){
         System.out.print("muuuuuuu");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
