package HW.HW18;
class Lesson18 {


    public static int[] sort(int[] array){
        int a;
        for (int i = 0; i < array.length ; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if(i != index) {
                a= array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {3,5,3,2,155,88,90,88,56};
        sort(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
