package Practical3;

/**
 *
 * @author travi
 */
public class FullTimeLecturer extends Lecturer {

    String name, PTClass[];
    int[] classSize;
    double salary;

    public FullTimeLecturer(String aName, int aStaffID, String[] aPTClass, int[] aClassSize, double aSalary) {
        super(aName, aStaffID);
        PTClass = aPTClass;
        classSize = aClassSize;
        salary = aSalary;
    }

    public double calcMonthlyPay() {
        return salary;
    }

    public double calcPTLunchSubsidy() {
        double sum = 0;
        for (int i = 0; i < this.classSize.length; i++) {
            sum += classSize[i] * 10;
        }
        return sum;
    }

}
