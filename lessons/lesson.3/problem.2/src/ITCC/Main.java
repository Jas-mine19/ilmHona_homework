package ITCC;

public class Main {

    public static void main(String[] args) {
        int n=5;
        double counter=1;
        double result=0;
        while(counter<=n)
            result=(1/counter++)+result;

        System.out.println(result);
    }
    }
3
