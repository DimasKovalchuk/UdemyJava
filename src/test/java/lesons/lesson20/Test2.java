package lesons.lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("how");
        list.add("are");
        list.add("you");
        list.add(1, ",");

        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        list.set(1,",");
        for (String s : list){
            System.out.println(s + " ");
        }
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hi");
        list2.add("there");
        list.addAll(0,list2);

        System.out.println();

        for (String s : list){
            System.out.print(s + " ");
        }


    }
}
