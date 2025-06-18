package Methods;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
//		int[]age = new int[10];
//		for(int i = 0; i < 10; i++) age[i] = sc.nextInt();
//		int[]height = new int[3];
//		for(int i = 0; i < 3; i++) height[i] = sc.nextInt();
		
//		System.out.println(solve(sc.nextInt() , sc.nextInt() , sc.nextInt()));
		solve(sc.nextInt());
		
	}

	private static void solve(int n) {
		for(int i = 2; i <= n; i++) if(n % i == 0) System.out.println(i);;
	}
}
