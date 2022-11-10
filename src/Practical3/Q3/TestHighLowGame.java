package Practical3.Q3;

/**
 *
 * @author travi
 */
import Practical3.Q3.HighLowGame;
import javax.swing.JOptionPane;

public class TestHighLowGame {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the High Low Number Game!");
        int num = HighLowGame.generateRandomNumber();
        String result;
        System.out.println(num);
        do {
            int input = HighLowGame.getUserInput();
            result = HighLowGame.getResult(input, num);
            JOptionPane.showMessageDialog(null, result);
        } while (HighLowGame.gameEnded(result));
    }
}
