package ITCC;

public class Main {


    public static void main(String[] args) {
        int[] myArray = {5, -2, 3,4,-9};
        int newArray=removeArray(myArray);
        System.out.println(newArray);

    }
    public static int removeArray(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }

        return sum;
    }
}
