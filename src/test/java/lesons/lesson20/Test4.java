package lesons.lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("how"));
        list.add(new StringBuilder("are"));
        list.add(new StringBuilder("you"));
        list.add(1,new StringBuilder(","));


        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Hi"));
        list2.add(new StringBuilder("there"));
        list.addAll(0,list2);


        list.addAll(list2);
        for (StringBuilder sb : list){
            System.out.print(sb +" ");
        }
        System.out.println();
        list2.get(0).append("!");

        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }


    }
}
