package Creational_Pattern.Factory;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Android Developer Salary");
        return 5000;
    }
}
