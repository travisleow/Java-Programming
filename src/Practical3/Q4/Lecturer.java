package Practical3.Q4;

/**
 *
 * @author travi
 */
public abstract class Lecturer {
    String name;
    int staffID;
    
    public Lecturer(String aName, int aStaffID) {
        name = aName;
        staffID = aStaffID;
    }
    
    public double calcMonthlyPay() {
        return 0;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
}
