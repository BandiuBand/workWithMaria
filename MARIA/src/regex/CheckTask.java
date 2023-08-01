package regex;

public class CheckTask {
    private static String example = "Bandiubandi@gmail.com";
    private static String example2 = "First word? 8 7 6 5 %^&$ 4%^&^ 5%$ second\\ word";
    public static void start()
    {
        System.out.println("Is email");
        System.out.println(IsEmail.start(example));
        System.out.println("Delete words");
        System.out.println(DeleteWords.start(example2));

    }
}
