package Practical3;

/**
 *
 * @author travi
 */
public class Person {
    String name;
    
    public Person() {
        
    }
    
    public Person(String aName) {
        name = aName;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public String getName() {
        return name;
    }
    
    public void introduce() {
        System.out.println("My name is " + name + ".");
    }
}
