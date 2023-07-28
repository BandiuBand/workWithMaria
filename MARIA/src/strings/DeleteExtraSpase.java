package strings;

public class DeleteExtraSpase {
    public static String start (String string)
    {
        return string.replaceAll(" \\s+"," ");
    }
}
