package geeks_for_geeks;

import java.util.Scanner;

public class Missing_Number_In_An_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		
		int required_sum = (n*(n+1))/2;
		int sum = 0;
		
		int[] array = new int[n];
		System.out.println("Enter the data for the array less than one fron length of array : ");
		for (int i = 0; i < array.length-1; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		
		sc.close();
		
		System.out.println("The missing number is : " + (required_sum-sum));

	}

}
