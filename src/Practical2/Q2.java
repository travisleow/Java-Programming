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
public class Q2 {
    
    public static void main(String[] args) {
        int ph = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter pH level of the tested", "Input", JOptionPane.QUESTION_MESSAGE));
        if (ph == 7) {
            JOptionPane.showMessageDialog(null, "Your aquarium water is neutral", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (ph < 7) {
            JOptionPane.showMessageDialog(null, "Your aquarium water is acidic", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (ph > 7) {
            JOptionPane.showMessageDialog(null, "Your aquarium water is alkaline", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
