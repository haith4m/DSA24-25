import java.util.*;
import java.util.LinkedList; // import the ArrayList clas
public class ListExperiments {
    public static void main(String[] args) {
        ArrayList<String> mylist1 = new ArrayList<>();
        demonstrateList(mylist1);
        LinkedList<String> mylist2 = new LinkedList<>();
        demonstrateList(mylist2);

    }


    public static void demonstrateList(List<String> list) {
        list.add("Apples");
        list.add("Oranges");
        list.add("Bananas");
        System.out.println(list);
        System.out.println("Hash code of index 0: " + System.identityHashCode(list.get(0)));

        list.add(1, "Pineapples");
        System.out.println( list);

        list.remove(2);
        System.out.println( list);
        System.out.println( list.size());
    }





}