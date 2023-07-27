package strings;

public class Reverse {
    public static String start(String str)
        {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.reverse();
            return stringBuilder.toString();
        }
    public static String start2(String str)
    {
        char[] strArray = str.toCharArray();
        char[] result = new char[strArray.length];
        int j = strArray.length-1;
        for (int i = 0; i < strArray.length; i++) {
            result[j] = strArray[i];
            j--;
        }
        return new String(result);
    }
}
