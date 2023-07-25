package arrays2D;

public class Iterator {
    private int j = 0;
    private int i = 0;
    private int r = 0;
    private int c = 0;
    private int[][] array;
    public Iterator(int[][] array)
    {
        this.array = array;
    }
    public boolean availableRow()
    {
        return (r<array.length);
    }
    //public boolean availableCol()
    //{
    //    return (c < array[?].length);
    //}
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
    public int getIndexRow()
    {
        return r;
    }
    public int[] nextRow()
    {
        if (availableRow())
        {r++;
            return array[r-1];}
        else throw new RuntimeException("IndexOfBoundException");
    }
}
