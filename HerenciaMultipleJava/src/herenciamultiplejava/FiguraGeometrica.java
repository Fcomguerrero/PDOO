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
public abstract class FiguraGeometrica {  //Class Abstracta
    
    private int numLados;
    //constructor    
    public FiguraGeometrica(int lados){
        this.setNumLados(lados);
    }
    
    public abstract double perimetro(); //metodo Abstracto
    public abstract double area();      //metodo Abstracto


    public void setNumLados(int numL){
        numLados = numL;
    }
    
    public int getNumLados(){
        return numLados;
    }

public String toString() {
    return "Soy una Figura Geometrica de "+ getNumLados()+ " lados"; //To change body of generated methods, choose Tools | Templates.
    }
}