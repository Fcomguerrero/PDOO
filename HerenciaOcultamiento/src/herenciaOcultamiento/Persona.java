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
public class Persona {

    private static int numPersonas = 0;
    protected String dni;
    private String nombre;
    
    public Persona(String d, String nom) {
        this.setDni(d);
        this.setNombre(nom);
        numPersonas +=1;
    }
    static int getNumPersonas(){
        return numPersonas;
    }
    protected String getNombre(){ 
        return this.nombre;
    }
    protected String getDni(){
        return this.dni;
    }
    protected void setNombre(String nom) {
        this.nombre=nom; 
    }
    void setDni(String d){
        this.dni=d; 
    }
    public void hablar(){ 
        System.out.println("bla bla bla");
    }
    
    public String toString(){
        String Salida = "\nMe llamo: " + getNombre() + "\nMi DNI es: " + getDni();
        return Salida;
    }
    
    
}//class

