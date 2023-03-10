package lesons.lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test8 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";
        ArrayList<String> list = new ArrayList<>();
        list.add(s3);
        list.add(s2);
        list.add(s1);
        list.add(s4);
        ArrayList<String> list2 = list;
        ArrayList<String> list3 = new ArrayList<>();
        list3.add(s3);
        list3.add(s2);
        list3.add(s1);
        list3.add(s4);
        System.out.println(list);
//        Collections.sort(list);
        System.out.println();
        System.out.println(list);

        System.out.println(list.equals(list2));
        System.out.println(list.equals(list3));

        Iterator<String> it = list3.iterator();
        while (it.hasNext()){
            it.next();
            it.remove();
        }



    }
}
