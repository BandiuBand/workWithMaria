package lists;

import strings.*;

import java.util.ArrayList;

public class CheckTask {
    static String string = "AbcdeA  ashg adfsg if";
    static String string2 = "AbccbA";
    static String string3 = "AbcdcbA";
    static String string4 = "Абсд іфдж oooii";
    static ArrayList<String> list = new ArrayList<>();
    static {
        list.add(string2);
        list.add(string2);
        list.add(string3);
        list.add(string4);
        list.add(string);
        list.add(string2);
        list.add(string);
    }
    public static void start()
    {
        System.out.println("Most longer String from the list");
        System.out.println(list);
        System.out.println(MostLongerSt.start(list));
    }
}
