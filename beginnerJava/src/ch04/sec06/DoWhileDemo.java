package ch04.sec06;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		String inputString;
	
		do {
			inputString = inScanner.nextLine();
			System.out.println(inputString);	
		} while(!inputString.equals("q"));
	}

}
