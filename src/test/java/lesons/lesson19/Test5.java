package lesons.lesson19;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        for (int i = 0; i < array.length ; i++) {
            array[i] = 3;
        }


        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i] + " ");
        }


        int[] array2 = {0, 6, 4, 1};
        for (int a : array2){
            a = 3;
        }



    }
}
