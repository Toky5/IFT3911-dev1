package ferroviaire;

import java.util.*;
import transport.CritereRecherche;
import transport.Voyage;


public class TrajetFerroviaire extends Voyage {
    private Train train;
    private List<Arret> arrets;
    public boolean correspond(CritereRecherche c) { return false; }
}
