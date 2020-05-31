package singleton;

public class Main {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        Database foo1 = Database.getInstance();

        System.out.println(foo.s);
        System.out.println(foo1.s);

        foo.s = foo.s.toUpperCase();

        System.out.println(foo.s);
        System.out.println(foo1.s);
    }
}
