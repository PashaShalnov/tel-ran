
public class HWArraySort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray(arr, 10, 99);
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int temp = arr[i];
				if (arr[j] < temp) {
					arr[i] = temp;
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
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
