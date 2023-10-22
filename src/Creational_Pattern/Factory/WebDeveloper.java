package Creational_Pattern.Factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Web Developer salary");
        return 60000;
    }
}
