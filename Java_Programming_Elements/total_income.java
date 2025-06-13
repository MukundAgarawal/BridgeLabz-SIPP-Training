import java.util.Scanner;

public class total_income {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		int bon = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		System.out.println("Total income is " + (sal+bon));
	}    
}
