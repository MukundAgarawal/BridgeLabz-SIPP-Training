package Arrays;

import java.util.Scanner;

public class digit_freq {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
//		int[]age = new int[3];
//		for(int i = 0; i < 3; i++) age[i] = sc.nextInt();
		
		int[]arr = new int[10];
		while(n > 0) {
			int rem = n%10;
			arr[rem]++;
			n /= 10;
		}
		
		for(int i = 0; i < 10; i++) System.out.print(i + " freq - " + arr[i]);
	}    
}
