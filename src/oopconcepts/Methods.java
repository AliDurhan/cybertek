package oopconcepts;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your name:");		
		String studentName = scan.nextLine();
		
		
		System.out.println("Enter your score:");
		int score = scan.nextInt();
		scan.nextLine();
		
		String grade = findGrades(score);
		
		
		displayGrades(studentName, grade);
		


	}
	
	public static String findGrades(int score) {
		
		String grade;
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80) {
			grade = "C";
		} else {
			grade = "D";
		}
		
		return grade;
	}
	
	public static void displayGrades(String studentName, String grade) {
		
		System.out.println("------------------------------------------");
		System.out.println(studentName + ", your grade is: " + grade);
		System.out.println("------------------------------------------");
		
	}

}
