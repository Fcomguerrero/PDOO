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
 * @time 1:49:59
 */
public class Vaquilla extends Vaca{
    
//     String color;  
//     int peso;
    
    public Vaquilla(String color, int peso){
        super(color, peso);
//        this.color = color;
//        this.peso = peso;
    }
    
    @Override
    public void comer(){
       System.out.println("\n\nSoy una vaquilla que bebe leche");
    }
    @Override
    public void sonido(){
         System.out.print("yo no hago ningun sonido aún");
    }
    
     @Override
    public String toString() {
        return super.toString();
    }
    
}//class
