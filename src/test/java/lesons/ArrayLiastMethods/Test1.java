package lesons.ArrayLiastMethods;

import io.netty.resolver.AbstractAddressResolver;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1 =" + al1);
//        ArrayList<String> al2 = new ArrayList<>();
//        al2.add("one");
//        al2.add("two");
//        al2.add("three");
//
////        al1.removeAll(al2);
////        al1.retainAll(al2);
//        boolean result = al1.contains(al2);
//
//        System.out.println("al1 =" + al1);
//        System.out.println("al1 = " + result);

//        List<String> sublist = al1.subList(0, 4);
//
//        System.out.println("sublist = " + sublist);
//        sublist.add("ten");
//        System.out.println("al1 = " + al1);
//
//        System.out.println("sublist = " + sublist);

        Object [] array = al1.toArray();
        String [] array2 = al1.toArray(new String[0]);
        for(String s : array2){
            System.out.println(s);
        }

        List<String> stringList = List.of("one","two","three");
        System.out.println("stringList =" + stringList);
        List<String> stringList1 = List.copyOf(al1);
        System.out.println("stringList =" + stringList1 );




    }
}
