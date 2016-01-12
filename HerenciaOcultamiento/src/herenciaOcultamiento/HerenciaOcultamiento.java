/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaOcultamiento;

/**
 *
 * @author fcis
 */
public class HerenciaOcultamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno esteAlumno = new Alumno("7000000W","Fcis","Informatica", 2);
        Profesor elprofesor = new Profesor("00000000S", "nombre", "PDOO", 7);
        
        Persona persona = new Persona("1111","p");
        Profesor profesor = new Profesor("2222","pro","asig1",5);              
        
        //Muestra la informacion del Alumno
        System.out.println(esteAlumno);
        System.out.println(elprofesor);
        
        System.out.println(Profesor.getNumPersonas());
        System.out.println(Persona.getNumPersonas());        
        
        System.out.println(elprofesor.getNombre());
        System.out.println(elprofesor.getDni());
      
        
        System.out.println(esteAlumno.getNombre());
        System.out.println(esteAlumno.getDni());
        
        
       
        
        
        
        
    }
    
}
