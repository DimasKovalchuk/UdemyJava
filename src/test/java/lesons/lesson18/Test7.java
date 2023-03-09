package lesons.lesson18;

public class Test7 {

    public static void main(String[] args) {
        char [] array = new char[]{'h','e','l','l','o'};
        String s = new String(array);
        System.out.println(array);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello world");
        sb.append(array, 2, 3);
        System.out.println(sb);
    }
}
