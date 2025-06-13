package immersion;

import java.util.Scanner;

public class welcome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt();
//		double d = sc.nextInt();
//		double b = sc.nextInt();
		int q = sc.nextInt();
		System.out.println("The total purchase price is INR " + (up*q) + " if the quantity " + (q) + "  and unit price is INR " + (up));
	}
}
