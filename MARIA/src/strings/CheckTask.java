package strings;

public class CheckTask {
    static String string = "AbcdeA  a a if";
    static String string2 = "AbccbA";
    static String string3 = "AbcdcbA";
    public static void start()
    {
        System.out.println("Reverse of \""+string+"\"");
        System.out.println(Reverse.start(string));
        System.out.println(Reverse.start2(string));
        System.out.println("Word width max length");
        System.out.println(MostLongerWord.start(string));
        System.out.println("Change symbol");
        System.out.println(ChangeSymb.start(string,'A','B'));
        System.out.println("Check is polindrom " + "\"" + string + "\"");
        System.out.println(ChPolindr.start(string));
        System.out.println("Check is polindrom " + "\"" + string2 + "\"");
        System.out.println(ChPolindr.start(string2));
        System.out.println("Check is polindrom " + "\"" + string3 + "\"");
        System.out.println(ChPolindr.start(string3));
    }
}
