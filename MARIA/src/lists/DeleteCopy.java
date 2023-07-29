package lists;

import java.util.ArrayList;

public class DeleteCopy {
    public static ArrayList<String> start (ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(i);
                //i--;
                }
            }
        }
        return list;
    }
}
