package arrays2D;

public class SumCowEl {
    public static int[] start(int[][] array)
    {
        return SumRowEl.start(Trans.start(array));
    }
}
