import java.util.Scanner;

public class weight_convert {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextInt();
//		int s2 = sc.nextInt();
//		int s3 = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		System.out.println("The weight of the person in pounds is " + (w*2.2) + "  and in kg is " + w);
	}
}
