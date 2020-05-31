package Abstract;

import java.util.Scanner;

public class Main {
    private static FurnitureFactory ff;
    private static Chair ch;
    private static Sofa sf;
    public static void implement(int n){
        if (n == 1) ff = new VictorianFurnitureFactory();
        else if(n == 2) ff = new ModernFurnitureFactory();
        else ff = null;
    }

    public static void implement2(){
        ch = ff.createChair();
        sf = ff.createSofa();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Victorian Furniture");
        System.out.println("2 - Modern furniture");
        implement(sc.nextInt());
        implement2();

        ch.hasLegs();
        sf.isComfortable();

    }
}
