package arrays2D;

public class Simetr {
    public static boolean start(int[][] array) throws Exception {
        if (array.length!= array[0].length&&Trans.checkPoss(array))
            throw new Exception("Array incorrect");
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < (array.length-1); j++) {
                if (array[i][j]!=array[j][i])
                {
                    return false;
                }
            }
        }

        return true;
    }

    }


