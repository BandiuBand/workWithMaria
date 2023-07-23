import arrays.*;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
        int n = 15;
        int[] array = new int[n];
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= n; i++) {
            array[i-1]=i;
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        System.out.println("Sum of elements");
        System.out.println(SumOfElements.start(array));
        System.out.println("Amount even");
        System.out.println(AmountEven.start(array));
        System.out.println("Amount numbers can div to 3");
        System.out.println(AmountNumbOfDivTo3.start(array));
        System.out.println("Average");
        System.out.println(Average.start(array));
        System.out.println("Max");
        System.out.println(MAX.start(array));
        System.out.println("Min");
        System.out.println(MIN.start(array));
        System.out.println("Reverse");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(Reverse.start(array)));

    }
}