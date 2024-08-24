package ch02.sec13;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		System.out.println(str);
		
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println(x + y);
	}
}
