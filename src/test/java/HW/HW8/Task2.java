package HW.HW8;

public class Task2 {
    public final static double PI = 3.14;

    public double ploshad(double radius){
        double p1 = PI * radius * radius;
        return  PI;
    }

    public static double dlina(double radius2){
        double d1 = 2 * PI * radius2;
        return d1;
    }

    public void info(double radius3){
        System.out.println("Радіус =" + radius3);
        System.out.println("Площа кола =" + ploshad(radius3));
        System.out.println("Довжина окружності =" + dlina(radius3));

    }
}

class TestTask2{
    public static void main(String[] args) {
        Task2 t = new Task2();
        t.ploshad(5);
        Task2.dlina(20);
        t.info(3);
    }

}