package Builder;

public class Main{
    public static void main(String[] args) {
        HouseBuilder hb = new HouseBuilder();
        Application director = new Application();
        director.setBuilder(hb);
        director.constructSimpleHouse();
        House myPoorHouse = director.getHouse();
        System.out.println(myPoorHouse);
    }
}
