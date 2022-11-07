package Practical3;

/**
 *
 * @author travi
 */
import javax.swing.JOptionPane;

public class HighLowGame {
    int randomNumber, guess;

    public static int generateRandomNumber() {
        return (int)(Math.random() * 100);
    }

    public static int getUserInput() {
        return Integer.parseInt(JOptionPane.showInputDialog("Enter your guess"));
    }

    public static String getResult(int guess, int generatedNum) {
        if (guess > generatedNum) {
            return guess + " is higher than the Magic Number";
        } else if (guess < generatedNum) {
            return guess + " is lower than the Magic Number";
        } else {
            return "You are right!";
        }
    }

    public static boolean gameEnded(String result) {
        return !(result.equals("You are right!"));
    }

}
