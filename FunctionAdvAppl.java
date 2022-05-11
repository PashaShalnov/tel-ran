
public class FunctionAdvAppl {

	public static void main(String[] args) {
		double res = 0;
		res = pi();
		System.out.println(res);
		printPi(res);
		res = circleLength(10);
		System.out.println(res);
		res = max(50, 55);
		System.out.println(res);
		res = abs(-10);
		System.out.println(res);
		
		//START OF HOME WORK
		
		res = min(50,6);
		System.out.println(res); //expected 6.

		res = min2(50,6);
		System.out.println(res);
	}
	
	public static double min(int x, int y) {
		double z = x < y ? x : y;
		return z;
	}	
	
	public static double min2(int x, int y) {
		double temp = - max(- x, - y);
		return temp;
	}
	
	// END OF HOME WORK
	
	public static double abs(double x) {
		return x >= 0 ? x : -x;
	}
	
	public static void printPi(double res) {
		System.out.println(res);
	}
	
	public static double pi(){ //double - is what the function returns 
		return 3.1415926;
	}
	
	public static double circleLength(double radius) {
		double res = 2 * pi() * radius;
		return res;
	}

	public static double max(double x, double y) {

		return (x > y) ? x : y;
	}

}
