package lists;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceWord {
    public static ArrayList<String> start (ArrayList<String> list,String word,String wordTo)
    {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(i,replaceW(list.get(i),word,wordTo));
        }
        return result;
    }
    private static String replaceW(String string,String word,String wordTo)
    {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(string);

        return matcher.replaceAll(wordTo);
    }
}
