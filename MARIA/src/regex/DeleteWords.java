package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteWords {
    public static String start (String str)
    {
        Pattern pattern = Pattern.compile("\\w++");
        Matcher matcher = pattern.matcher(str);
        return  matcher.replaceAll("");
    }
}
