package lesons.lesson14;

public class Lesson14Loops {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
        }
    }
}

class Test1{
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }
}


class Test2{
    public static void main(String[] args) {
        for (int i = 2; i < 10; i=+2) {
            System.out.println(i);
        }
    }
}


class Test3{

    public static void main(String[] args) {
        int a = 15;
        if ( a > 10){
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(i);
            }
        }
    }

}


class Test4{
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 7){
                break;
            }
            if(i % 55 == 0 ){
                continue;
            }

            System.out.println(i);
        }
    }
}


class Test5{
    
    public void time(){
       OUTER: for (int hour = 0; hour <=23 ; hour++) {
            System.out.println("Start Outer loop");
            for (int minute = 0; minute <=59 ; minute++) {
                System.out.println(hour + " : " + minute);
                if(minute == 30){break  OUTER;}
            }
            System.out.println("Finish Outer loop");
        }
    }
    
    public static void main(String[] args) {
        Test5 timer = new Test5();
        timer.time();
    }
}