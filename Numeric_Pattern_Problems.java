package random_Questions;

import java.util.Scanner;

public class Numeric_Pattern_Problems {


	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a number : ");
	    int num = sc.nextInt();
	    sc.close();

	    System.out.println();
	    System.out.println("Pattern : 01");
	    pattern1(num);
	    System.out.println();

	    System.out.println("Pattern : 02");
	    pattern2(num);
	    System.out.println();

	    System.out.println("Pattern : 03");
	    pattern3(num);
	    System.out.println();

	    System.out.println("Pattern : 04");
	    pattern4(num);
	    System.out.println();

	    System.out.println("Pattern : 05");
	    pattern5(num);
	    System.out.println();
	    
	    System.out.println("Pattern : 06");
	    pattern6(num);
	    System.out.println();

	    System.out.println("Pattern : 07");
	    pattern7(num);
	    System.out.println();
	    
	    System.out.println("Pattern : 08");
	    pattern8(num);
	    System.out.println();

	}

	//  All the patterns are shown using the input "5".....................

	/*
	5 4 3 2 1 1 2 3 4 5 
	5 4 3 2     2 3 4 5 
	5 4 3         3 4 5 
	5 4             4 5 
	5                 5 
	*/
	public static void pattern1(int n){
	    for(int i = 1 ; i <= n ; i++){
	        for(int j = n ; j >= i ; j--){
	            System.out.print(j + " ");
	        }
	        for(int j = 1 ; j <= 2*i-2 ; j++){
	            System.out.print("  ");
	        }
	        for(int j = i ; j <= n ; j++){
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }
	}

	/*
	        0
	      0 1 0
	    0 1 0 1 0
	  0 1 0 1 0 1 0
	0 1 0 1 0 1 0 1 0
	*/
	public static void pattern2(int n){
	    for(int i = 1 ; i <= n ; i++){
	        for (int j = 1; j <= n-i; j++){
	            System.out.print("  ");
	        }
	        for(int j = 1 ; j <= 2*i-1 ; j++){
	            if(j % 2 == 0) {
	            	System.out.print("1 ");
	            }else {
	            	System.out.print("0 ");
	            }
	        }
	        System.out.println();
	    }
	}

	/*
	        1 
	      0 1 0 
	    1 0 1 0 1 
	  0 1 0 1 0 1 0 
	1 0 1 0 1 0 1 0 1
	*/
	public static void pattern3(int n){
	    int flag = 0;
	    for(int i = 1 ; i <= n ; i++){
	        for (int j = 1; j <= n-i; j++){
	            System.out.print("  ");
	        }
	        for(int j = 1 ; j <= 2*i-1 ; j++){
	            if(flag == 0){
	                System.out.print("1 ");
	                flag = 1;
	            }
	            else{
	                System.out.print("0 ");
	                flag = 0;
	            }
	        }
	        System.out.println();
	    }
	}

	/*
	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15
	*/
	public static void pattern4(int n){
	    int num = 1;
	    for(int i = 1 ; i <= n ; i++){
	        for(int j = 1 ; j <= i ; j++){
	            System.out.print(num++ + " ");
	        }
	        System.out.println();
	    }
	}

	/*
	5 5 5 5 5
	5 4 4 4 4
	5 4 3 3 3
	5 4 3 2 2
	5 4 3 2 1
	*/
	public static void pattern5(int n){
	    for(int i = n ; i >= 1 ; i--){
	        for(int j = n ; j >= 1 ; j--){
	            if(i > j) {
	            	System.out.print(i + " ");
	            }else {
	            	System.out.print(j + " ");
	            }
	        }
	        System.out.println();
	    }
	}

	/*
	5 5 5 5 5 5 5 5 5 5 
	5 4 4 4 4 4 4 4 4 5 
	5 4 3 3 3 3 3 3 4 5 
	5 4 3 2 2 2 2 3 4 5 
	5 4 3 2 1 1 2 3 4 5 
	5 4 3 2 1 1 2 3 4 5 
	5 4 3 2 2 2 2 3 4 5 
	5 4 3 3 3 3 3 3 4 5 
	5 4 4 4 4 4 4 4 4 5 
	5 5 5 5 5 5 5 5 5 5 
	*/
	public static void pattern6(int n){
	    for (int i = n; i >= 1; i--){
	        for(int j = 1 ; j <= n-i+1 ; j++){
	            System.out.print( n-j+1 + " ");
	        }
	        for (int j = 1; j <= 2*i-2 ; j++){
	            System.out.print( i + " ");
	        }
	        for(int j = i ; j <= n; j++){
	            System.out.print( j + " ");
	        }
	        System.out.println();
	    }
	    for (int i = 1; i <= n; i++){
	        for (int j = 1; j <= n-i+1; j++){
	            System.out.print( n-j+1 + " ");
	        }
	        for (int j = 1; j <= 2*(i-1); j++){
	            System.out.print( i + " ");
	        }
	        for(int j = i ; j <= n ; j++){
	            System.out.print( j + " ");
	        }
	        System.out.println();
	    }
	}

	/*
	                    1
	               4  9  16
	          25  36  49  64  81
	     100  121  144  169  196  225  256
	289  324  361  400  441  484  529  576  625
	*/
	public static void pattern7(int n){
	    int temp = 1;
	    for (int i = 1; i <= n; i++){
	        for(int j = n ; j >= i+1 ; j--){
	            System.out.print("     ");
	        }
	        for(int j = 1 ; j <= 2*i-1 ; j++){
	            System.out.print(temp*temp + "  ");
	            temp++;
	        }
	        System.out.println();
	    }
	}

	/*
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
	*/
	public static void pattern8(int n){
	    for(int i = 1 ; i <= n ; i++){
	        for(int j = 1 ; j <= i ; j++){
	            System.out.print( j + " ");
	        }
	        System.out.println();
	    }
	    for(int i = n ; i >= 2 ; i--){
	        for(int j = 1 ; j <= i-1 ; j++){
	            System.out.print( j + " ");
	        }
	        System.out.println();
	    }
	}



}
