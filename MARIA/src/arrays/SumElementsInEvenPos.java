package arrays;

public class SumElementsInEvenPos {
    public static int start (int[] array)
    {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i+1)%2==0)
            result = result+array[i];
        }
        return result;
    }
}
