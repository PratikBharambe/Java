package geeks_for_geeks;

import java.util.*;

public class Sort_array_of_1_2_And_0_only {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the 0, 1 & 2 only............");
		System.out.print("Enter the data for the array : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] > 2 || array[i] < 0) {
				System.out.println("Invalid Input................");
				return;
			}
		}
		
		sc.close();
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}

	}

}
