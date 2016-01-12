/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author fcis
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp = new Empleado("NombreEmp", 3599);
        Director dir = new Director("NombreDir", 5393, "despacho 8", 3.0);
        
        System.out.println(emp);
        System.out.println(dir);
        
        
    }
    
}
