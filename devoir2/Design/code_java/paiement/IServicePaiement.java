package paiement;

import java.util.*;

public interface IServicePaiement {
    String autoriser(String numeroCarte, String expiration, double montant);
}
