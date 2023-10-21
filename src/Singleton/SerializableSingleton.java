package Singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static SerializableSingleton serializableSingleton= null;

    private SerializableSingleton(){

    }

    public static SerializableSingleton getSerializableSingleton() {
        if (serializableSingleton==null){
            serializableSingleton= new SerializableSingleton();
        }
        return serializableSingleton;
    }


    protected Object readResolve(){
        return serializableSingleton;
    }
}
