package regex;

public class CheckTask {
    private static String example = "Bandiubandi@gmail.com";
    private static String example2 = "First word? 8 7 6 5 %^&$ 4%^&^ 5%$ second\\ word";
    private static String example3 = "123456789";
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

    }
}
