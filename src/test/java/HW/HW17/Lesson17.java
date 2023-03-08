package HW.HW17;

public class Lesson17 {

    public static boolean checkText(StringBuilder sb1, StringBuilder sb2){
        boolean result = true;
        if(sb1.length() == sb2.length()){
            for (int i = 0; i < sb1.length() ; i++) {
                if (sb1.charAt(i) != sb2.charAt(i)){
                  result = false;
                  break;
                }
            }
        }else {
             result = false;
        }
        return result;
    }
}

class Lesson17Test{
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hi there");
        StringBuilder sb2 = new StringBuilder("H there");
         boolean a = Lesson17.checkText(sb1,sb2);

        System.out.println(a);
        System.out.println(Lesson17.checkText(sb1,sb2));
    }
}