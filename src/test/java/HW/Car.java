package HW;

public class Car {
    String color;
    String engine;

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "red";
        car1.engine = "V8";

        car2.color = "blue";
        car2.engine = "V12";


        System.out.println(car1);
        System.out.println(car2);
    }
}
