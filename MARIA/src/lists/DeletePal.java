package lists;

import java.util.ArrayList;

public class DeletePal {
    public static ArrayList<String> start (ArrayList<String> list)
    {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!(strings.ChPolindr.start(list.get(i))))
                res.add(list.get(i));
        }
        return res;
    }
}
