package arrays;

public class SecondMin {
    public static int start (int[] array)
    {   int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < result)
                result = array[i];
        }
        int resultSec = Integer.MAX_VALUE;
        boolean isEx = false;
        for (int i = 1; i < array.length; i++) {
            if ((array[i] < resultSec)&&(array[i]!=result))
                resultSec = array[i];
                isEx = true;
        }
        return isEx?resultSec:0;
    }
}
