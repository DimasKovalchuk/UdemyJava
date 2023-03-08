package HW;

public class Student {

    int studentId;
    String name;
    String surname;
    int course;
    double mathAvrgGrade;
    double economicsAvrgGrade;
    double foreignLanguageAvrgGrade;

    Student(int studentId1, String name1, String surname1, int course1, double mathAvrgGrade1, double economicsAvrgGrade1, double foreignLanguageAvrgGrade1) {
        studentId = studentId1;
        name = name1;
        surname = surname1;
        course = course1;
        mathAvrgGrade = mathAvrgGrade1;
        economicsAvrgGrade = economicsAvrgGrade1;
        foreignLanguageAvrgGrade = economicsAvrgGrade1;
    }

    Student(int studentId2, String name2, String surname2, int course2) {
        this(studentId2, name2, surname2, course2, 0, 0, 0);
    }

    Student(){

    }

}

class StudentTest{

    double studentAvrgGrade(Student st){
        double studentAvrgGrade = (st.economicsAvrgGrade + st.mathAvrgGrade + st.foreignLanguageAvrgGrade) / 3;
        System.out.println("Avrg Grade " + st.name + st.course + " :" + studentAvrgGrade);
        return studentAvrgGrade;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentId = 3;
        student1.course = 1;
        student1.name = "Zina";
        student1.surname = "Zulinchuck";
        student1.mathAvrgGrade = 4.5;
        student1.economicsAvrgGrade = 7.9;
        student1.foreignLanguageAvrgGrade = 5.0;

        Student student2 = new Student(54,"Vova","Koval", 4,
                5.5, 7.5,
                5.0);


        Student student3 = new Student(32, "Kolja", "Lopanjuk", 4);




        System.out.println("Середня оцінка студента " + student1.studentId + " " + student1.surname + " ="
                +(student1.mathAvrgGrade + student1.economicsAvrgGrade + student1.foreignLanguageAvrgGrade) /3);

        StudentTest studentTest = new StudentTest();

        studentTest.studentAvrgGrade(student1);

        System.out.println();


    }
}