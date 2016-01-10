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
public class LACB {

    ArrayList<Jugador> jugadores = new ArrayList();
    ArrayList<Club> clubes = new ArrayList();
    private static LACB instance = new LACB();

    public LACB(){}
    
    public static LACB getInstance() {
      if(instance == null) {
         instance = new LACB();
      }
      return instance;
    }
    
    public Jugador buscarJugador(String dniPas){
        Jugador jugador = null;
        for(Jugador j:jugadores){
            if(j.getDni() == null ? dniPas == null : j.getDni().equals(dniPas))
                jugador = j;
        }
        return jugador;
    }
    
    public Club buscarClub(String nomClub){
        Club club = null;
        for(Club c:clubes){
            if(c.getNomClub() == null ? nomClub == null : c.getNomClub().equals(nomClub))
                return c;
        }
        return club;
    }
    
    public void vincularJugadorClub(String nomClub, String dniPas, int nuevoDorsal) throws InterruptedException{
        Jugador jugador = buscarJugador(dniPas);
        boolean vinculado = jugador.estasVinculado();
        if(vinculado) throw new InterruptedException("El jugador está"
                + "vinculado a otro club");
        Club club = buscarClub(nomClub);
        boolean ocupado = club.dorsalOcupado(nuevoDorsal);
        if(ocupado) throw new InterruptedException("Dorsal ya asignado"
                + "a otro jugador");
        jugador.vincularClub(club,nuevoDorsal);
        club.vincularJugador(jugador);
    }
    
    public void inscribirNuevoJugador(Jugador j){
        jugadores.add(j);
    }
    
    public void inscribirNuevoClub(Club c){
        clubes.add(c);
    }     

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        LACB lacb = LACB.getInstance();
        String nomClub = "Los Tigres";
        String dniPas = "74831309D";
        
        Jugador j = new Jugador(dniPas);
        lacb.inscribirNuevoJugador(j);
        Club c = new Club(nomClub);
        lacb.inscribirNuevoClub(c);
        lacb.vincularJugadorClub(nomClub, dniPas, 18);
        
        System.out.println("El jugador con DNI " + j.getDni() + 
                " ha sido vinculado al club " + c.getNomClub());
    }
    
}
