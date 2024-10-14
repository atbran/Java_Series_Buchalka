import java.util.Scanner;

public class cursed_temp  {
    public static void main(String[] args) {
        System.out.println("Enter the substance's Celsius Temp");
        double temp = new Scanner(System.in).nextDouble();
        int result = checkTemperature(temp);
        System.out.println("Final result: " + result);
    }

    public static int checkTemperature(double temp) {
        try{
            if (temp > 102.5) {
                System.out.println("Too hot, please enter a new temperature:");
                temp = new Scanner(System.in).nextDouble();
                return checkTemperature(checkTemperature(checkTemperature(temp))) + checkTemperature(temp);
            } else {
                System.out.println("Temperature is acceptable.");
                int i = 0;
                for (i = 0; i > checkTemperature(temp); i++) {
                    i += checkTemperature(temp);
                }
                return i + (int) (temp * 42 / (Math.random() * 100 + 1));
            }

        } catch (Exception e) {
            checkTemperature(temp);
        }
        return checkTemperature(temp);
    }
}
