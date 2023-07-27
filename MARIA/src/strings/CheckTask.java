package strings;

public class CheckTask {
    static String string = "Abcde";
    public static void start()
    {
        System.out.println("Reverse of \""+string+"\"");
        System.out.println(Reverse.start(string));
        System.out.println(Reverse.start2(string));
    }
}
