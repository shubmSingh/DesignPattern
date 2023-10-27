package Structural_Pattern.Proxy;

public class ATM implements Account {//This is the Proxy of bank account

    @Override
    public void withdraw() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw();

    }

    @Override
    public void getAccountNumber() {

    }
}
