package transport;

import java.util.*;

public abstract class Compagnie {
    private String code;
    private String nom;
    private double pleinTarif;
    public double getPrix(ITypeSection t) { return 0; }
}
