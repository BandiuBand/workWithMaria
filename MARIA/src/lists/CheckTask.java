package lists;

import java.util.ArrayList;

public class CheckTask {
    static String string = "AbcdeA  ashg adfsg if";
    static String string2 = "AbcdeA";
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
        System.out.println("_________________________________________________");
        System.out.print("Is contain word - ");
        System.out.println(list);
        System.out.println(IsContainWord.start(list,"AbcdeA"));
        System.out.println("_________________________________________________");
        System.out.print("Connect all Strings");
        System.out.println(list);
        System.out.println(ConnectAllStr.start(list));
        System.out.println("_________________________________________________");
        //System.out.print("Delete the copy of line");
        //System.out.println(list);
        //System.out.println(DeleteCopy.start(list));
        //System.out.println("_________________________________________________");
        //System.out.print("Sort by length");
        //System.out.println(list);
        //System.out.println(SortByLength.start(list));
        //System.out.println("_________________________________________________");
        System.out.println("Count of words in lines");
        System.out.println(list);
        System.out.println(CountWords.start(list));
        System.out.println("_________________________________________________");
        System.out.println("Change \"AbcdeA\" to \"Word\"");
        System.out.println(list);
        System.out.println(ReplaceWord.start(list,"AbcdeA","Word"));
        System.out.println("_________________________________________________");
        System.out.println("Reverse lines");
        System.out.println(list);
        System.out.println(ReverseLines.start(list));
        System.out.println("_________________________________________________");
        System.out.println("Delete palindrome lines");
        System.out.println(list);
        System.out.println(DeletePal.start(list));
        System.out.println("Create map");
        System.out.println(list);
        System.out.println(MapStAm.start(list));


    }
}
