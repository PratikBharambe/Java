package random_Questions;

import java.util.Scanner;

public class Star_Pattern_Problems {

	/*  Pattern 1
	* * * * * 
	* * * * * 
	* * * * * 
	* * * * * 
	* * * * *
	*/
	public static int pattern1(int numberofrows){
	    for (int i = 1; i <= numberofrows; i++){
	        for (int j = 1; j <= numberofrows; j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    return 0; 
	}

	/*  Pattern 2
	* * * * * 
	* * * * 
	* * * 
	* * 
	*
	*/
	public static int pattern2(int numberofrows){
	    for (int i = 0; i < numberofrows; i++){
	        for (int j = 1; j <= numberofrows-i; j++){
	        	System.out.print("* ");
	        }
	        System.out.println();
	    }
	    return 0;
	}

	/*  Pattern 3
	*
	* *
	* * *
	* * * *
	* * * * *
	*/
	public static int pattern3(int numberofrows){
	    for (int i = 1; i <= numberofrows; i++){
	        for (int j = 1; j <= i; j++){
	        	System.out.print("* ");
	        }
	        System.out.println();
	    }
	    return 0;
	}

	/*  Pattern 4
	* * * * *
	  * * * *
	    * * *
	      * *
	        *
	*/
	public static int pattern4(int numberofrows){
	    for (int i = 1; i <= numberofrows; i++){
	        for (int j = 1; j <= i-1; j++){
	        	System.out.print("  ");
	        }
	        for (int j = numberofrows; j >= i; j--){
	        	System.out.print("* ");
	        }
	        System.out.println();
	    }
	    return 0;
	}

	/*  Pattern 5
	        *
	      * *
	    * * *
	  * * * *
	* * * * *
	*/
	public static int pattern5(int numberofrows){
	    for (int i = 1; i <= numberofrows; i++){
	        for (int j = 1; j <= numberofrows-i; j++){
	        	System.out.print("  ");
	        }
	        for (int j = 1; j <= i; j++){
	        	System.out.print("* ");
	        }
	        System.out.println();
	    }
	    return 0;
	}

	/*  Pattern 6
	        *
	      * * *
	    * * * * *
	  * * * * * * * 
	* * * * * * * * * 
	  * * * * * * *
	    * * * * *
	      * * *
	        * 
	*/
	public static int pattern6(int numberofrows){
	    for (int i = 1; i <= numberofrows; i++){
	        for (int j = 1; j <= numberofrows-i; j++){
	        	System.out.print("  ");
	        }
	        for (int j = 1; j <= 2*i-1; j++){
	        	System.out.print("* ");
	        }
	        System.out.println();
	    }
	    for (int i = 1; i <= numberofrows-1; i++){
	        for (int j = 1; j <= i; j++){
	        	System.out.print("  ");
	        }
	        for (int j = 1; j <= 2*(numberofrows-i)-1; j++){
	        	System.out.print("* ");
	        }
	        System.out.println();
	    }
	    return 0;
	}

	/*  Pattern 7
	        *
	      *   * 
	    *       *
	  *           *
	*               *
	  *           *
	    *       *
	      *   *
	        *
	*/
	public static int pattern7(int numberofrows){
	    for (int i = 1; i <= numberofrows-1; i++){
	    	System.out.print("  ");
	    }
	    System.out.println("* ");
	    for (int i = 1; i <= numberofrows-1; i++){
	        for (int j = 2; j <= numberofrows-i; j++){
	        	System.out.print("  ");
	        }
	        System.out.print("* ");
	        for (int j = 1; j <= 2*i-1; j++){
	        	System.out.print("  ");
	        }
	        System.out.print("* ");
	        System.out.println();
	    }
	    for (int i = 0; i <= numberofrows-3; i++){
	        for (int j = 1; j <= i+1; j++){
	        	System.out.print("  ");
	        }
	        System.out.print("* ");
	        for (int j = 1; j <= 2*(numberofrows-i)-5; j++){
	        	System.out.print("  ");
	        }
	        System.out.print("* ");
	        System.out.println();
	    }
	    for (int i = 1; i <= numberofrows-1; i++){
	    	System.out.print("  ");
	    }
	    System.out.print("* "); 
	    return 0;  
	}

	/*  Pattern 8
	*
	* *
	*   *
	*     *
	* * * * *
	*/
	public static int pattern8(int numberofrows){
		System.out.println("* ");
	    for (int i = 1; i <= numberofrows-2; i++){
	    	System.out.print("* ");
	        for (int j = 1; j <= i-1; j++){
	        	System.out.print("  ");
	        }
	        System.out.println("* ");
	    }
	    for (int i = 1; i <= numberofrows; i++){
	    	System.out.print("* ");
	    }
	    return 0;
	}

	/*  Pattern 9
	* * * * * * * * * *
	* * * *     * * * *
	* * *         * * * 
	* *             * *
	*                 *
	*                 *
	* *             * *
	* * *         * * * 
	* * * *     * * * *
	* * * * * * * * * *
	*/
	public static void pattern9(int numberofrows){
	    for (int i = numberofrows ; i >= 1 ; i--) {
				for(int  j = 1 ; j <= i ; j++) {
					System.out.print("* ");
				}
				for(int j = 1 ; j <= numberofrows-i ; j++) {
					System.out.print("    ");
				}
				for(int j = 1 ; j <= i ; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			for(int i = 2 ; i <= numberofrows ; i++) {
				for(int j = 1 ; j <= i ; j++) {
					System.out.print("* ");
				}
				for(int j = 1 ; j <= numberofrows-i ; j++) {
					System.out.print("    ");
				}
				for(int j = 1 ; j <= i ; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}

	/*  Pattern 10
	        * * * * *
	      *       *
	    *       *
	  *       *
	* * * * *
	*/
	public static int pattern10(int noofrows){
	    for (int i = 1; i < noofrows; i++){
	    	System.out.print("  ");
	    }
	    for (int i = 1; i <= noofrows; i++){
	    	System.out.print("* ");
	    }
	    System.out.println();
	    for (int i = 1; i <= noofrows-2; i++){
	        for (int j = 1; j <= noofrows-i-1; j++){
	        	System.out.print("  ");
	        }
	        System.out.print("* ");
	        for (int j = 1; j <= noofrows-2; j++){
	        	System.out.print("  ");
	        }
	        System.out.println("* ");
	    }
	    for (int i = 1; i <= noofrows; i++){
	    	System.out.print("* ");
	    }
	    return 0;
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter the number of rows : ");
	    int noofrows = sc.nextInt();
	    sc.close();
	    
	    System.out.println("Pattern : 01 ");
	    pattern1(noofrows);
	    System.out.println();

	    System.out.println("Pattern : 02 ");
	    pattern2(noofrows);
	    System.out.println();

	    System.out.println("Pattern : 03 ");
	    pattern3(noofrows);
	    System.out.println();

	    System.out.println("Pattern : 04 ");
	    pattern4(noofrows);
	    System.out.println();

	    System.out.println("Pattern : 05 ");
	    pattern5(noofrows);
	    System.out.println();

	    System.out.println("Pattern : 06 ");
	    pattern6(noofrows);
	    System.out.println();

	    System.out.println("Pattern : 07 ");
	    pattern7(noofrows);
	    System.out.println();

	    System.out.println("Pattern : 08 ");
	    pattern8(noofrows);
	    System.out.println();
	    
	    System.out.println("Pattern : 09 ");
	    pattern9(noofrows);
	    System.out.println();
	    
	    System.out.println("Pattern : 10 ");
	    pattern10(noofrows);
	    System.out.println();
	 
	}

}
