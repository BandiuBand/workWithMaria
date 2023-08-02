package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsHexadecimal {
    public static boolean start (String str)
    {
        Pattern pattern = Pattern.compile("(\\d|[ABCDEF])+");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
