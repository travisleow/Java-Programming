package Practical3.Q6;

/**
 *
 * @author travi
 */
public abstract class Employee {
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
    
    public abstract double calcSalary();
}
