package arrays;

public class AmountNumbOfDivTo3 {

        public static int start (int[] array) {
            int result = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 3 == 0)
                    result++;
            }
            return result;
        }

}
