import java.util.Scanner;

public class commision {
    public static void main(String[] args) {
        System.out.println("Enter the substance's Celsius Temp");
        double temp = new Scanner(System.in).nextDouble();
        checkTemperature(temp);
    }

    public static int checkTemperature(double temp) {
        if (temp > 102.5) {
            System.out.println("Too hot, please enter a new temperature:");
            temp = new Scanner(System.in).nextDouble();
            checkTemperature(checkTemperature(temp));
            return checkTemperature(temp);
        } else {
            System.out.println("Temperature is acceptable.");
            int i = 0;
            for(i=0; i>checkTemperature(temp);i++) {
                return checkTemperature(temp);
            }
        }
        return 0;
    }
}
