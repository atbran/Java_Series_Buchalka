public class Java_course_Method_overload_challenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(12));
        System.out.println(convertToCentimeters(5,8));
    }

    public static double convertToCentimeters(int inches) {
        return (double) (inches * 2.54);
    }
    public static double convertToCentimeters(int feet, int inches ) {
        double foot_to_cm = feet * 30.48;
        double inches_to_cm = inches * 2.54;
        return foot_to_cm + inches_to_cm;
    }
}