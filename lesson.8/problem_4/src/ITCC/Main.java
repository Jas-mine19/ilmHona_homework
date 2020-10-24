package ITCC;

public class Main {

    public static void main(String[] args) {
            int myArray =maxInArray(new int[]{5, 2, 3});
            System.out.println(myArray);

        }
        public static int maxInArray(int[] array){
            int max=array[0];
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i]);
            }
            return max;
        }
    }

