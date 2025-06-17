package Arrays;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		String s = sc.next();
		int[]arr = new int[s.length()];
		int j = s.length()-1;
		for(int i = 0; i < s.length(); i++) arr[j--] = s.charAt(i);
		for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);
	}
}
