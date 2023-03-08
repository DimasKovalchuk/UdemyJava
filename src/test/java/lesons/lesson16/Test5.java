package lesons.lesson16;

public class Test5 {

    public static void main(String[] args) {
       String s1 = new String("ok");
       String s2 = new String("ok");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        String n1 = "Hello";
        String n2 = " Hello".trim();
        System.out.println(n1 == n2);

        String n3 = "Bye";
        System.out.println(n3.isBlank());

        String n4 = "  ";
        System.out.println(n4.isBlank());

        String n5 = "   hello";
        String n6 = n5.strip();
        System.out.println(n6);

        String r1 = "   hello";
        String r2 = r1.stripLeading();
        System.out.println(r2);

        String r3 = "hello   ";
        System.out.println(r3.stripTrailing());

    }
}
