
public class ArrayAdvAppl {

	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray(arr, -99, 99);
		printArray(arr);
		int res = sumArray(arr);

		res = min(arr);
		System.out.println("Min = " + res);
		res = indexOfMin(arr);
		System.out.println("Index of min = " + res);
		reverseArray(arr);
		printArray(arr);

		System.out.println();
		System.out.println("\tabove is homework");
		System.out.println("\t********************");
		System.out.println("\tbelow is inclass");
		System.out.println();
		double avrg = avrg(arr);
		System.out.println(avrg);
		res = max(arr);
		System.out.println("Max = " + res);
		res = search(arr, 42);
		System.out.println("Index = " + res);
	}

	// TODO homework is below

	public static int min(int[] arr) {
		int res = arr[0];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < res) {
				res = arr[j];
			}
		}
		return res;
	}

	public static int indexOfMin(int[] arr) {
		int min = min(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				return i;
			}
		}
		return -1;
	}

	public static void reverseArray(int[] arr) {
		int[] temp = new int[arr.length];
		int f = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[f] = arr[i];
			f++;
		}
		for (int i = 0; i <= temp.length - 1; i++) {
			arr[i] = temp[i];
		}
	}

	// TODO homework is above

	public static int search(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	private static int max(int[] arr) {
		int res = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > res) {
				res = arr[i];
			}
		}
		return res;
	}

	public static int sumArray(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res += arr[i];
		}
		return res;
	}

	public static double avrg(int[] arr) { // найти среднее арифметическое
		// return 1. * sumArray(arr) / arr.length
		double res = 0;
		for (int i = 0; i < arr.length; i++) {
			res += arr[i];
		}
		res /= arr.length;
		return res;
	}

	private static void fillArray(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (min + Math.random() * (max - min + 1));
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
