package HW.HW7;

public class Employee {

    int id;
    int age;
    public String surname;
    private double salary;
    String department;

    public Employee(int id2, int age2, String surname2, double salary2, String department2){

          id = id2;
          age = age2;
          surname = surname2;
          salary = salary2;
          department = department2;
    }

    public Employee(int id2){
        id = id2;
    }

    Employee(String surname2){
        surname = surname2;
    }
   private Employee(double salary3){
        salary = salary3;
}
    double reviewSalary(){
        salary *=2;
        return salary;
    }

    public void getId() {
        System.out.println("ID = " + id);
    }

    public void getSurname() {
        System.out.println("SURNAME = " + surname);
    }

    private void getSalary() {
        System.out.println("SALARY = " + salary);
    }
}


class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, 32, "KOVALCHUK", 3500.0, "AQA");
        Employee employee2 = new Employee(2, 34, "KOVAL", 2500.0, "QA");


        employee1.reviewSalary();
//        System.out.println("New salary " + employee1.surname + "  " + employee1.salary);

        double newSalary = employee2.reviewSalary();
        System.out.println("New salary " + employee2.surname + " " + newSalary);


        Employee employee3 = new Employee(2);
        Employee employee4 = new Employee("Kovalvhuk");

        employee1.getSurname();
//        employee1.getSalary();
        employee1.getId();



    }


}