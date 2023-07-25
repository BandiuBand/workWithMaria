package arrays2D;

public class SumRowEl {
    public static int[] start(int[][] array)
    {
        Iterator iterator = new Iterator(array);
        int[] result = new int[array.length];
        while (iterator.availableRow())
        {
            result[iterator.getIndexRow()]=arrays.SumOfElements.start(iterator.nextRow());
        }
        return result;
    }


}
