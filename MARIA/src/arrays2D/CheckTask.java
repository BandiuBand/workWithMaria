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
        System.out.println("Max of array elements");
        System.out.println(arrays2D.MAX.start(array2));
        int[][] array3 = new int[][]{{3,0,5,6,0},{2,0,8},{0,0,0,0,0,0,0,0,0,0,0,0},{1,1,1,1,1}};
        System.out.println("Amount of zero elements");
        print(array3);
        System.out.println(arrays2D.AmountZeroElements.start(array3));
        System.out.println("Sum of Row elements");
        print(array3);
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(SumRowEl.start(array3)));
        System.out.println("Transposition array");
        print(array);
        System.out.println("----------------------------");
        print(Trans.start(array));
        System.out.println("Sum of Cow elements");
        print(array);
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(SumCowEl.start(array)));

    }
    public static void print(int[][] array)
    {
        Arrays.stream(array).forEach(a->{
            System.out.println(Arrays.toString(a));});
    }
}
