/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author fcis
 */
    public class VentanaTitulo extends Ventana{
        
    protected String titulo;
    
    public VentanaTitulo(int x, int y, int w, int h, String nombre) {
        super(x, y, w, h);
        titulo=nombre;
    }
  
    public void mostrar(){
        System.out.println("titulo     : "+titulo);
        super.mostrar();
    }
    public void desplazar(int dx, int dy){
        x += dx;
        y += dy;
    }
}

