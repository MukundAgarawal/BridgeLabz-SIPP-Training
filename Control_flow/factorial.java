package Control_flow;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int fac = 1;
		for( ; n > 1; n--) fac *= n;
		System.out.println(fac);
	}
}
