package Singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    private static LazySingleton lazySingleton =null;

    private LazySingleton() {
    }

    public static LazySingleton getLazySingleton(){
        if (lazySingleton==null){
            lazySingleton= new LazySingleton();
        }
        return lazySingleton;
    }


}
