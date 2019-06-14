package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Temperatures {

	public static void main(String[] args) {
		
//	Defining the size of the array by asking it from the scanner

		Scanner scan = new Scanner (System.in);
		
		System.out.println("how many temperatures do you have?");
		int size = scan.nextInt();
		
		double temperature[] = new double [size];
		double sum = 0;
		double average =0;
		
		System.out.println("Enter"+ temperature.length +"temperatures:"); // we could also say "size" instead of "temperature.length"
		
// Putting data to the array indexes with a scanner		
		
		for (int i=0; i<temperature.length; i++) {
			temperature [i] = scan.nextDouble();
			sum = sum + temperature[i];
		} 
		average = sum/7;
		
		System.out.println("The average of this week is " + average);
		
// Printing the array with for loop
		
		for (int i=0; i<7; i++) {
			System.out.println(temperature[i]);
		}
		
// Printing the array with Arrays.toString property of Arrays class
		
		System.out.println("The temperatures are " + Arrays.toString(temperature));
		
//	Displaying each array and checking if they are above or below the average
		
		for (int i=0; i<7; i++) {
			
			if(temperature[i]>average) {
				System.out.println(temperature[i] + " is above the average");
			} else if (temperature [i]<average) {
				System.out.println(temperature[i] + " is below the average");
			} else {
				System.out.println(temperature[i] + " is the average");
				
			}
			
		}
		

	}

}
