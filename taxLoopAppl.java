
public class taxLoopAppl {

	public static void main(String[] args) {
		double tax = calcTaxIsrael(50000, 0); // previous version
		System.out.println("Tax Israel = " + tax);
		double tax2 = calcTaxIsrael2(50000, 0); // new version (advanced)
		System.out.println("Tax Israel 2 = " + tax2);
		double netto = salaryNetto(120000, 2.75);
		System.out.println("Salary Netto = " + netto);
	}

	public static double calcTaxIsrael2(double salary, double taxAllowance) {
		double[] salaryRange = { 0., 6450., 9240., 14840., 20620., 42910. };
		double[] taxes = { 0.1, 0.14, 0.2, 0.31, 0.35, 0.47 };
		double res = -taxAllowance * 223;
		;

		for (int i = 0; i < salaryRange.length - 1; i++) {
			if (salary >= salaryRange[i] && salary < salaryRange[i + 1]) {
				res = res + (salary - salaryRange[i]) * taxes[i];
				return res >= 0 ? res : 0;
			} else
				res = res + (salaryRange[i + 1] - salaryRange[i]) * taxes[i];
		}
		res = res + (salary - salaryRange[salaryRange.length - 1]) * taxes[taxes.length - 1];
		return res >= 0 ? res : 0;
	}

	public static double calcTaxIsrael(double salary, double taxAllowance) {
		double res = -taxAllowance * 223;
		if (salary >= 0 && salary < 6450) {
			res = res + (salary - 0) * 0.1;
			return res >= 0 ? res : 0;
		} else {
			res = res + (6450 - 0) * 0.1;
		}
		if (salary >= 6450 && salary < 9240) {
			res = res + (salary - 6450) * 0.14;
			return res >= 0 ? res : 0;
		} else {
			res = res + (9240 - 6450) * 0.14;
		}
		if (salary >= 9240 && salary < 14840) {
			res = res + (salary - 9240) * 0.2;
			return res >= 0 ? res : 0;
		} else {
			res = res + (14840 - 9240) * 0.2;
		}
		if (salary >= 14840 && salary < 20620) {
			res = res + (salary - 14840) * 0.31;
			return res >= 0 ? res : 0;
		} else {
			res = res + (20620 - 14840) * 0.31;
		}
		if (salary >= 20620 && salary < 42910) {
			res = res + (salary - 20620) * 0.35;
			return res >= 0 ? res : 0;
		} else {
			res = res + (42910 - 20620) * 0.35;
		}
		res = res + (salary - 42910) * 0.47;
		return res >= 0 ? res : 0;
	}

	public static double salaryNetto(double salary, double taxAllowance) {
		return salary - calcTaxIsrael(salary, taxAllowance);
	}
}
