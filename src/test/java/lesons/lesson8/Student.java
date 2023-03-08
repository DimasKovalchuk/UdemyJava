package lesons.lesson8;

public class Student {
    String name;
    int course;
   static int count;

    public Student(String name1, int course1){
        count++;
        name = name1;
        course = course1;
        System.out.println("Student " + count + " created");
    }

    public static void countStudents(){
        System.out.println("In university  = " + count + " Students");
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Dima", 1);
        Student st2 = new Student("Maman", 2);
        Student  st3 = new Student("Man", 3);
        Student.countStudents();

    }
}
