package Exercise1;

import java.util.*;

public class Basket {
    private List<String> fruits = new LinkedList<>();

    public int customCount() {
        int i = 0;
        for (String item : fruits) {
            i++;
        }
        return i;
    }

    public int count() {
        return fruits.size();
    }

    public boolean add(String fruit) {
        if (fruits.add(fruit)) {
            return true;
        }
        return false;
    }

    public Collection<String> distict() {
        return new HashSet<>(fruits);
    }

    public Collection<String> basket() {
        return fruits;
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    public boolean remove(String fruit) {
        if (fruits.remove(fruit)) {
            return true;
        }
        return false;
    }

    public boolean find(String fruit) {
        if (fruits.contains(fruit)) {
            return true;
        }
        return false;
    }

}
