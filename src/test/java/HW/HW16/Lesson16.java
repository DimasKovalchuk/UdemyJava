package HW.HW16;

public class Lesson16 {

    public void email(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        int counter = 0;

        while(counter < s.length() -1){
            a = s.indexOf("@",c);
            b = s.indexOf(".",c);
            c = s.indexOf(";", c +  1);
            counter++;
            System.out.println(s.substring(a + 1,b));
        }
    }

    public static void main(String[] args) {
        Lesson16 lesson16 = new Lesson16();
        lesson16.email("ya@yahoo.com; on@mail.com; ona@gmail.com" );
    }

}
