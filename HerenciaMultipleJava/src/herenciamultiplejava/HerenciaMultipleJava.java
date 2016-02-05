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
public class HerenciaMultipleJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rectangulo rectangulo = new Rectangulo(7.25, 3.18);
        rectangulo.colorear("rojo");
        rectangulo.pintarBorde("azul");
        
        System.out.println(rectangulo);
        
        
//        Rectangulillo rec = new Rectangulillo(19.0, 11.5);
//        System.out.println(rec);
    }
    
}
