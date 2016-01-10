/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacb;

/**
 *
 * @author fcis
 */
public class Jugador {
    private String dni;
    private int dorsal;
    private boolean vinculado;
    private Club club;

    Jugador(String dniPas) {
        dni = dniPas;
        vinculado = false;
        club = null;
        dorsal = 99;
    }
  
    String getDni(){
        return dni;
    }
    
    boolean esEsteTuDorsal(int dorsal){
        return this.dorsal==dorsal;
    }
    
    void setDorsal(int nuevoDorsal){
        this.dorsal = nuevoDorsal;
    }

    boolean estasVinculado(){
        return vinculado;
    }

    void vincularClub(Club club, int nuevoDorsal) {
        vinculado = true;
        this.club = club;
        this.dorsal = nuevoDorsal;
    }
}
