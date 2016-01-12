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
public class Profesor extends Persona {
    
    String asignatura;
    int experiencia;

    public Profesor (String d, String nom,String asig,int exp){
        super(d,nom); // Se ejecuta el constructor de Persona
        this.asignatura = asig;
        this.experiencia = exp;
    }

    public String getAsignatura() {
        return asignatura;
    }
    public int getExperiencia() {
        return experiencia;
    }
    
    public void darClase(){
        System.out.println("dando clase");
    }
    
    // Redefinición del método hablar
    @Override
    public void hablar(){
        System.out.println( "Estimados");          
        super.hablar();// Se invoca hablar() de Persona
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nDoy clases de: "+ getAsignatura() +
                " y tengo "+ getExperiencia() + " años de experiencia" + 
                "\nNumero de Personas: "+ Profesor.getNumPersonas();
    }
}//class
