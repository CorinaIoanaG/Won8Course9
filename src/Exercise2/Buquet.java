package Exercise2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Buquet {

    private Set<String> flowers = new HashSet<>();

    public boolean remove(String flower) {
        if (flowers.remove(flower)) {
            return true;
        }
        return false;
    }

    public boolean add(String flower) {
        if (flowers.add(flower)) {
            return true;
        }
        return false;
    }

    public Collection<String> getAll() {
        return flowers;
    }

}
