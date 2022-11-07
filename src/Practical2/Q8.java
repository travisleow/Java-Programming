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
public class Q8 {
    public static int inputSec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total seconds: ");
        int seconds = scanner.nextInt();
        System.out.println("\n  Time Converter\n");
        return seconds;
    };
    
    public static int[] convert(int seconds) {
        int[] convert = {seconds/3600, (seconds % 3600) / 60, (seconds % 3600) % 60};
        return convert;
    };
    
    public static void display(int[] convert, int seconds) {
        System.out.println("Total Seconds: " + seconds);
        System.out.println("Hours:         " + convert[0]);
        System.out.println("Minutes:       " + convert[1]);
        System.out.println("Seconds:       " + convert[2]);
    }
            
            
    public static void main(String[] args) {
        int seconds = inputSec();
        int[] convert = convert(seconds);
        display(convert, seconds);
    }
}
