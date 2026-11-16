package application;

import java.util.*;

public interface IServiceAdmin {
    void creerCompagnie(String mode, String code, String nom);
    void creerTerminal(String mode, String code, String ville);
    void creerVehicule(String mode, String codeCompagnie, String id);
    void creerVoyage(String mode, String idVehicule, String numero, String depart, String arrivee);
    void assignerPrix(String codeCompagnie, double pleinTarif);
}
