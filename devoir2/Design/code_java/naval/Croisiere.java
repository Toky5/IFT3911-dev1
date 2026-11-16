package naval;

import java.util.*;
import transport.CritereRecherche;
import transport.Voyage;


public class Croisiere extends Voyage {
    private Paquebot paquebot;
    private List<Escale> escales;
    public boolean correspond(CritereRecherche c) { return false; }
}
