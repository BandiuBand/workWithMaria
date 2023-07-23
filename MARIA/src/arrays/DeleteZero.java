package arrays;

public class DeleteZero {
    public static int[] start (int[] array)
    {   boolean ifHaveZero = false;
        int lengthNonZero = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0) {
                ifHaveZero = true;
                lengthNonZero--;
            }
        }
        if (ifHaveZero){
            int[] result = new int[lengthNonZero];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i]!=0)
                {
                    result[j]=array[i];
                    j++;
                }
            }
        return result;
        }
        return array;
    }
}
