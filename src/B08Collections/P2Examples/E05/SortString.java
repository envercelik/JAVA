package B08Collections.P2Examples.E05;

import java.util.Comparator;

public class SortString implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {

        return -o1.compareTo(o2);
        
    }
}
