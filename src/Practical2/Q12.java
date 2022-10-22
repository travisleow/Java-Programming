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
public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter first base value : ");
		Integer first = input.nextInt();
		System.out.print("Enter last base value : ");
		Integer last = input.nextInt();

		for (int i = 1; i <= 25; i++) {
			for (int j = first; j <= last; j++) {
				System.out.print((i * j) + "\t");
			}
			System.out.println();
		}
    }
}
