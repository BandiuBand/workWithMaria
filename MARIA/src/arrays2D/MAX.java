package arrays2D;

public class MAX {
    public static int start(int[][] array)
    {
        int[] min = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            min[i] = arrays.MAX.start(array[i]);
        }
        return arrays.MAX.start(min);
    }
}
