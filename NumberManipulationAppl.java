
public class NumberManipulationAppl {

	public static void main(String[] args) {
		int res = countDigits(123);
		System.out.println("Count digits = " +res); //3
		res = countDigits(8);
		System.out.println("Count digits = " +res); //1
		res = countDigits(0);
		System.out.println("Count digits = " +res); //1
		luckyNumber(173854); // 1 + 3 + 5 != 7 + 8 + 4 - unlucky
		luckyNumber(1738649); // 1 + 3 + 6 + 9 == 7 + 8 + 4 - lucky
	}
	
	public static void luckyNumber(int num) {
		int odd = 0;
		int even = 0;
		
		while (num > 0) {
			odd = odd + num % 10;
			num = num / 10;
			
			even = even + num % 10;
			num = num / 10;
		}
		
		if (even == odd) {
			System.out.println("This is the lucky tiket"); //1
		} else {
			System.out.println("This is the unlucky tiket"); //1
		}
	}
	
	public static int countDigits(int num) {
		int i = 0;
		if (num == 0) {
			return 1;
		}
		while (num > 0) {
			num = num / 10;
			i++;
		}
		return i;
	}
}
