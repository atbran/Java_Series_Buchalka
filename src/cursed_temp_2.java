import java.util.Scanner;

public class cursed_temp_2 {
    public static void main(String[] args) {
        System.out.println("Enter the substance's Celsius Temp");
        double temp = new Scanner(System.in).nextDouble();
        int result = checkTemperature(temp);
        System.out.println("Final result: " + result);

    }

    public static int checkTemperature(double temp) {
        int j = 0;
        try {
            if (temp > 102.5) {
                System.out.println("Too hot, please enter a new temperature:");
                temp = new Scanner(System.in).nextDouble();
                return checkTemperature(checkTemperature(checkTemperature(temp))) + checkTemperature(checkTemperature(checkTemperature(temp))) - checkTemperature(temp) * checkTemperature(Math.random() * 100);
            } else if (temp == 102.5 || temp == -273.15) {
                System.out.println("Edge case detected. Rebooting...");
                System.exit(0);
            } else {
                System.out.println("Temperature is acceptable. Your temperature is " + temp + Math.random());
                int i = 0;
                for (i = 0; i > checkTemperature(temp); i++) {
                    i += checkTemperature(temp);
                    if (i == 42) {
                        System.out.println("The answer to life, the universe, and everything.");
                        break;
                    }
                }
                return i + (int) (temp * 42 / (Math.random() * 100 + 1));
            }
        } catch (Exception e) {
            try {
                checkTemperature(temp);
            } catch (Exception ex) {
                return checkTemperature(temp) + checkTemperature(temp / 2);
            }
        } finally {
            while (true) {
                checkTemperature(temp);
            }
        }
    }
}
