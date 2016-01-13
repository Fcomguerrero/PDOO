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
public class Director extends Empleado{
    
private String despacho;
private double incentivos;//% que se incrementa su nómina

public Director(String nom, double s, String d, double i){ 
    super(nom, s);
    despacho = d;
    incentivos = i;
}

public double getIncentivos() {
    return super.getSueldo()*0.08;
}

@Override
public double calcularNomina(){
    return super.calcularNomina() + getIncentivos();
}

@Override
    public String toString(){
        return super.toString() + "\nMi Despacho es: "+ despacho +
                " y los incentivos son de "+ getIncentivos()+ " euros"+
                "\nSueldo Total: "+ calcularNomina();
    }

}//class

