package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeVavesToAst {

    public static String start (String str)
    {
        Pattern pattern = Pattern.compile("[AEIOUaeiouЄІАЕЁИОУЫЭЮЯаеёиоуыэюяєі]");
        Matcher matcher = pattern.matcher(str);
        return  matcher.replaceAll("*");
    }
}
