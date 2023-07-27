package arrays2D;

public class RowMultip {
    private static long multiplex (int[] array)
        {   long result = array[0];
            for (int i = 1; i < array.length; i++) {
                result*=array[i];

            }
            return result;
        }
    public static long[] start(int[][] array)
    {
        Iterator iterator = new Iterator(array);
        int i = 0;
        long[] result = new long[array.length];
        while (iterator.availableRow())
        {
            result[i]=multiplex(iterator.nextRow());
            i++;
        }
        return result;
    }
}
