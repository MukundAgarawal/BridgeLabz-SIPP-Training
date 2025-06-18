package Methods;

import java.util.Scanner;

public class wind {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
//		int[]age = new int[3];
//		for(int i = 0; i < 3; i++) age[i] = sc.nextInt();
		
//		System.out.println(solve(sc.nextInt() , sc.nextInt() , sc.nextInt()));
//		solve(sc.nextInt());
		
		System.out.println(calculateWindChill(sc.nextDouble(), sc.nextDouble()));
	}

//	private static void solve(int n) {
//		if(n < 0) System.out.println("negative");
//		else if(n > 0)System.out.println("positive");
//		else System.out.println("zero");
//	}
	
	public static double calculateWindChill(double temp, double wind) {
		return (35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(wind, 0.16));
	}
}
