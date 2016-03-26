package edu.cursor.mavenHomework.service;

import java.util.Scanner;
/**
 * This class contains the method(s) used to solve the problem on Fibonacci numbers.
 * @author Semochko Oleksandr
 *
 */

public class ExerciseOnFibonacciNumbers {
	
	public int fibonacci(){
	private static int f(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return f(index - 1) + f(index - 2);
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter amount of Fibonacci numbers to show:\n");
		int n = sc.nextInt();
    	
        for (int i = 1; i <= n; i++) {
            System.out.print(f(i) + " ");
        }
    }
}
