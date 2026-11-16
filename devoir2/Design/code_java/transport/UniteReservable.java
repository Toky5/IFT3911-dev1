package transport;

import java.util.*;
import reservation.IReservable;


public abstract class UniteReservable implements IReservable {
    private String numero;
    public String getIdentifiant() { return null; }
    public double getCoefficient() { return 0; }
}
