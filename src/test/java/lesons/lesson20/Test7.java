package lesons.lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
         StringBuilder sb1 = new StringBuilder("A");
         StringBuilder sb2 = new StringBuilder("b");
         StringBuilder sb3 = new StringBuilder("c");
         StringBuilder sb4 = new StringBuilder("d");

        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        list.add(sb4);
//        ArrayList<StringBuilder> list3 = list;
//        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list.clone();
//        System.out.println(list == list2);
//        System.out.println();
//        System.out.println(list == list3);

//        list.get(0).append("!!!");
//        list.set(0, new StringBuilder("SS"));
//        System.out.println(list.get(0));
//        System.out.println(list2.get(0));
//
//
//        Object [] array1 = list.toArray();
//        for(Object o : array1){
//            System.out.println(o);
//        }
//
//        System.out.println();
//
//        StringBuilder [] array2 = list.toArray(new StringBuilder[0]);
//        for(StringBuilder sb : array2){
//            System.out.println(sb + ",");
//        }

        StringBuilder [] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> builderList = Arrays.asList(array);
        System.out.println(builderList);

    }
}
