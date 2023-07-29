package lists;

import java.util.ArrayList;

public class MostLongerSt {
    public static String start(ArrayList<String> list)
    {
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(j).length()<list.get(i).length())
                j = i;
        }
        return list.get(j);
    }
}
