package lists;

import java.util.ArrayList;

public class IsContainWord {
    public static ArrayList<String> start (ArrayList<String> list,String word)
    {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (isContain(list.get(i),word))
                result.add(list.get(i));
        }
        return result;
    }

    private static boolean isContain (String string, String word)
    {
        return string.contains(word);
    }
}
