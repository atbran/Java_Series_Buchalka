import java.util.Scanner;
public class loan_auth_UofM_practice {


    public static void main(String[] args) {

        approved();
    }

    public static void approved(){
        System.out.println("What is your current salary in $? ");
        int salary = new Scanner(System.in).nextInt();
        System.out.println("How many months have you been employed? ");
        int months_employed = new Scanner(System.in).nextInt();

        if(salary >= 50_000 && months_employed >= 24) {
            System.out.println("You have been approved");
        }
        else{
            System.out.println("You have not been approved");
        }


    }
}
