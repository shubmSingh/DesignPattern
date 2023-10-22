package Creational_Pattern.abstract_Design_Pattern;


public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        return 60000;
    }

    public String name() {
        System.out.println("I am Web Developer");
        return "WEB DEVELOPER";
    }
}
