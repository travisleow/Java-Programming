/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Practical3.Q1;

import java.util.Scanner;

/**
 *
 * @author travi
 */
public class TrapeziumUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Trapezium class program started.");
        System.out.println("");
        System.out.print("Enter base of Trapezium: ");
        double base = scanner.nextDouble();
        System.out.print("Enter top of Trapzeium: ");
        double top = scanner.nextDouble();
        System.out.print("Enter height of Trapezium: ");
        double height = scanner.nextDouble();
        System.out.println("");

        Trapezium newTrapezium = new Trapezium(base, top, height);
        double area = newTrapezium.calculateArea();
        System.out.println("The area of the trapezium is " + area);
        System.out.println("");
        System.out.println("Trapezium class program terminated.");
    }
}
