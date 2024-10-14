package classChallenge1;

public class bankAccount {

    private String accountHolder;
    private double balance;
    private int accountNumber;
    private String accountHolderEmail;
    private String accountHolderPhone;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderEmail() {
        return accountHolderEmail;
    }

    public void setAccountHolderEmail(String accountHolderEmail) {
        this.accountHolderEmail = accountHolderEmail;
    }

    public String getAccountHolderPhone() {
        return accountHolderPhone;
    }

    public void setAccountHolderPhone(String accountHolderPhone) {
        this.accountHolderPhone = accountHolderPhone;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposited: " + amount + " New Balance: " + this.balance);
    }

    public void withdraw(double amount){
        if(this.balance - amount < 0){
            System.out.println("Insufficient funds. Cannot withdraw " + amount + " Current Balance: " + this.balance);
            System.out.println("Broke Boi alert");
        } else {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount + " New Balance: " + this.balance);
        }
    }
    public void debugAccountDetails()
{
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Email: " + this.accountHolderEmail);
        System.out.println("Account Holder Phone: " + this.accountHolderPhone);
        System.out.println("Account Balance: " + this.balance + "\n");

    }
}
