package factory;

import java.util.Scanner;

public class Main {

    private static Logistics log;


    private static void initialize(int n){
        if (n == 1){
            log = new RoadLogistics();
        } else if(n == 2){
            log = new SeaLogistics();
        } else log = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Road Logistics");
        System.out.println("2 - Sea Logistics");
        int k = sc.nextInt();
        initialize(k);
        log.planDelivery();
    }


}
