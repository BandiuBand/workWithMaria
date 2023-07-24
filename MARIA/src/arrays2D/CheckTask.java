package arrays2D;

import java.util.Arrays;

public class CheckTask {
    public static void start() {
        int[][] array = new int[][]{{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}};
        System.out.println("Sum of elements");
        print(array);
        System.out.println(arrays2D.SumOfElements.start(array));
        System.out.println("Average of array elements");
        System.out.println(arrays2D.Average.start(array));

    }
    public static void print(int[][] array)
    {
        Arrays.stream(array).forEach(a->{
            System.out.println(Arrays.toString(a));});
    }
}
