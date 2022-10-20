/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

import java.util.Scanner;

/**
 *
 * @author travi
 */
public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your option:\n1) Metric Imperial\n2) Imperial\n>>");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.print("Enter your weight in kilograms : ");
            float weight = scanner.nextFloat();
            System.out.print("Enter your height in metres (e.g. 1.75) : ");
            float height = scanner.nextFloat();
            float bmi = (weight / (height * height));
            if (bmi < 18.5) {
                System.out.println("Your BMI is " + String.format("%.1f", bmi) + " and you are Underweight");
            } else if (bmi <= 24.9) {
                System.out.println("Your BMI is " + String.format("%.1f", bmi) + " and you are Normal");
            } else {
                System.out.println("Your BMI is " + String.format("%.1f", bmi) + " and you are Overweight");
            }
        } else if (option == 2) {
            System.out.print("Enter your weight in pounds : ");
            float weight = scanner.nextFloat();
            System.out.print("Enter your height in inches : ");
            float height = scanner.nextFloat();
            float bmi = (weight * 703) / (height * height);
            if (bmi < 18.5) {
                System.out.println("Your BMI is " + String.format("%.1f", bmi) + " and you are Underweight");
            } else if (bmi <= 24.9) {
                System.out.println("Your BMI is " + String.format("%.1f", bmi) + " and you are Normal");
            } else {
                System.out.println("Your BMI is " + String.format("%.1f", bmi) + " and you are Overweight");
            }
        }

    }
}
