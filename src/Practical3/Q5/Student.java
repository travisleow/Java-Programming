package Practical3.Q5;

/**
 *
 * @author travi
 */
public class Student extends Person{
    char stdYear;
    
    public Student(String aName, char aStdYear) {
        super(aName);
        stdYear = aStdYear;
    }
    
    public void introduce() {
        super.introduce();
        System.out.println("I am a year " + stdYear + " student.");
    }
}
