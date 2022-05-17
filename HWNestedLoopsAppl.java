
public class HWNestedLoopsAppl {

	public static void main(String[] args) {
		figure1(8);
		System.out.println();
		figure2(12);
	}

	public static void figure1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= i) {
				System.out.print("*");
				} else {
					System.out.print("");
				}
				
				}
			System.out.println();
		}
}
	
	public static void figure2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= i && j < n - i) {
				System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
				}
			System.out.println();
		}
}
	
}
