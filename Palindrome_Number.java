package random_Questions;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value : ");
		int number  = sc.nextInt();
		sc.close();
		
		int numberTemp = number;
		int reverseNumber = 0;
		
		while(numberTemp > 0) {
			int lastDigit = numberTemp % 10;
			numberTemp /= 10;
			reverseNumber = reverseNumber*10+lastDigit;
		}
		
		if(reverseNumber == number) {
			System.out.println("The number " + number + " is a palindrome number."); 
		}else {
			System.out.println("The number " + number + " is not a palindrome number.");
		}

	}

}
