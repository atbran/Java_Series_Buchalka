import java.util.Scanner;

public class UofM_practice_score_checker {

    public static void main(String[] args) {
    grade_method();


    }

    public static void grade_method(){
        System.out.println("What is your grade as an INT?");
        int Grade_input = new Scanner(System.in).nextInt();

        if(Grade_input >= 90){
            System.out.println("Your grade is A");
        }
        else if(Grade_input >= 80){
            System.out.println("Your grade is B");
        }
        else if(Grade_input >= 70){
            System.out.println("Your grade is C");
        }
        else if(Grade_input >= 60){
            System.out.println("Your grade is D");
        }
        else if(Grade_input >= 50){
            System.out.println("Your grade is F");
        }
        else{
            System.out.println("Invalid grade");
        }
    }
}
