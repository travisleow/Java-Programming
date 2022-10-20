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
public class Q1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double mst, a1, a2, gp;
        System.out.print("Enter MST Scores : ");
        mst = scanner.nextInt() * 0.20;
        System.out.print("Enter Assignment 1 Scores : ");
        a1 = scanner.nextInt() * 0.25;
        System.out.print("Enter Assignment 2 Scores : ");
        a2 = scanner.nextInt() * 0.35;
        System.out.print("Enter General Performance Scores : ");
        gp = scanner.nextInt() * 0.2;
        double score = mst + a1 + a2 + gp;
        System.out.println("Your final scores: " + String.format("%.2f", score));
    };
}
