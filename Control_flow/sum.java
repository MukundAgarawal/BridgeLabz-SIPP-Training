package Control_flow;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int sum = 0;
		while(true) {
			int a = sc.nextInt();
			if(a <= 0) break;
			sum += a;
		}
		System.out.println(sum);
	}
}
