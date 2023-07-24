package arrays2D;

public class Average {
    public static int start (int[][] array)
    {
        int size = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + arrays.SumOfElements.start(array[i]);
            size=size + array[i].length;
        }
        return average/size;
    }
}
