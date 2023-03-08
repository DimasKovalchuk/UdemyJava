package lesons.lesson16;

public class Car {

    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

 public Car abc(String cwet){
     Car car10 = new Car(cwet,"V6");
     return car10;
 }

    public static void main(String[] args) {
        Car car1 = new Car("red", "V6");
        Car car2 = car1.abc("black");
        System.out.println(car1.color);
    }
}
