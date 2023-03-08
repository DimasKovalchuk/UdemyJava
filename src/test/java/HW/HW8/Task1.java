package HW.HW8;

public class Task1 {

    static double multiplication(double a,double b, double c){
        return a * b * c;
    }

    static void division( int a, int b){
        System.out.println("Ціле число = " + a / b + " Залишок = " + a % b );
    }
}


class TestTask1{
    public static void main(String[] args) {
        System.out.println(Task1.multiplication(10,29,30));
        Task1.division(9,2);
        System.out.println(Task1.multiplication(2.4,5.5,6.7));
        Task1.division(13,55);

    }
}
