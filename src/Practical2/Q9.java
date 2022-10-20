/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author Admin
 */
public class Q9 {
    public static void main(String[] args) {
        int[] numberArray = new int[100];
        System.out.println("-= Display contents of numberArray[] =-");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) numberArray[i] = 2;
            else numberArray[i] = 1;
            System.out.println("numberArray[" + i + "] = " + numberArray[i]);
        }
    }
}
