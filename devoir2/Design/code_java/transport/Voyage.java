package transport;

import java.util.*;
import commun.Priorite;
import reservation.IOffre;
import reservation.IReservable;
import reservation.Reservation;


public abstract class Voyage implements IOffre {
    private String numero;
    private DateHeure depart;
    private DateHeure arrivee;
    private List<Reservation> reservations;
    private IStrategieAttribution strategie;
    public abstract boolean correspond(CritereRecherche c);
    public int getNbUnitesLibres(ITypeSection t) { return 0; }
    public Reservation reserver(ITypeSection t, Priorite p) { return null; }
    public double getPrix(IReservable u) { return 0; }
    public abstract Compagnie getCompagnie();
    public abstract Vehicule getVehicule();
}
