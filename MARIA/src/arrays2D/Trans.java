package arrays2D;

public class Trans {
    public static int[][] start(int[][] array)
    {
        if (!checkPoss(array))
            throw new RuntimeException("Array isn`t correct");
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                result[j][i]=array[i][j];
            }
        }
        return result;
    }
    public static boolean checkPoss(int[][] array)
    {
        for (int i = 1; i < array.length; i++) {
            if (array[i].length!=array[i-1].length)
                return false;
        }
        return true;
    }
}
