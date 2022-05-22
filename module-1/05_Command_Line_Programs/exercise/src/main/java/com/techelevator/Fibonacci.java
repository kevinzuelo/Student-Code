package com.techelevator;

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int userEnd = Integer.parseInt(scanner.nextLine());

		int[] fibSequence = new int[1000];
		fibSequence[0] = 0;
		fibSequence[1] = 1;


		for (int i = 2; i <= userEnd; i++) {
			fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
		}

		if(userEnd <= 0) {
			System.out.println(fibSequence[0] + ", " + fibSequence[1]);
		}
		else if(userEnd == 1) {
			System.out.println(fibSequence[0] + ", " + fibSequence[1] + ", " + fibSequence[userEnd]);
		}
		else {
			for (int i = 0; fibSequence[i] <= userEnd; i++) {
				System.out.print(fibSequence[i] + ", ");
			}
		}
		scanner.close();
	}
}
