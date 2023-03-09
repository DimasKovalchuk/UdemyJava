package lesons.lesson19;

public class Test3 {
    public static void main(String[] args) {
        String [] students = {"Kovalchuk", "Stepanuk", "Bortnik"};
        String [] exams = {"Data structure", "Algorithms"};

        for(String s1 : students){
            for (String s2 : exams){
                System.out.println(s1 +" "+ s2);
            }
        }
    }
}
