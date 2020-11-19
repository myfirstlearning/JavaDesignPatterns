package base;

public class LazyDoubleLockSingleton {

    private static LazyDoubleLockSingleton instance = null;

    private LazyDoubleLockSingleton(){
        
    }
    
    public static LazyDoubleLockSingleton getInstance(){
        if(instance == null){
            synchronized (LazyDoubleLockSingleton.class){
                if(instance == null){
                    instance = new LazyDoubleLockSingleton();
                }
            }
        }
        return instance;
    }

}
