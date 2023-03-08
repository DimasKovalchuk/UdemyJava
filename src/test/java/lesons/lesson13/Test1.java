package lesons.lesson13;

public class Test1 {
}




class Student{

   int grade;
    
    Student (int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
        if(st1.grade == 2){
            System.out.println("Bad student");
        } else if (st1.grade == 3) {
            System.out.println("Not bad student");
        } else if (st1.grade == 4) {
            System.out.println("Good student");
        } else if (st1.grade == 5) {
            System.out.println("Very good student");
        } else{
            System.out.println("Null-error");
        }


        switch (st1.grade){
            case 2:
                System.out.println("Bad student");
                break;
            case 3:
                System.out.println("Not bad student");
                break;
            case 4:
                System.out.println("Good student");
                break;
            case 5:
                System.out.println("Very good student");
                break;
            default:
                System.out.println("Null-error");
        }

    }
}