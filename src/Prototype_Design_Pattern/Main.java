package Prototype_Design_Pattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Creating object using prototype design pattern");

        NetworkConnection networkConnection= new NetworkConnection();
        networkConnection.setIp("192.168.0.198");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);

        //We want new object of network connection
        NetworkConnection networkConnection1=null;
        networkConnection1= (NetworkConnection) networkConnection.clone();
        System.out.println(networkConnection1);
    }
}
