
public class TaxCounter {

	public static void main(String[] args) {
		double income = 5000;
		taxCounter(income);
	}

	private static double taxCounter(double inc) {
		double tax = 0;
		if (inc > 1000) {
			tax = ((inc - 1000) / 100 * 17);
			System.out.println(tax);
			return tax;
		} else {
			tax = 0;
			System.out.println(tax);
			return tax;
		}
	}

}
