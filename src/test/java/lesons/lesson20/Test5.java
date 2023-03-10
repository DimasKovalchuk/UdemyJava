package lesons.lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hello,"));
        list.add(new StringBuilder("how"));
        list.add(new StringBuilder("are"));
        list.add(new StringBuilder("you"));

        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }
        System.out.println(list.indexOf(new StringBuilder("Hello")));
    }
}
