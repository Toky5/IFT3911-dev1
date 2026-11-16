package application;

import java.util.*;
import catalogue.CatalogueTerminaux;
import catalogue.CatalogueVoyages;
import catalogue.RegistreReservations;
import paiement.IServicePaiement;


public class ControleurClient implements IServiceClient {
    private CatalogueVoyages catalogueVoyages;
    private CatalogueTerminaux catalogueTerminaux;
    private RegistreReservations registre;
    private IServicePaiement servicePaiement;
}
