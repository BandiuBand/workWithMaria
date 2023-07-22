package arrays;

public class AmountEven {
    public static int start (int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                result++;
        }
        return result;
    }
}
