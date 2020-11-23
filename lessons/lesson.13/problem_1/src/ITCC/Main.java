package ITCC;

public class Main {

    public static void main(String[] args) {
        String one = "eeeqretoiuyt";
        for (int i = 0; i < one.length(); i++) {
            if (one.length() > 5) {
                if (i < 3 || i > one.length() - 4) {
                    System.out.println(one.charAt(i));
                }
            }
            else {
                System.out.println(one.charAt(0));
            }
        }
    }
    }

