package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsEmail {
    public static boolean start (String str)
    {
        Pattern pattern = Pattern.compile("\\w+?@\\w+?.\\w+?");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
