package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteWords {
    public static String start (String str)
    {
        Pattern pattern = Pattern.compile("\\w++");
        Matcher matcher = pattern.matcher(str);
        StringBuilder stringBuilder = new StringBuilder(str);
//        while (matcher.find()) {
//            stringBuilder.delete(matcher.start(), matcher.end());
//        }

        return  matcher.replaceAll("");
    }
}
