package lesons.lesson18;

public class Test2 {
    public static void main(String[] args) {
        String[] array1;
        int[][] array2;

        array1 = new String[3];
        array2 = new int[3][];

        for (int i = 0; i < array1.length ; i++) {
            array1[i] = "Hello" + i;
            System.out.println(array1);
        }
    }
}
