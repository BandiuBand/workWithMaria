package strings;

public class ChangeSymb {
    public static String start(String string, char symTh,char symTo )
    {
        return string.replaceAll(String.valueOf(symTh), String.valueOf(symTo));
    }
}
