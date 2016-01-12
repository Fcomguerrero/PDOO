/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

/**
 *
 * @author fcis
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        Empleado emp = new Empleado("NombreEmp", 2999);
        Director dir = new Director("NombreDir", 6317, "despacho 3", 1.0);
        
        System.out.println(emp);
        System.out.println(dir);
        
        
    }
}
