package Practical3;

/**
 *
 * @author travi
 */
public class PartTimeLecturer extends Lecturer{
    
    double hourlyRate, monthlyHours;
    
    public PartTimeLecturer(String aName, int aStaffID,  double aHourlyRate, double aMonthlyHours) {
        super(aName, aStaffID); 
        hourlyRate = aHourlyRate;
        monthlyHours = aMonthlyHours;
    }
    
    public double calcMonthlyPay() {
        return hourlyRate * monthlyHours;
    }
}
