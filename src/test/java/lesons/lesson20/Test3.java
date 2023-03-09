package lesons.lesson20;

import java.util.AbstractList;
import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder(",");
        StringBuilder sb3 = new StringBuilder("how");
        StringBuilder sb4 = new StringBuilder("are");
        StringBuilder sb5 = new StringBuilder("you");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        list.add(sb4);
        list.add(sb5);
        for (int i = 0; i < list.size() ; i++) {
            list.get(i).append("'");
        }
        for (StringBuilder sb : list){
            System.out.println(sb + " ");
        }

    }
}
