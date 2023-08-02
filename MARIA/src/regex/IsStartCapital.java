package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsStartCapital {
    public static boolean start (String str)
    {
        Pattern pattern = Pattern.compile("^[A-Z[А-Я]]");
        Matcher matcher = pattern.matcher(str);

        return matcher.find();
    }
}
