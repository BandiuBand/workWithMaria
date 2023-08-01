package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsNumber {
    public static boolean start (String str)
    {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
