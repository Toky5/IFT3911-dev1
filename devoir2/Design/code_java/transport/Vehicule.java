package transport;

import java.util.*;

public abstract class Vehicule {
    private String identifiant;
    private List<Section> sections;
    public Section getSection(ITypeSection t) { return null; }
    public abstract Compagnie getCompagnie();
}
