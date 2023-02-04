
import java.io.Serializable;

public class BreadCollection implements Serializable {

    public final static String[] BREADTYPE = {
        "Plain", "Wholemeal", "Raisin",
        "Banana", "Corn"};
    // (part b)
    public final static int PLAIN = 0;
    public final static int WHOLEMEAL = 1;
    public final static int RAISIN = 2;
    public final static int BANANA = 3;
    public final static int CORN = 4;
    private double costOfFlour;
    private Bread breads[];

    public BreadCollection()/* missing code */ {
        // Missing code (c)
        breads = new Bread[(BREADTYPE.length)];
        for (int i = 0; i < BREADTYPE.length; i++) {
            breads[i] = new Bread(BREADTYPE[i]);
        }
    }

    public void initAmountOfFlour()/* missing code */ {
        //Missing code (d)
        int[] amount = {500, 600, 300, 400, 600};
        for (int i = 0; i < breads.length; i++) {
            breads[i].setAmtOfFlour(amount[i]);
        }
    }

    // Missing Methods
    public Bread getBread(int index) {
        return breads[index];
    }

    public int getNumOfBreads() {
        return breads.length;
    }

    public double getCostOfFLour() {
        return costOfFlour;
    }

    public void setCostOfFLour(double costOfFlour) {
        this.costOfFlour = costOfFlour;
    }
}
