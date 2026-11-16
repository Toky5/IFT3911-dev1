package transport;

import java.util.*;

public interface FabriqueTransport {
    Compagnie creerCompagnie(String code, String nom);
    Vehicule creerVehicule(Compagnie c, String id);
    Voyage creerVoyage(Vehicule v, String numero, String depart, String arrivee);
    Terminal creerTerminal(String code, String ville);
}
