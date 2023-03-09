package lesons.lesson18;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int array[] ={1,4,6,7,8,9,0,5,43};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        System.out.println("----------------");

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        int index = Arrays.binarySearch(array, 9);
        System.out.println(index);
    }
}
