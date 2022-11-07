package Practical3;

/**
 *
 * @author travi
 */
public class Lecturer {
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
