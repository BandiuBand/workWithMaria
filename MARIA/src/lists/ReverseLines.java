package lists;

import java.util.ArrayList;

public class ReverseLines {
    public static ArrayList<String> start (ArrayList<String> list)
    {
        ArrayList<String> res = new ArrayList<>();
        for (String line:list) {
            res.add(strings.Reverse.start(line));
        }
        return res;
    }
}
