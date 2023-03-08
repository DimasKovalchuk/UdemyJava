package HW;

public class SumOperationOverload {

    int sum(){
        int result = 0;
        System.out.println("Sum = " + result);
        return result;
    }

    int sum ( int a){
        int result1 = a;
        System.out.println("Sum = " + result1);
        return result1;
    }

    int sum( int b, int c){
        int result2 = b + c;
        System.out.println("Sum = " + result2);
        return result2;
    }

    int sum (int d, int e, int f){
        int result3 = d + e + f;
        System.out.println("Sum = " + result3);
        return result3;
    }

    int sum ( int g, int h, int k, int l ){
        int result4 = g + h + k + l;
        System.out.println("Sum = " + result4);
        return  result4;

    }
}


class SumTest{
    public static void main(String[] args) {
        SumOperationOverload sumCol = new SumOperationOverload();
        sumCol.sum();
        sumCol.sum(2);
        sumCol.sum(2,10);
        sumCol.sum(44,41,999);
        sumCol.sum(33,889,754,483);



    }
}
