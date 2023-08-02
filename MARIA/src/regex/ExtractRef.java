package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractRef {
    public static String start (String str)
    {

        Pattern pattern = Pattern.compile("<a href=\"(.+?)\">(.+?)</a>?");
        Matcher matcher = pattern.matcher(str);


        return matcher.replaceAll("");
    }
}
