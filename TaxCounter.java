
public class TaxCounter {

	public static void main(String[] args) {
		double income = 1000;
		counter(income);
	}

	private static double counter(double inc) {
		if (inc > 1000) {
			inc = inc - ((inc - 1000) / 100 * 17);
			System.out.println(inc);
			return inc;
		} else {
			System.out.println(inc);
			return inc;
		}
	}

}
