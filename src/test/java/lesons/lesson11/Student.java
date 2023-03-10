package lesons.lesson11;

public class Student {
    public String name;
    public double course;
    public double grade;

   public Student(String name, double course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }


    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3,5.5);
        Student st2 = new Student("Dima", 1,5.9);
        swap(st1,st2);
        System.out.println(st1.name);
        System.out.println(st2.name);
    }
}
