package catalogue;

import java.util.*;

public interface Repertoire<T> {
    void ajouter(T e);
    void retirer(String id);
    T trouver(String id);
}
