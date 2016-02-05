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
public class Rectangulo extends FiguraGeometrica implements FiguraGrafica{
    
    private double ladoa, ladob;

    //constructor 
    public Rectangulo(double la, double lb){
        super(4);
        ladoa =la;
        ladob =lb;
    }
    
@Override
public double perimetro(){
    return ((ladoa*2)+(ladob*2));
}
@Override
public double area(){
    return (ladoa*ladob);
}
@Override
public void pintarBorde(String color){
    System.out.println(color);
}
public void colorear(String color){
    System.out.println(color);
}

@Override
public String toString() {
    return super.toString()+ "\nMi perimetro es "+ perimetro() + " y mi Area es "+ area() 
            + "\nCon un Borde de Grosor: "+ FiguraGrafica.grosorBorde;
       
}  


}//class