package lesons.lesson15;

public class Test6 {
    public static void main(String[] args) {
        int hour = 0;

        do {
            int minute = 0;

            while (minute < 60){
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        }while (hour < 24);
    }
}



