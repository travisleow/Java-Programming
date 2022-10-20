/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;
import javax.swing.JOptionPane;

/**
 *
 * @author travi
 */
public class Q4 {
    public static void main(String[] args) {
        while(true) {
            int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a numeric value :", "Input", JOptionPane.QUESTION_MESSAGE));
            if (value < 1 || value > 10) {
                JOptionPane.showMessageDialog(null, "Out of Range! Pls enter a number between 1 and 10!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String roman = "";
                switch (value) {
                    case 1: roman = "I"; break;
                    case 2: roman = "II"; break;
                    case 3: roman = "III"; break;
                    case 4: roman = "IV"; break;
                    case 5: roman = "V"; break;
                    case 6: roman = "VI"; break;
                    case 7: roman = "VII"; break;
                    case 8: roman = "VIII"; break;
                    case 9: roman = "IX"; break;
                    case 10: roman = "X"; break;
                }
                JOptionPane.showMessageDialog(null, "Roman Numeral Value = " + roman, "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        
    }
}
