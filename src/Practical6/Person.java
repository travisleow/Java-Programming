import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private int age;
    private double salary;

    public Person(String name, int i, double salary) {
        this.name = name;
        this.age = i;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

}