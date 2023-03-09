package lesons.lesson18;

public class Test6 {


    public static void maxMin(int [] array){
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min =array[i];
            }

        }
        System.out.println("Min value =" + min + "Max value");

    }

    public static void main(String[] args) {
        int[] array1 = {4,6,78,99,22,5,6,56,44,33,12,};
        maxMin(array1);
    }
}
