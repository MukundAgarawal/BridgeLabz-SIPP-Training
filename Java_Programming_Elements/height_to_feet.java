package immersion;

import java.util.Scanner;

public class welcome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
		double h = sc.nextInt();
//		int b = sc.nextInt();
		System.out.println("Your Height in cm is " + (h) + " while in feet is " + (h/(2.54*12)) + " and inches is " + (h/2.54));
	}
}
