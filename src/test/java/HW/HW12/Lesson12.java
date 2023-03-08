package HW.HW12;

import lesons.lesson11.Student;

public class Lesson12 {
}

class StudentTest{

    public static void methodEqualsStudent(Student st1, Student st2 ){
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("Same students");
        }else {
            System.out.println("Don`t same students");
        }
    }


    public static void methodEqualsStudentName(Student st1, Student st2){
        if(st1.name.equals(st2.name)){
            if(st1.course == st2.course){
                if(st1.grade == st2.grade){
                    System.out.println("Names, course and grade same");
                }else {
                    System.out.println("Name and course same but different grade");
                }
            } else {
                System.out.println("Students name same but different course");
            }
        } else{
            System.out.println("Students name is different");
        }
    }


    public static void main(String[] args) {
        Student student1 = new Student("Dima", 5, 6.7 );
        Student student2 = new Student("Dima", 5,7.7);
        methodEqualsStudent(student1,student2);
        methodEqualsStudentName(student1,student2);
    }
}