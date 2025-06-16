package Control_flow;

import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		if(a < b && a < c)System.out.println("yes");
		else System.out.println("no");
	}
}
