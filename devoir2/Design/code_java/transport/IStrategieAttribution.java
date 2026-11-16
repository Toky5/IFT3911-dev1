package transport;

import java.util.*;
import commun.Priorite;


public interface IStrategieAttribution {
    UniteReservable choisir(List<UniteReservable> libres, Priorite p);
}
