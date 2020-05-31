package Abstract;

public class ModernChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("Do not have legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Like sitting on wooden plank");
    }
}
