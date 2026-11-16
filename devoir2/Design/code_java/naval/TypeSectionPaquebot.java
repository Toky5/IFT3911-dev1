package naval;

import java.util.*;
import transport.ITypeSection;


public enum TypeSectionPaquebot implements ITypeSection {
    I, O, S, F, D;
    public int getCapacite() { return 0; }
}
