package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteData {
    public static String start (String str)
    {

        Pattern pattern = Pattern.compile("(\\d{2}-\\d{2}-\\d{4})|(\\d{4}-\\d{2}-\\d{2})");
        Matcher matcher = pattern.matcher(str);


        return matcher.replaceAll("");
    }
}

