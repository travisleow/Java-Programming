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
public class Q10 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        int highest = intArray[0];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Enter value for intArray[" + i + "] -> ");
            intArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < intArray.length; i++) {
            if (highest < intArray[i]) highest = intArray[i];
        }
        System.out.println("\nElements of intArray: " + intArray[0] + " " + intArray[1] + " " + intArray[2] + " "  + intArray[3] + " "  + intArray[4]);
        System.out.println("Highest Element: " + highest);
        
    }
}
