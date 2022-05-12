
public class TaxCounter {

	public static void main(String[] args) {
		double income = 1150;
		double tax = taxCounter(income);
		System.out.println(tax);

	}

	private static double taxCounter(double inc) {
		double tax = 0;
		if (inc > 1000) {
			tax = ((inc - 1000) / 100 * 17);
		}
			return tax;
	}
}

