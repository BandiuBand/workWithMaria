package arrays2D;

import java.util.Arrays;

public class CheckTask {
    public static void start() {
        int[][] array = new int[][]{{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}};
        System.out.println("Sum of elements");
        Arrays.stream(array).forEach(a->{
            System.out.println(Arrays.toString(a));});
        System.out.println(arrays2D.SumOfElements.start(array));

    }
}
