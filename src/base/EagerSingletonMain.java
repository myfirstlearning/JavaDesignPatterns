package base;

public class EagerSingletonMain {


    public static void main(String[] args) {

        EagerSingleton eagerSingleton_1 = EagerSingleton.getInstance();

        EagerSingleton eagerSingleton_2 = EagerSingleton.getInstance();

        eagerSingleton_1.s = (eagerSingleton_1.s).toUpperCase();

        System.out.println("First call " + eagerSingleton_1.s);
        System.out.println("Second Call " + eagerSingleton_2.s);
    }

}
