package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsCount {
    public static int start(String string)
    {
        Pattern pattern = Pattern.compile("[AEIOUaeiouЄІАЕЁИОУЫЭЮЯаеёиоуыэюяєі]");
        Matcher matcher = pattern.matcher(string);
        int i = 0;
        while (matcher.find())
        {
            i++;
        }
        return i;
    }
}
