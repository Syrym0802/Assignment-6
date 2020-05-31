package Abstract;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Have 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on the throne");
    }
}
