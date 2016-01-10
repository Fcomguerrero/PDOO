/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacb;

import java.util.ArrayList;

/**
 *
 * @author fcis
 */
public class Club {
    String nomClub;
    ArrayList<Jugador> jugadores;

    Club(String nomClub) {
        jugadores = new ArrayList();
        this.nomClub = nomClub;
    }

    
    String getNomClub() {
        return nomClub;
    }
    
    boolean dorsalOcupado(int dorsal){
        for(Jugador j:jugadores){
            if(j.esEsteTuDorsal(dorsal))
                return true;
        }
        return false;
    } 

    void vincularJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
}