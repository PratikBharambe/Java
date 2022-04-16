package geeks_for_geeks;

import java.util.Scanner;

public class Laregest_element_in_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements in the array : ");;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("The largest element in the list is : " + arr[n-1]);
		
	}

}
