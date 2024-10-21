package inheritanceChallenge;

public class Employee extends worker {
    long employeeID;
    String hireDate;


    public Employee(long employeeID, String hireDate) {
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }


    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}

class SalaryEmployee extends Employee {
    double salary;
    boolean isRetired;

    public SalaryEmployee(long employeeID, String hireDate, double salary, boolean isRetired) {
        super(employeeID, hireDate);
        this.salary = salary;
        this.isRetired = isRetired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public boolean Retire(){
        return isRetired = true;
    }
}
class HourlyEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    public HourlyEmployee(long employeeID, String hireDate, double hourlyRate, double hoursWorked) {
        super(employeeID, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double collectPay(){
        return hourlyRate * hoursWorked;
    }
}