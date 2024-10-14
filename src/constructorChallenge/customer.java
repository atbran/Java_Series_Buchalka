package constructorChallenge;

public class customer {

    String name;
    double creditLimit;
    String email;

    public customer(){
        this("Default Name", 0.0, "Default Email");
        System.out.println("Default constructor called");
        this.debugCustomerDetails();
    }

    public customer(String name,double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        this.debugCustomerDetails();
    }

    public customer(String name, String email){
        this.name = name;
        this.email = email;
        this.creditLimit = 0.0;
        System.out.println("Err, no credit limit provided. Setting to 0.0");
        this.debugCustomerDetails();
    }

    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }

    public String getEmail(){
        return email;
    }

    public void debugCustomerDetails(){
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer Credit Limit: " + this.creditLimit);
        System.out.println("Customer Email: " + this.email + "\n");
    }

}


