package arrays;

public class SumOfElements {
    public static int start (int[] array)
    {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result+array[i];
        }
        return result;
    }
    /*public static <T> T start(T[] array)
    {
        Object t =  new Object();
        for (int i = 0; i < array.length; i++) {
            t = (Object)(((T)t) + array[i] );
        }
        return (T)t;
    }

     */
}
