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
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double credit = 0;
        double totalCredits = 0;
        double gpa = 0;
        double counter = 0;
        double gradePoints = 0;
        while(true) {
            counter++;
            System.out.print("Enter grade for module #" + counter + " (or enter 0 to stop) : ");
            String grade = scanner.next();
            if (grade.equals("0")) break;
            System.out.print("Enter credit units for module #" + counter + " : ");
            credit = scanner.nextInt();
            totalCredits += credit;
            switch (grade.toUpperCase()) {
                case("A"): gradePoints += 4 * credit; break;
                case("B"): gradePoints += 3 * credit; break;
                case("C"): gradePoints += 2 * credit; break;
                case("D"): gradePoints += 1 * credit; break;
            }
        }
        System.out.println("\n\nYour total Credit units : " + totalCredits);
        gpa = gradePoints / totalCredits;
        System.out.println("Your GPA is " + String.format("%.2f", gpa));
    }
}
