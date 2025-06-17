package Arrays;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int[]arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] >= 18) System.out.println("can vote");
			else System.out.println("no vote");
		}
	}
}
