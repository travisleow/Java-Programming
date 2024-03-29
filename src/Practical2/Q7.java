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
       double height = getHeight();
       double width = getWidth();
       double[] measurements = calculate(width, height);
       showMsg(height, width, measurements);
    }
    
    public static double getHeight() {
         double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the Height"));
         return height;
    }
    
    public static double getWidth() {
         double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width"));
         return width;
    }
    
    public static double[] calculate(double width, double height) {
        double[] measurements = {height*width, height + height + width + width};
        return measurements;
    }
    
    public static void showMsg(double height, double width, double[] measurements) {
         JOptionPane.showMessageDialog(null, String.format("Summary of Rectangle Measurements\nHeight: %.1f\n Width: %.1f\nArea: %.1f\nPerimeter: %.1f", height, width, measurements[0], measurements[1]));
    }
}
