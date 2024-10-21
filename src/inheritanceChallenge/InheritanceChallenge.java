package inheritanceChallenge;

public class InheritanceChallenge {
    public static void main(String[] args) {
        Employee Jarome = new Employee(123456789, "01/01/2000");
        SalaryEmployee Kitty = new SalaryEmployee(987654321, "01/01/2000", 100000.00, false);
        HourlyEmployee Bob = new HourlyEmployee(123456789, "01/01/2000", 20.00, 40);
        System.out.println(Bob.getHoursWorked());
        System.out.println(Bob.getHourlyRate());
        System.out.println(Bob.collectPay());
        System.out.println(Kitty.getSalary());
        System.out.println(Kitty.isRetired());
        System.out.println(Jarome.getEmployeeID());
        System.out.println(Jarome.getHireDate());
        System.out.println(Jarome.getBirthDate());
        Jarome.setBirthDate("09/01/1923");
        System.out.println(Jarome.getBirthDate());

    }

}
