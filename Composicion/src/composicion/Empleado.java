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
public class Empleado {
 
private String nombre;
private double sueldo;

//constructor de Empleado
public Empleado(String nom, double suel){
    this.nombre = nom;
    this.sueldo = suel;
}

public double calcularRetenciones(){
    return sueldo/20;
}

public double calcularNomina(){
return (sueldo - calcularRetenciones());
}

public String getNombre() {
    return nombre;
}

public double getSueldo() {
    return sueldo;
}

public String toString(){
        String Salida = "\nMe llamo: " + getNombre()+ "\nMi Sueldo es: " + getSueldo()+
                " con una nomina de " + calcularNomina();
        return Salida;
    }

}//class

