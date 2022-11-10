package Practical3.Q6;

/**
 *
 * @author travi
 */
public class CasualEmployee extends Employee{
    double hourlyRate;
    int hoursWorked;
    
    public CasualEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public double calcSalary() {
        return this.hourlyRate * this.hoursWorked;
    }
}
