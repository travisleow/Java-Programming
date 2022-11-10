package Practical3.Q6;

/**
 *
 * @author travi
 */
public class TestEmployee {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new CasualEmployee("John", 10.0, 30);
        employees[1] = new CasualEmployee("Mary", 5.0, 50);
        employees[2] = new Manager("Peter", 3000.0, 5000.0);
        displaySalary(employees);
    }
    
    public static void displaySalary(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Salary: " + employees[i].calcSalary());
            System.out.println("");
        }
    }
}
