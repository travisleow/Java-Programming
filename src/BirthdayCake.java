/**
 *
 * @author travi
 */
public class BirthdayCake extends Cake {
    int age;
    
    public BirthdayCake(String flavor, double weight, int age) {
        super(flavor, weight);
        this.age = age;
    }
    
    public void computeCostnDisplayMsg() {
        System.out.println("Happy Birthday! You are " + this.age + " years old now.\nThe flavor is " + getFlavor() + " and the cost is $" + getWeight() * 25);
    }
    
    public static void main(String[] args) {
        BirthdayCake cake = new BirthdayCake("Strawberry", 3, 20);
        cake.computeCostnDisplayMsg();
    }
}
