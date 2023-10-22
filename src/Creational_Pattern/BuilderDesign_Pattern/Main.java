package Creational_Pattern.BuilderDesign_Pattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setUserId("123").setUserName("Shubham").
                setEmailId("shubahmmcmt@gmail.com").
                build();

        System.out.println(user);

    }
}
