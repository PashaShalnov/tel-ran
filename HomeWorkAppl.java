
public class HomeWorkAppl {

	public static void main(String[] args) {
		leumi(3);
		scheduler(14);
	}
	
	public static void leumi(int day) {
		//http://www.bankleumi.co.il/vgnprod/branchSearchMaps/bsDetails.asp?hdBranchCode=932
		
		switch (day) {
		
		case 1:
			System.out.println("יום א: מ-08:30 עד 13:30");
			break;
		case 2: 
			System.out.println("יום ב: מ- 08:30 עד 13:00 ,מ-16:00 עד 18:00");
			break;
		case 3: 
			System.out.println("יום ג: מ-08:30 עד 13:30");
			break;
		case 4: 
			System.out.println("יום ד: מ-08:30 עד 13:00 ,מ-16:00 עד 18:00");
			break;
		case 5: 
			System.out.println("יום ה: מ-08:30 עד 13:30");
			break;
		case 6: 
			System.out.println("יום ו: סגור");
			break;
		case 7: 
			System.out.println("יום ז: סגור");
			break;
		default: 
			System.out.println("Error");
		}	
	}

	public static void scheduler(int week) {
	
		int amountOfWeeks = 52;
		
		if (week > amountOfWeeks) {
			System.out.println("Error!");
			return;
		} 
		if (week % 4 == 3)  {
			System.out.println("Tigran");
			return;
		}
		if (week % 2 == 1) {
			System.out.println("John");
			return;
		}
		if (week % 4 == 0) {
			System.out.println("Mary");
			return;
		} else {
			System.out.println("Peter");
			return;
		}
		
		/*
		 * John 1,5,9,13,17,21,25,29,33,37,41,45,49 
		 * Peter 2,6,10,14,18,22,26,30,34,38,42,46,50 
		 * Tigran 3,7,11,15,19,23,27,31,35,39,43,47,51 
		 * Mary 4,8,12,16,20,24,28,32,36,40,44,48,52 
		 */
	}
}