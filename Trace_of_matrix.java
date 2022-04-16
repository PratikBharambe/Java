package random_Questions;

import java.util.Scanner;

public class Trace_of_matrix {

	public static void main(String[] args) {
		
//		Creating the object for scanner class to take the input..........................
		Scanner sc = new Scanner(System.in);
		
//		taking the input from user to create a square matrix.................
		System.out.print("Enter the number for square matrix : ");
		int n = sc.nextInt();
		
//		Creating an 2D array for as a matrix.....................
		int[][] matrix = new int[n][n];
		
//		Creating trace and opptrace variable.................
		int trace = 0;
		int opptrace = 0;
		
//		Taking the values of matrix form the user and simultaneously find the trace and opposite trace of the matrix..........
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = sc.nextInt();
				if(i == j)
					trace += matrix[i][j];
				if(i+j == n-1)
					opptrace += matrix[i][j];
			}
		}
		
//		Closing the scanner class object for avoiding data leakage..............
		sc.close();
		
//		Printing the value of trace and opptrace of the entered matrix..............
		System.out.println("The trace of the matrix is : " + trace);
		System.out.println("The opposite trace of the matrix is : " + opptrace);
		

	}

}
