package random_Questions;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		sc.close();
		
		int armstrong = number;
		
		int sumOfCubeOfDigits = 0;
		
		while(armstrong > 0) {
			int lastDigit = armstrong % 10;
			sumOfCubeOfDigits += lastDigit*lastDigit*lastDigit;
			armstrong /= 10;
		}
		
		
		if(sumOfCubeOfDigits == number) {
			System.out.println("The number " + number + " is a armstrong number.");
		}else {
			System.out.println("The number " + number + " is not armstrong number.");
		}

	}

}
