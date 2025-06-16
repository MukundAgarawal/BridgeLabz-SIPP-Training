package Control_flow;

import java.util.Scanner;

public class compare_sum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int sum = 1;
		for( ; n > 1; n--) sum += n;
		System.out.println(sum == (n*(n-1))/2);
	}
}
