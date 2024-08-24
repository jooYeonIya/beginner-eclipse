package ch04.sec02;

public class IfElseDemo {

	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.print("90보다 큼");
		} else if (score >= 80) {
			System.out.print("80보다 큼");
		} else if (score >= 70) {
			System.out.print("70보다 큼");
		} else {
			System.out.print("70보다 작");
		}
	}

}
