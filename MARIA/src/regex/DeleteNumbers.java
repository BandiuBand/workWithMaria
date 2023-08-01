package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteNumbers {
    public static String start (String str)
    {
        Pattern pattern = Pattern.compile("\\d++");
        Matcher matcher = pattern.matcher(str);
        return  matcher.replaceAll("");
    }
}
