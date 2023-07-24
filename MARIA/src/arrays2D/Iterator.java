package arrays2D;

public class Iterator {
    private int j = 0;
    private int i = 0;
    private int[][] array;
    public Iterator(int[][] array)
    {
        this.array = array;
    }
    public boolean available ()
    {
        return (i < array.length)&&(j<array[i].length);
    }
    public int nextElement()
    {
        int el = array[i][j];
        if (available())
            {   if((j+1)<array[i].length )
                j++;
                else {
                i++;
                j = 0;
            }
            }
        else throw new RuntimeException("IndexOfBoundException");
        return el;
    }
}
