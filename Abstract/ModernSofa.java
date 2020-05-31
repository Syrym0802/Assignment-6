package Abstract;

public class ModernSofa implements Sofa {
    @Override
    public void isExpensive() {
        System.out.println("Not expensive");
    }

    @Override
    public void isComfortable() {
        System.out.println("Comfortable");
    }
}
