package edu.cursor.mavenHomework.service;

import java.util.Scanner;

/**
 * This class contains console menu inside the init method.
 * 
 * @author siakovalina
 */
public class UserMenu {

	Scanner sc = new Scanner(System.in);

	public void init() {

		while (true) {
			System.out.println("Enter 1 to see into exercise 182");
			System.out.println("Enter 2 to see into exercise on Fibonacci numbers");
			System.out.println("Enter 3 to see into exercise 323");
			System.out.println("Enter 4 to see into exercise 303");
			System.out.println("Enter 5 to exit the program");
			int caseNumber = Integer.parseInt(sc.nextLine());
			
			switch (caseNumber) {
			case 1:
				Exercise182 ex182 = new Exercise182();
				ex182.ex182();
				break;
			case 2:
				ExerciseOnFibonacciNumbers exOnFibNumbers = new ExerciseOnFibonacciNumbers();
				exOnFibNumbers.fibonacci();
			case 3:
				Exercise323 ex323 = new Exercise323();
				ex323.ex323();
			case 4:
				Exercise303 ex303 = new Exercise303();
				ex303.ex303();
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid input");
				break;
			
				
			}

		}
	}

}
