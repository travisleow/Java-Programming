/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q2;

import javax.swing.JOptionPane;

/**
 *
 * @author travi
 */
public class SphereTest {

    public static void main(String[] args) {
        String radius = "";
        Sphere newSphere = new Sphere();
//        while (true) {
//            try {
//                double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the sphere:"));
//                newSphere.setRadius(radius);
//                JOptionPane.showMessageDialog(null, "The area of the sphere is: " + newSphere.calculateArea() + "\nThe volume of the sphere is: " + newSphere.calculateVolume(), "Sphere", JOptionPane.INFORMATION_MESSAGE);
//                break;
//
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "No value entered.\nPlease enter again.", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        }
           
            do {
                radius = JOptionPane.showInputDialog("Enter the radius of the sphere:");
                if (radius == null || radius.equals("")) {
                    JOptionPane.showMessageDialog(null, "No value entered.\nPlease enter again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    try {
                        newSphere.setRadius(Double.parseDouble(radius));
                        JOptionPane.showMessageDialog(null, "The area of the sphere is: " + newSphere.calculateArea() + "\nThe volume of the sphere is: " + newSphere.calculateVolume(), "Sphere", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter an integer.\nPlease enter again.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } while (true);
            
    }
}
