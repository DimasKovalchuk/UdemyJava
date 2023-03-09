package lesons.lesson19;

public class Test7 {
    public static void main(String[] args) {
        int [] array1 = {3,77,9,10};
        int [] array2 = {3,5,7,1};

        for (int i = 0; i < array1.length && i < array2.length ; i++) {
            array1[i] = 1;
            array2[i] = 4;
        }

    }
}
