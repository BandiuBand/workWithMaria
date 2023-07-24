package arrays2D;

public class AmountZeroElements {
    public static int start (int[][] array)
    {
        Iterator iterator = new Iterator(array);
        int amount = 0;
        while(iterator.available())
        {
            if(iterator.nextElement()==0)
        amount++;
        }
        return amount;
    }
}
