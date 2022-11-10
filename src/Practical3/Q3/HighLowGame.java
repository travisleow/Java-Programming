package Practical3.Q3;

/**
 *
 * @author travi
 */
import javax.swing.JOptionPane;

public class HighLowGame {
    int randomNumber, guess;
    String msg;

    public void generateRandomNumber() {
        randomNumber = (int)(Math.random() * 100);
    }

    public void getUserInput() {
        guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess"));
    }

    public String getResult() {
        if (guess > randomNumber) {
            msg = guess + " is higher than the Magic Number";
        } else if (guess < randomNumber) {
            msg = guess + " is lower than the Magic Number";
        } else {
            msg = "You are right!";
        }
        return msg;
    }

    public boolean gameEnded() {
        return !(msg.equals("You are right!"));
    }

}
