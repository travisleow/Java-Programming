/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Q7 {
    public static void main(String[] args) {
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the Height"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width"));
        double area = height * width;
        double perimeter = height + height + width + width;
        JOptionPane.showMessageDialog(null, "Summary of Rectangle Measurements\nHeight : " + String.format("%.1f", height) + "\nWidth: " + String.format("%.1f", width) + "\nArea :" + String.format("%.1f", area) + "\nPerimeter :" + String.format("%.1f", perimeter));
    }
}
