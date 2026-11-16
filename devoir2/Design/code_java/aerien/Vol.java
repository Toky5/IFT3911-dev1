package aerien;

import java.util.*;
import transport.CritereRecherche;
import transport.Voyage;


public class Vol extends Voyage {
    private Avion avion;
    private Aeroport origine;
    private Aeroport destination;
    public boolean correspond(CritereRecherche c) { return false; }
}
