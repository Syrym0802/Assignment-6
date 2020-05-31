package factory;

public abstract class Logistics {
    public void planDelivery(){
        Transport t = createTransport();
        System.out.println(t.deliver());
    }

    abstract Transport createTransport();

}
