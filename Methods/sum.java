package Methods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
//		int[]age = new int[3];
//		for(int i = 0; i < 3; i++) age[i] = sc.nextInt();
		
		System.out.println(solve(n));
	}

	private static int solve(int n) {
		int sum = n;
		while(n-- > 0) {
			sum += n;
		}
		return sum;
	}
}
