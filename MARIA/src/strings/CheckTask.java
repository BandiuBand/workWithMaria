package strings;

public class CheckTask {
    static String string = "AbcdeA  a a if";
    public static void start()
    {
        System.out.println("Reverse of \""+string+"\"");
        System.out.println(Reverse.start(string));
        System.out.println(Reverse.start2(string));
        System.out.println("Word width max length");
        System.out.println(MostLongerWord.start(string));
        System.out.println("Change symbol");
        System.out.println(ChangeSymb.start(string,'A','B'));
    }
}
