package lists;

import java.util.ArrayList;

public class CountWords {
    public static ArrayList<Integer> start(ArrayList<String> list)
    {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            res.add(i,strings.CountWords.start(list.get(i)));
        }
        return res;
    }
}
