package ch04.sec07;

public class BreakDemo {

	public static void main(String[] args) {
		while (true) {
			int number = (int)(Math.random() * 6) + 1;
			System.out.println(number);
			
			if (number == 6) {
				break;
			}
		}
		
		System.out.println("종료");

	}

}
