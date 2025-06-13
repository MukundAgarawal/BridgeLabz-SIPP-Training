// package immersion;

import java.util.Scanner;

public class profit_loss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
//		int Kilometers = sc.nextInt();
//		int b = sc.nextInt();
		int cp = 129;
		int sp = 191;
		int p = sp-cp;
		System.out.println("The Profit is INR " + (p) + " and the Profit Percentage is " + (p*100/cp));
	}
}
