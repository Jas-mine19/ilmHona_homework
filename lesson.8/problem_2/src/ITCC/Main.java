package ITCC;

public class Main {

    public static void main(String[] args) {
        int a= max(1,3);
        System.out.println(a);
    }
    public static int max(int x, int y){
        int result;
        if(x>y){
            result=x;
        }else{
            result=y;
        }
        return result;
    }
    }

