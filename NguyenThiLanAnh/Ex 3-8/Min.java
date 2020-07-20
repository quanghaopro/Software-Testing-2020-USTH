import java.util.*;

public class Min {
    public static (List) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("Min.min");
        }
        if (result == null) throw new NullPointerException("Min.min");

        while (itr.hasNext()) {
            T comp = itr.next();
            if (comp.compareTo (result) < 0) {
                result = comp;
            }
        }
        return result;
    }
}
