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
        System.out.println("Min of array elements");
        int[][] array2 = new int[][]{{3,4,5,6,7},{2,5,8}};
        print(array2);
        System.out.println(arrays2D.MIN.start(array2));

    }
    public static void print(int[][] array)
    {
        Arrays.stream(array).forEach(a->{
            System.out.println(Arrays.toString(a));});
    }
}
