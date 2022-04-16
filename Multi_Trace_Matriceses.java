package random_Questions;

import java.util.Scanner;

public class Multi_Trace_Matriceses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of matriceses : ");
		int n = sc.nextInt();
		
		int[] trace = new int[n];
		int[] opptrace = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println();
			System.out.print("Enter the number for creating square matrix : ");
			int m = sc.nextInt();
			
			int[][] matrix = new int[m][m];
			
			System.out.println("Enter the values for the matrix : ");
			for (int j = 0; j < matrix.length; j++) {
				for (int k = 0; k < matrix.length; k++) {
					matrix[j][k] = sc.nextInt();
					if( j == k )
						trace[i] += matrix[j][k];
					if( j+k == m-1)
						opptrace[i] += matrix[j][k];
				}
			}
		}
		
		sc.close();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("The trace of the matrix " + (i+1) + " is : " + trace[i]);
			System.out.println("The opposite trace of the matrix " + (i+1) + " is : " + opptrace[i]);
			System.out.println();
		}

	}

}
