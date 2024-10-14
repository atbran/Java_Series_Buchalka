package constructorChallenge;

public class mainChallenge {
    public static void main(String[] args) {
        customer test1 = new customer();
        customer test2 = new customer("John Doe", 1000, "bob@bob.com");
        customer test3 = new customer("Jane Doe", "Jane@jane.com");
    }
}
