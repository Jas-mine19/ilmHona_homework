package ITCC;

public class Main {

    public static void main(String[] args) {
        int n=436;
        double sum=0;

        while(n>0 ) {
            sum+=n%10;
            n/=100;


        }
        System.out.println(sum);

    }
    }

