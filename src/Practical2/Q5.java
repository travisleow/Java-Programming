/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double totalScore = 0;
        double average = 0;
        String grade = "";
        for (int i = 0;; i++) {
            System.out.print("Enter score# " + i + " (or enter -1 to stop) : ");
            Double score = scanner.nextDouble();

            if (score == -1) {
                average = totalScore / i;
                break;
            }
            totalScore += score;
        }

        if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Average Scores = " + String.format("%.2f", average) + " Grade = " + grade);

    }
}
