package Creational_Pattern.abstract_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(employee.name());
    }
}
