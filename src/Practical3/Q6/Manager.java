package Practical3.Q6;

/**
 *
 * @author travi
 */
public class Manager extends Employee{
    double profit = 0.0;
    
    public Manager(String name, double baseSalary, double profit) {
        super(name, baseSalary);
        this.profit = profit;
    }
    
    public double calcSalary() {
        return this.baseSalary + this.profit * 0.1;
    }
}
