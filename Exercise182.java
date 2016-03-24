package edu.cursor.mavenHomework.service;

import java.util.Scanner;
/**
 * This class contains the method(s) used to solve the problem in exercise 182.
 * @author 
 *
 */
public class Exercise182 {
	
	public int ex182(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Даны натуральное число n, целые числа а1,..., аn. \n"
				+ "Найти количество и сумму тех членов данной последовательности,\n" 
				+ "которые делятся на 5 и не делятся на 7 \n"
				+ "Введите число n." );
		while (!sc.hasNextInt()){
			System.out.println("Некорректный ввод");
		}
		int n = sc.nextInt();
		
		return 0;
		
		
	}

}
