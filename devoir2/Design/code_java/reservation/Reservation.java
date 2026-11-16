package reservation;

import java.util.*;
import paiement.Paiement;


public class Reservation {
    private String numero;
    private DateHeure dateHeureCreation;
    private EtatReservation etat;
    private IOffre offre;
    private IReservable unite;
    private Passager passager;
    private Paiement paiement;
    public boolean estActive(DateHeure maintenant) { return false; }
    public double getMontant() { return 0; }
    public void confirmer(Passager p, Paiement pa) { }
}
