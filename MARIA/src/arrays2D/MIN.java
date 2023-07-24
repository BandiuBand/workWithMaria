package arrays2D;

public class MIN {
    public static int start(int[][] array)
    {
        int[] min = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            min[i] = arrays.MIN.start(array[i]);
        }
        return arrays.MIN.start(min);
    }
}
