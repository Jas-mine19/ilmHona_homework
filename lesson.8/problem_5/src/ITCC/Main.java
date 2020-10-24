package ITCC;

public class Main {


        public static void main(String[] args) {
            int[] myArray = {5, -2, 3,4,-9};
            int[] newArray=removeArray(myArray);
            for(int b=0;b<newArray.length;b++){
                System.out.println(newArray[b]);
            }




        }
        public static int[] removeArray(int[] array){

            int counter=0;
            for (int i = 0; i < array.length; i++) {
                if(array[i]>=0){
                    counter++;
                }

            }
            int[] array1= new int[array.length];
            int j=0;
            for(int i=0; i<array.length;i++){
                if(array[i]>0){
                    array1[j]=array[i];
                    j++;
                }
            }
            return array1;
        }
    }

