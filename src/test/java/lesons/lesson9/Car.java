package lesons.lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor(String color){
        System.out.println("Color car " + color );
        changeColor("red");

    }

    public void changeColor(String color){
        System.out.println("Color car is changed ");
        int price = 3000;
        this.color = color;
        price += 1000;
    }
}
