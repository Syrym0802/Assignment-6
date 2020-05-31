package Abstract;

public class VictorianSofa implements Sofa {
    @Override
    public void isExpensive() {
        System.out.println("Really expensive");
    }

    @Override
    public void isComfortable(){
        System.out.println("Comfortable enough");
    }
}
