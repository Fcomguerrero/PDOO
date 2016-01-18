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
 * @time 1:46:19
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vaca vaca = new Vaca("BlanQuinegra", 325);
        Vaquilla vaqui = new Vaquilla("pardo", 35);
        Perro perrillo = new Perro("cuasiMarron", 5);
        
        vaca.comer();
        System.out.println(vaca);
        vaca.sonido();
        
        vaqui.comer();
        System.out.println(vaqui);
        vaqui.sonido();
        
        perrillo.comer();
        System.out.println(perrillo);
        perrillo.sonido();
    }
    
}
