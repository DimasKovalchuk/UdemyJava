package lesons.lesson19;

public class Test4 {
    public static void main(String[] args) {
        int[][] array = {{2, 5, 6}, {6, 7, 8, 5}, {3, 8, 9, 77}};


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + ",");
            }
        }

        System.out.println();

        for(int[]array2 : array){
            for (int a : array2 )
                System.out.print(a + ",");
        }
    }
}
