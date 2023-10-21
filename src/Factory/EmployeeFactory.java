package Factory;

public class EmployeeFactory {
    public static Employee getEmployee(String empType){
        if(empType.equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        } else if (empType.equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        }else {
            return null;
        }
    }
}
