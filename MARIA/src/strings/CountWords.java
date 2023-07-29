package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {
    public static int start (String string)
    {
        Pattern pattern = Pattern.compile("\\p{L}+");
        Matcher matcher = pattern.matcher(string);
        int i = 0;
        while (matcher.find())
        {
            i++;
        }
        return i;
    }
}
