package HW.HW11;

public class Lesson11 {
}
class Car {

    String color;
    String engine;
    int doorCount;


    public Car(String color, String engine, int doorCount){
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;

    }
}

class CarTest{
    void changeDoorCount(Car c, int doorCount){
        c.doorCount = doorCount;
    }

    void changeColor(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red","V4",2);
        Car car2 = new Car("yellow","V12", 4);
        ct.changeColor(car1, car2);
        ct.changeDoorCount(car1,5);
        System.out.println();
    }
}