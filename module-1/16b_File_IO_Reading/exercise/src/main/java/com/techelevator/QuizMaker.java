package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		List<QuizQuestion> questionList = new ArrayList<>();
		int correctAnswers = 0;

		System.out.println("Enter the fully qualified name of the file to read in for quiz questions");
		String path = scanner.nextLine();

		File inputFile = new File(path);


		Scanner fileScanner = new Scanner(inputFile);
			while (fileScanner.hasNext()) {
				String line = fileScanner.nextLine();
				String[] splitLine = line.split("\\|");
				questionList.add(new QuizQuestion(splitLine));
			}
		for(QuizQuestion question : questionList) {
			System.out.println("\n" + question.getQuestion());
			question.printAnswers();
			int userAnswer = scanner.nextInt();

			System.out.println("\nYour answer: " + userAnswer);

			if(question.getAnswers()[userAnswer - 1].equals(question.getCorrectAnswer())){
				System.out.println("RIGHT!");
				correctAnswers++;
			}
			else {
				System.out.println("WRONG!");
			}
		}
		System.out.println("You got " + correctAnswers + " answer(s) correct out of the " + questionList.size() + " questions asked.");
		scanner.close();

	}

}
