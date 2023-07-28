package strings;

public class ChPolindr {
    public static boolean start(String string)
    {
        int middle = string.length()/2;
        String first_part = string.substring(0,middle);
        String second_part = string.substring(string.length()-middle,string.length());
        return first_part.compareTo(Reverse.start(second_part))==0;

    }
}
