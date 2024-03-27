package bank.model;

public class BankAccount {
    private long id;
    private String owner;
    private String bankName;
    private int branch;
    private double balance;

    //constructor
    public BankAccount(long id, String owner, String bankName, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    //no balance constructor
    public BankAccount(long id, String owner, String bankName, int branch) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
    }

    //no owner constructor
    public BankAccount(long id, String bankName, int branch, double balance) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    //getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branch=" + branch +
                ", balance=" + balance +
                '}';
    }

    public void display() {
        System.out.println("BankAccount{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branch=" + branch +
                ", balance=" + balance +
                '}');
    }

    public void display(String greeting){
        System.out.println("BankAccount{" +
                "id=" + id +
                ", greeting='" + greeting + '\'' +
                ", owner='" + owner + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branch=" + branch +
                ", balance=" + balance +
                '}');
    }

    public boolean deposit(double sum){
        balance = balance + sum;
        return true;
    }

    public boolean withdraw(double sum){
        if (sum <= balance) {
            balance = balance - sum;
            return true;
        }
            return false;
    }

} //end of class
