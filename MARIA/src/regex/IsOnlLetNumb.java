package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsOnlLetNumb {
    public static boolean start (String str)
    {
        Pattern pattern = Pattern.compile("\\d+|\\w+");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
