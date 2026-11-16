package application;

import java.util.*;
import commun.ModeTransport;
import commun.Priorite;


public interface IServiceClient {
    List<String> verifierVoyages(ModeTransport mode, String origine, String destination, Date date, char typeSection);
    String reserver(String numeroVoyage, char typeSection, Priorite p);
    String payer(String numeroReservation, String nom, String courriel, String passeport, String numeroCarte, String expiration);
}
