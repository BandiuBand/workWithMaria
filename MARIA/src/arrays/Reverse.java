package arrays;

public class Reverse {
    public static int[] start(int[] array)
    {   int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[array.length-i-1] = array[i];
        }
        return result;
    }
}
