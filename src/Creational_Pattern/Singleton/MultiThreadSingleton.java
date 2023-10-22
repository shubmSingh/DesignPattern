package Creational_Pattern.Singleton;

public class MultiThreadSingleton {
    private static MultiThreadSingleton multiThreadSingleton=null;

    private MultiThreadSingleton(){

    }

    public static MultiThreadSingleton getInstance(){
        if (multiThreadSingleton==null){
            synchronized (MultiThreadSingleton.class){
                if (multiThreadSingleton==null){
                    multiThreadSingleton = new MultiThreadSingleton();
                }
            }
        }
        return multiThreadSingleton;
    }
}
