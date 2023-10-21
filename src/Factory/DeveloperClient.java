package Factory;

public class DeveloperClient {
    public static void main(String[] args) {
        //1-Focus on creating object for Interface rather than implementation
        //2-Loose coupling, most robust code
        Employee employee = EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee1.salary());


    }
}
