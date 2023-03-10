package lesons.lesson22;

public class Test1 {

    public void abc(String s){
        System.out.println(s);
    }

    public void abc(boolean b){
        System.out.println(b);
    }

    private StringBuilder abc(StringBuilder sb){
        System.out.println(sb);
        return new StringBuilder("bye");
    }
}
