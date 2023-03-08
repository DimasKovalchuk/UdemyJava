package lesons.lesson17;

public class Test1 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(3));
        System.out.println(sb2.indexOf("o"));
        String s = sb2.substring(5);
        System.out.println(s);

        sb2.append(22);
        System.out.println(sb2);
        System.out.println(sb2.insert(4,55));

        StringBuilder sb10 = new StringBuilder("Hello world");
        sb10.delete(0,5);
        System.out.println(sb10);
        sb10.deleteCharAt(2);
        System.out.println(sb10);

        sb10.reverse();
        System.out.println(sb10);

        StringBuilder sb11 = new StringBuilder("Hi there");
        System.out.println(sb11.replace(2,6,"there"));

        System.out.println(sb11.capacity());
    }
}
