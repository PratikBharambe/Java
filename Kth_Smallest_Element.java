package geeks_for_geeks;

import java.util.*;

public class Kth_Smallest_Element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter the elements of the array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.print("Enter the value of k to find the number : ");
		int k = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			if(i == k-1) {
				System.out.println("The Kth smallest element of the array is : " + arr[i]);
				return;
			}
		}

	}

}
