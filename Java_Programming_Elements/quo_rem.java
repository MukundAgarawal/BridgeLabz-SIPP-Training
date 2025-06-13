package immersion;

import java.util.Scanner;

public class welcome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The Quotient is " + (a/b) + " and Reminder is " + (a%b) + " for numbers " + a + " and " + b);
	}
}
