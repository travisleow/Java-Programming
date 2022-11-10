package Practical3.Q4;

import Practical3.Q4.Lecturer;

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
