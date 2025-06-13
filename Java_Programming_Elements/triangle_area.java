package immersion;

import java.util.Scanner;

public class welcome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int b = sc.nextInt();
		double b = sc.nextInt();
		double h = sc.nextInt();
//		int h = sc.nextInt();
		double bi = b/2.54;
		double hi = h/2.54;
		System.out.println("The Area of the triangle in sq in is " + (bi*hi/2) + " and sq cm is " + (b*h)/2);
	}
}

