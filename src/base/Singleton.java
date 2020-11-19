package base;

public class Singleton {
    /**
     * Singleton class - singleton class is a class that can have only one object (an instance of the class) at a time
     *
     */

    private static Singleton single_instance = null;

    public String s;

    private Singleton(){
        s = "String is part of Singleton class";
    }

    public static Singleton getInstance(){
        if(single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }

}
