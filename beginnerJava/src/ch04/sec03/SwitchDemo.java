package ch04.sec03;

public class SwitchDemo {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 10) + 1;
		
		switch (number) {
		case 1: {
			System.out.print("1");
			break;
		}
		case 2: {
			System.out.print("2");
			break;
		}
		case 3: {
			System.out.print("3");
			break;
		}
		case 4: {
			System.out.print("4");
			break;
		}
		default:
			System.out.print("5~10");
			break;
		}
			
	}

}
