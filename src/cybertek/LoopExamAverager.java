package cybertek;

import java.util.Scanner;

public class LoopExamAverager {

	public static void main(String[] args) {

		double sum = 0;
		double studentScore = 0;
		String answer = "";
		Scanner scan = new Scanner(System.in);
		int studentNumber = 0;
		double average = sum / studentNumber;

		System.out.println("This program computes the average of \na list of exam scores\n");

		do {
			System.out.println("Enter the score to be averaged");
			studentScore = scan.nextDouble();
			scan.nextLine();
			studentNumber++;
			while(studentScore >=0){
			sum = sum + studentScore;
			System.out.println("Do you want to enter another score? yes or no");
			answer = scan.nextLine();
			System.out.println("Enter the score to be averaged");
			studentScore = scan.nextDouble();
			scan.nextLine();
			studentNumber++;
			} if (!answer.equalsIgnoreCase("yes")) {
				System.out.println("Here is the average: " + average);
				System.exit(0);
				
			}

		} while (answer.equalsIgnoreCase("yes"));

	}

}
