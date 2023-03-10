package HW.HW20;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson20 {

    public ArrayList<String> abc(String...s){
        ArrayList<String> al = new ArrayList<>();
        for(String s1 : s) {
            if (!al.contains(s1)) {
                al.add(s1);
            }
        }
        Collections.sort(al);
        System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
        Lesson20 l20 = new Lesson20();
        l20.abc("hello", "hello", "ok", "how", "are", "you");

    }
}
