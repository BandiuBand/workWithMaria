package arrays;

public class AmountSameElement {
    public static boolean start(int[] array)
    {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j)
                    continue;
                if (array[i]==array[j])
                    result++;
            }
        }
        return result>0?true:false;
    }
}
