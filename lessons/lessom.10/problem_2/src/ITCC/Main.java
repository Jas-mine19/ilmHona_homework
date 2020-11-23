package ITCC;

public class Main {

    public static void main(String[] args) {
        Apple redApple=new Apple();
        redApple.kind="Вильямс Прайд";
        redApple.color="red";
        redApple.sour= false;
        Apple greenApple=new Apple();
        greenApple.kind="Антоновка";
        greenApple.color="green";
        greenApple.sour= true;
        System.out.println("The red apple is so sour,isn't it??  "+redApple.sour);
        System.out.println("I think the green apple is sour.  "+ greenApple.sour);
    }
    static class Apple{
        String kind;
        String color;
        boolean sour;
    }
}

