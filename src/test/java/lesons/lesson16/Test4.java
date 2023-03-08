package lesons.lesson16;

public class Test4 {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Lol";
        s1.concat(s2).trim().replace("lol","Kok");
        System.out.println(s1);
    }
}
