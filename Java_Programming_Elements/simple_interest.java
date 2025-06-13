import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		System.out.println("The simple interest is "+ ((p*r*t)/100));
	}
}
