package bank;

import bank.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(100, "Peter", "Bank #1", 101, 100);

        System.out.println(account1.getBalance());
        System.out.println(account1.getOwner());

        account1.display();

        System.out.println();
        account1.deposit(500);
        System.out.println(account1.getBalance());
        account1.display();

        account1.deposit(1000);
        account1.display();

        account1.withdraw(2000);
        account1.display();

        account1.withdraw(1500);
        account1.display();

        BankAccount account2 = new BankAccount(101, "Bill", "Bank #1", 101);
        System.out.println("~~~~~");
        account2.display();

        BankAccount account3 = new BankAccount(101, "Bank #1", 101, 1000);
        System.out.println("~~~~~");
        account3.display();

        System.out.println("~~~~~");
        account3.setOwner("Smith");
        account3.display("mr");







    }

}
