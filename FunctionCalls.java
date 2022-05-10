
public class FunctionCalls {

	public static void main(String[] args) {
		six();
		one();
		two();
	}

	private static void one() {
		four();
	}
	
	private static void two() {
		six();
	}

	private static void three() {
	}

	private static void four() {
		five();
	}

	private static void five() {
		six();
	}

	private static void six() {
	}

}


// 3 не запускает ни одного метода, ее же ничего не запускает
// main запускает 3 метода