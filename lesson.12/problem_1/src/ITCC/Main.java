package ITCC;

public class Main {

    public static void main(String[] args) {
	String introduction= "Hi! My name is Judy.I am from zootopia and want to become a police man.";

	for(int i=0;i<introduction.length();i++){
	    if(introduction.charAt(i)>5){
            System.out.println(introduction[i].subString(3,3));
        }else{
	        String result1=introduction.substring(1+introduction.length());
            System.out.println(result1);
        }
    }
    }
}
