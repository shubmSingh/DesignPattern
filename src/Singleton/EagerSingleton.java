package Singleton;

public class EagerSingleton {
    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}
