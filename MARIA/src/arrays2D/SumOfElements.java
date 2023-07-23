package arrays2D;

public class SumOfElements {
    public static int start(int[][] array)
        {
            int result = 0;
            for (int i = 0; i < array.length; i++) {
                result = result + (arrays.SumOfElements.start(array[i]));
            }
        return result;
        }

}
