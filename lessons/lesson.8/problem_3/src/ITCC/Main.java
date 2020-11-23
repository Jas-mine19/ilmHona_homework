package ITCC;

public class Main {

    public static void main(String[] args) {
        int a= sumOfSquares(1,3);
        System.out.println(a);
    }
    public static int sumOfSquares(int a, int b){
        int c=0;
        while(a<=b){
            c+= (Math.pow(a,2));
            a++;
        }
        return c;
    }
    }

