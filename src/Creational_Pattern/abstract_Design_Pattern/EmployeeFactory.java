package Creational_Pattern.abstract_Design_Pattern;

public class EmployeeFactory {
    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();

    }
}
