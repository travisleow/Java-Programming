package Practical3.Q6;

/**
 *
 * @author travi
 */
public class Employee {
    String name;
    double baseSalary;
    
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getBaseSalary() {
        return this.baseSalary;
    }
    
    public double calcSalary() {
        return 0.0;
    }
}
