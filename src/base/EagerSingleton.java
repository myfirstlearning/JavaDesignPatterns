package base;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    public String s;

    private EagerSingleton(){
        s = "Eager Instance";
    }

    public static EagerSingleton getInstance(){
        return instance;
    }

}
