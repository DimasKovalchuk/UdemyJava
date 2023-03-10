package lesons.lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String ("Hello,"));
        list.add(new String("how"));
        list.add(new String("are"));
        list.add(new String("you"));

        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println(list.indexOf(new String("Hello,")));
        System.out.println(list.indexOf("Hello,"));
        System.out.println(list.contains("you"));

        System.out.println(list.toString( ));


    }
}
