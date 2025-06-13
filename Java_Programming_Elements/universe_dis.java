// package immersion;

import java.util.Scanner;

public class universe_dis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
		int fee = sc.nextInt();
		int dis = sc.nextInt();
//		int b = sc.nextInt();
		System.out.println("The discount amount is INR " + dis + " and final discounted fee is INR " + (fee-dis));
	}
}
