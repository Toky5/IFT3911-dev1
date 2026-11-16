package application;

import java.util.*;
import catalogue.CatalogueCompagnies;
import catalogue.CatalogueTerminaux;
import catalogue.CatalogueVoyages;
import commun.ModeTransport;
import transport.FabriqueTransport;


public class ControleurAdmin implements IServiceAdmin {
    private CatalogueCompagnies compagnies;
    private CatalogueTerminaux terminaux;
    private CatalogueVoyages voyages;
    private Map<ModeTransport, FabriqueTransport> fabriques;
}
