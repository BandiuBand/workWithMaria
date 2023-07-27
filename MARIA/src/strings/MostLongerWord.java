package strings;

public class MostLongerWord {
    public static String start(String string)
    {
        String[] words;
        words = string.split(" ");
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>words[maxLength].length())
            {
                maxLength=i;
            }
        }
        return words[maxLength];
    }
}
