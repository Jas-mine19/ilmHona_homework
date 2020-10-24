package ITCC;

public class Main {

    public static void main(String[] args) {
        Box boxBlue= new Box();
        boxBlue.height=40;
        boxBlue.width=60;
        boxBlue.material="plastic";
        boxBlue.weight=100;
        Box woodenBox=new Box();
        woodenBox.height=20;
        woodenBox.width=20;
        woodenBox.material="tree";
        woodenBox.weight=30;
        System.out.println("Height of blue box:"+boxBlue.height);
        System.out.println("Height of wooden box:"+woodenBox.height);

    }
    static class Box{
        double height;
        double width;
        String material;
        double weight;

    }
}

