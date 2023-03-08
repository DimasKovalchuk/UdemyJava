package lesons.lesson16;

public class Test2 {
    public static void main(String[] args) {

        String s1 = new String("Hello Hello Hello");

        String s10 = s1.substring(5);
        System.out.println(s10);


        String s11 = s1.substring(4,9);
        System.out.println(s11);


        String s12 = s1.trim();
        System.out.println(s12);

        String s13 = s1.substring(3,15);
        System.out.println(s13);

        String s14 = s1.replace("H", "l");
        System.out.println(s14);

        String a1 = "Hello,";
        String a2 = "friend";
        System.out.println(a1.concat(a2));

    }
}
