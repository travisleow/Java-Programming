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
public class Q13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character to be used : ");
        String character = scanner.next();
        if (character.length() != 1) {
            character = "*";
        }
        System.out.print("Enter height of the pyramid (1 - 10) : ");
        int height = scanner.nextInt();
        if (height < 1 || height > 10) {
            height = 3;
        }
        
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
        
        for (int i = height - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

}
