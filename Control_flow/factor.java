package Control_flow;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		for(int i = 2; i <= n; i++) if(n % i == 0) System.out.println(i);;
	}
}
