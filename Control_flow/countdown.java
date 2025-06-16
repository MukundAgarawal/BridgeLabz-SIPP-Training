package Control_flow;

import java.util.Scanner;

public class countdown {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		for( ; n > 1; n--) System.out.println(n);
	}
}
