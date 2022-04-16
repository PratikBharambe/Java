package random_Questions;

import java.util.Scanner;

public class Reverse_Number {

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
		
		System.out.println("The reversed number is : " + reverseNumber);

	}

}