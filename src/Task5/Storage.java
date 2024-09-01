package Task5;

import java.util.Set;
import java.util.HashSet;

public class Storage {


    private Set<String> set;

    public Storage() {

        this.set = new HashSet<>();
    }


    public void add(String str) {
        this.set.add(str);
    }

    public void remove(String str) {
        this.set.remove(str);

    }

    public void size() {
        for (String str : this.set) {
            System.out.println(str);
        }
    }

    public void clear() {
        this.set.clear();
    }

    public boolean contains(String str) {

        for (String s : this.set) {
            if (s.equals(str)) return true;
        }
        return false;
    }

//    add
//• remove
//• size
//• contains
//• clear
}
