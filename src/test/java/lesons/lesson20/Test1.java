package lesons.lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Hello");
        Car c = new Car();
        list.add(c);
        Student st = new Student();
        list.add(st);
        list.add(new StringBuilder("ok"));

        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list4 = new ArrayList<>(list2);
        System.out.println(list2 == list4);
        list2.add("bye");
        List<StringBuilder> list3 = new ArrayList();
        list3.add(new StringBuilder("ok"));

    }
}


class Car{}
class  Student{}