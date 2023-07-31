package lists;

import java.util.ArrayList;
import java.util.HashMap;

public class MapStAm {
    public static HashMap<String,Integer> start (ArrayList<String> list)
    {
        HashMap<String,Integer> res = new HashMap<>();
        for (String string: list) {
            if (res.containsKey(string))
                res.put(string,res.get(string)+1);
            else
            res.put(string,1);
        }
        return res;
    }
}
