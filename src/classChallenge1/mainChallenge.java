package classChallenge1;

public class mainChallenge {

    public static void main(String[] args) {
        bankAccount account1 = new bankAccount();
        account1.setAccountHolder("John Doe");
        account1.setBalance(100230.378);
        account1.setAccountNumber(123456789);
        account1.setAccountHolderEmail("johndoe@gmail.com");
        account1.setAccountHolderPhone("123-456-7890");
        account1.debugAccountDetails();
        account1.deposit(10_000_000);
        account1.setAccountHolder("Steve Jobs");
        account1.debugAccountDetails();
        account1.withdraw(10_000_000);
        account1.setAccountHolder("Rasheed Kumar");
        account1.debugAccountDetails();
        account1.withdraw(10_000_000);
    }
}
