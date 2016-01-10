/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.y.ocultamiento;

/**
 *
 * @author fcis
 */
public class Alumno extends Persona{
    String carrera;
    int curso;

    public Alumno(String d,String nom,String carr,int cur ){
        super(d,nom);
        this.carrera = carr;
        this.curso = cur;
    }
    public String getCarrera() {
        return carrera;
    }
    public int getCurso() {
        return curso;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEstudio: "+ getCurso() + " de "+ getCarrera()+
               "\nNumero de Personas: ";
    }

    
    
}//class
