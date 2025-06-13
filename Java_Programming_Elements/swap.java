import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
//		int t = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		System.out.println("The swapped values are " + a + " and " + b);
	}
}
