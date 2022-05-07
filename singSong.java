
public class singSong {
	public static void main(String[] args) {
		System.out.println("Come as you are, as you were\n"
				+ "As I want you to be\n"
				+ "As a friend, as a friend\n"
				+ "As an old enemy\n"
				+ "Take your time, hurry up\n"
				+ "Choice is yours, don't be late\n"
				+ "Take a rest as a friend\n"
				+ "As an old memoria\n");
		
		refrain();
		
		var secondCouplet = "Come doused in mud, soaked in bleach\n"
				+ "As I want you to be\n"
				+ "As a trend, as a friend\n"
				+ "As an old memoria\n";
		System.out.println(secondCouplet); 
		
		refrain();
	}
		
	
	public static void refrain() {
		var string = "Memoria\n";
		System.out.println(string.repeat(3)); 
	}
}