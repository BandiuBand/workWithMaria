package strings;

public class ChangeWordToLength {
    public static String start (String string)
    {
        String[] words;
        words = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>0)
                stringBuilder.append(words[i].length()).append(" ");
        }
        return stringBuilder.toString();
    }
}
