package lists;

import java.util.ArrayList;
import java.util.Comparator;

public class SortByLength {
    public static ArrayList<String> start (ArrayList<String> list)
    {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        list.sort(comparator);
        return list;
    }
}
