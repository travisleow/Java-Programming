package Practical3.Q3;

/**
 *
 * @author travi
 */
import javax.swing.JOptionPane;

public class TestHighLowGame {
    public static void main(String[] args) {
        HighLowGame game = new HighLowGame();
        JOptionPane.showMessageDialog(null, "Welcome to the High Low Number Game!");
        game.generateRandomNumber();
        System.out.println(game.randomNumber);
        do {
            game.getUserInput();
            JOptionPane.showMessageDialog(null, game.getResult());
        } while (game.gameEnded());
    }
}
