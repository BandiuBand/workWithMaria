package regex;

public class CheckTask {
    private static String example = "Bandiubandi@gmail.com";
    private static String example2 = "First word? 8 7 6 5 %^&$ 4%^&^ 5%$ second\\ word";
    private static String example3 = "123456789";
    private static String example4 = "A";
    private static String example5 = "А";
    private static String example6 = "fIrst word? 8 7 6 5 %^&$ 4%^&^ 5%$ second\\ word";
    private static String example7 = "fIrst word? 8 12-05-2023 7 6 5 %^&$ 2023-07-22 4%^&^ 5%$ second\\ word";

    private static String example8 = "AF8";
    private static String example9 = "LF8";

    private static String example10 = "fIrst wo<a href=\"https://www.example.com\">Посилання на приклад</a>rd? 8 12-05-2023 7 6 5 %^&$<a href=\"https://www.example.com\">Посилання на приклад</a> 2023-07-22 <sdjfvbj>4%^&^ 5%$ second\\ word";
    public static void start()
    {
        System.out.println("Is email");
        System.out.println(example);
        System.out.println(IsEmail.start(example));
        System.out.println("Delete words");
        System.out.println(example2);
        System.out.println(DeleteWords.start(example2));
        System.out.println("Is number");
        System.out.println(example2);
        System.out.println(IsNumber.start(example2));
        System.out.println(example3);
        System.out.println(IsNumber.start(example3));
        System.out.println("Delete numbers");
        System.out.println(example2);
        System.out.println(DeleteNumbers.start(example2));
        System.out.println(example3);
        System.out.println(DeleteNumbers.start(example3));
        System.out.println("Is start from capital letter");
        System.out.println(example2);
        System.out.println(IsStartCapital.start(example2));
        System.out.println("Is start from capital letter");
        System.out.println(example3);
        System.out.println(IsStartCapital.start(example3));
        System.out.println("Is start from capital letter");
        System.out.println(example4);
        System.out.println(IsStartCapital.start(example4));
        System.out.println("Is start from capital letter");
        System.out.println(example5);
        System.out.println(IsStartCapital.start(example5));
        System.out.println("Is start from capital letter");
        System.out.println(example6);
        System.out.println(IsStartCapital.start(example6));
        System.out.println("Delete data format dd-mm-yyyy");
        System.out.println(example7);
        System.out.println(DeleteData.start(example7));
        System.out.println("Is Hexadecimal");
        System.out.println(example8);
        System.out.println(IsHexadecimal.start(example8));
        //System.out.println(example3);
        System.out.println("Is Hexadecimal");
        System.out.println(example9);
        System.out.println(IsHexadecimal.start(example9));
        System.out.println("Is oly letter or number");
        System.out.println(example9);
        System.out.println(IsOnlLetNumb.start(example9));
        System.out.println("Is oly letter or number");
        System.out.println(example6);
        System.out.println(IsOnlLetNumb.start(example6));
        System.out.println("Change vowels to *");
        System.out.println(example6);
        System.out.println(ChangeVavesToAst.start(example6));
        System.out.println("Extract ref");
        System.out.println(example10);
        System.out.println(ExtractRef.start(example10));


    }
}
