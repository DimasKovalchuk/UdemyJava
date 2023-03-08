package lesons.lesson16;

public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("Hello");

        int a = s1.length();
        System.out.println(a );

        char a1 = s1.charAt(3);
        System.out.println(a1);

        int a3 = s1.indexOf("l");
        System.out.println(a3);

        int a4 = s1.indexOf("ll");
        System.out.println(a4);

        boolean a5 = s1.startsWith("He");
        System.out.println(a5);

        boolean a6 = s1.endsWith("lo");
        System.out.println(a6);

    }

}
