package Singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        exampleSerialization();// Serializable used to break singleton pattern
        exampleReflection(); // Reflection API to break singleton Pattern
    }

    private static void exampleSerialization() throws IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton lazySingleton1 = (LazySingleton) objectInputStream.readObject();
        objectOutputStream.close();
        System.out.println("object 1 :" + lazySingleton.hashCode());
        System.out.println("object 2 :" + lazySingleton1.hashCode());

        //readResolve() used for solve above problem in SerializableSingleton class
        SerializableSingleton serializableSingleton = SerializableSingleton.getSerializableSingleton();
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("object1.obj"));
        objectOutputStream1.writeObject(serializableSingleton);
        objectOutputStream1.close();

        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("object1.obj"));
        SerializableSingleton serializableSingleton1 = (SerializableSingleton) objectInputStream1.readObject();
        objectOutputStream.close();
        System.out.println("SerializableSingleton 1 :" + serializableSingleton.hashCode());
        System.out.println("SerializableSingleton 2 :" + serializableSingleton1.hashCode());
    }

    private static void exampleReflection() throws Exception{
        Constructor[] constructors =LazySingleton.class.getDeclaredConstructors();

        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        LazySingleton lazySingleton =(LazySingleton)constructor.newInstance();
        LazySingleton lazySingleton1 = LazySingleton.getLazySingleton();
        System.out.println("Reflected HashCode :"+lazySingleton.hashCode());
        System.out.println("Singleton hashcode :"+lazySingleton1.hashCode());


    }
}
