package Arrays;

import java.util.Scanner;

public class age_height {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int[]age = new int[3];
		int[]height = new int[3];
		for(int i = 0; i < 3; i++) age[i] = sc.nextInt();
		for(int i = 0; i < 3; i++) height[i] = sc.nextInt();
		int a = 0 , h = 0;
		for(int i = 1; i < 3; i++) if(age[i] > age[a]) a = i;
		for(int i = 1; i < 3; i++) if(height[i] > height[h]) h = i;
		System.out.println(a + " " + h);
	}
}
