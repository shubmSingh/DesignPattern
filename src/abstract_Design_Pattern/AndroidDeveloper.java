package abstract_Design_Pattern;


public class AndroidDeveloper implements Employee {
    public int salary() {
        return 5000;
    }

    public String name() {
        System.out.println("I am Android Developer");
        return "ANDROID DEVELOPER";
    }
}
