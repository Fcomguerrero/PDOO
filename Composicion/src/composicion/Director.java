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
public class Director{
    
private Empleado empl;    
private String despacho;
private double incentivos; //% que se incrementa su nómina

public Director(String nom, double s, String d, double i){ 
    empl = new Empleado(nom,s);
    despacho = d;
    incentivos = i;
}

public double getIncentivos() {
    return empl.getSueldo()*0.06;
}

public double calcularNomina(){
    return empl.calcularNomina() + getIncentivos();
}

public String toString(){
    return empl.toString() + "\nMi Despacho es: "+ despacho +
        " y los incentivos son de "+ getIncentivos()+ " euros" +
            "\nSuelto Total: "+ calcularNomina();
    }

}//class

