package ch04.sec02;

public class IfNestedDemo {

	public static void main(String[] args) {
		int score = 85;
	
		
		if (score >= 90) {
			System.out.print("90보다 큼");
			if (score >= 95) {
				System.out.println("A+");
			}
		} else if (score >= 80) {
			System.out.print("80보다 큼");
			if (score >= 85) {
				System.out.println("B+");
			}
		} else if (score >= 70) {
			System.out.print("70보다 큼");
			if (score >= 75) {
				System.out.println("C+");
			}
		} else {
			System.out.print("70보다 작음");
			if (score >= 65) {
				System.out.println("D+");
			}
		}
	}

}
