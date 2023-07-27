package arrays2D;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class MaxSumRow {
    public static int start (int[][] array)
    {
        Iterator iterator = new Iterator(array);
        int[] sumRowEl = new int[array.length];
        int i = 0;
        while (iterator.availableRow())
            {
                sumRowEl[iterator.getIndexRow()] = arrays.SumOfElements.start((iterator.nextRow()));
            }
        return getIndex(sumRowEl,arrays.MAX.start(sumRowEl));
    }

    private static int getIndex(int[] array,int value)
    {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==value)
                return i;
        }

        return -1;
    }
}
