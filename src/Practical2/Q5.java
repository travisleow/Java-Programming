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
        double sum = 0.0;
        double average = 0.0;
        int counter = 0;
        
        for (int i = 1; i < 6; i++) {
            System.out.print("Enter score# " + i + " (or enter -1 to stop) : ");
        double score = scanner.nextInt();
        if (score == -1) {
            sum += score;
            break;
        } else {
            counter++;
            sum += score;
        }
        
        }
        average = sum / counter;
        System.out.println(sum + average);
        
        
        
    }
}
