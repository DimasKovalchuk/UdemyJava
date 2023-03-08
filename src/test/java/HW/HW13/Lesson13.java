package HW.HW13;

public class Lesson13 {
}


class Month{

    public static void dayQuantity(int month){
        switch (month) {
            case 2:
                System.out.println("28 days in this month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in this month");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in this month");
                break;
            default:
                System.out.println("This month don`t have");

        }
    }

    public static void main(String[] args) {
        Month.dayQuantity(0);
        dayQuantity(2);
        Month.dayQuantity(12);
        dayQuantity(7);
    }
}