package random_Questions;

import java.util.Scanner;

public class Co_Ordinate_System {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value for Abscissa : ");
		int abscissa = sc.nextInt();
		System.out.print("Enter the value for Ordinate : ");
		int ordinate = sc.nextInt();
		
		sc.close();
		
		if (abscissa > 0) {
			if (ordinate > 0) {
				System.out.println("The point is in 1st quadrant.");
			} else {
				System.out.println("The point is in 4th quadrant.");
			}
		} else {
			if (ordinate > 0) {
				System.out.println("The point is in 2nd quadrant.");
			}
			else {
				System.out.println("The point is in 3rd quadrant.");
			}
		}

	}

}
