package geeks_for_geeks;

import java.util.Scanner;

public class Duplicate_in_the_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];;
		
		System.out.print("Enter the elements of the array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.print("The duplicate elements are : ");
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}

	}

}
