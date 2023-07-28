package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsAnagram {
    public static boolean start (String string1,String string2)
    {
        Map<Character,Integer> map1 = count(string1);
        Map<Character,Integer> map2 = count(string2);

        return map1.equals(map2);
    }
    private static Map<Character,Integer> count (String string)
        {
            Map<Character,Integer> map = new HashMap<>();
            Pattern pattern = Pattern.compile("\\w");
            Matcher matcher = pattern.matcher(string);
            int i = 0;
            while (matcher.find())
            {
                Character c = string.charAt(matcher.start());
                if (map.containsKey(c))
                    map.put(c,(map.get(c).intValue()+1));
                else map.put(c,0);
            }
            return map;
        }
}
