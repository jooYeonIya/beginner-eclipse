package ch04.sec02;

public class RandomNumber {

	public static void main(String[] args) {
		double number1 = Math.random();
		System.out.println(number1);
		
		int number2 = (int) (Math.random() * 6);
		System.out.println(number2);
		
		int number3 = (int) (Math.random() * 6)+ 1;
		System.out.println(number3);
	}

}
