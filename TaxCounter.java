
public class TaxCounter {

	public static void main(String[] args) {
		double income = 5000;
		counter(income);
	}

	private static double counter(double inc) {
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
