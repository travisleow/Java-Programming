
import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        aMethod();
    }

    public static void aMethod() {
        try {
            Scanner br = new Scanner(System.in);
            int[] numbers = {10, 20, 30};
            System.out.print("Enter 1st Number : ");
            int a = Integer.parseInt(br.next());
            if (a < 0 || a > 2) {
                throw new ArrayIndexOutOfBoundsException("1st number cannot be less than 0 and more than 2");
            }
            System.out.println("1");
            System.out.print("Enter 2nd Number: ");
            int b = Integer.parseInt(br.next());
            System.out.println("2");
            int c = a / b;
            System.out.println("3");
            System.out.println("c = " + c);
            System.out.println(numbers[a]);
        } catch (NumberFormatException e) {
            System.out.println("Please input an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by 0.");
        } catch (Exception e) { 
            System.out.print("Unknown Error");
        }
    }
}
