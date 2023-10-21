package abstract_Design_Pattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
