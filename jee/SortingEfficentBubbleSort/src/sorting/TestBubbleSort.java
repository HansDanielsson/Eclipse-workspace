package sorting;

public class TestBubbleSort {

	/* This is the algorithm from the video */
	public static void bubbleSort(int[] a) {
		int n = a.length;
		int numIter = 0;
		int nSwaps = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				numIter++;
				if (a[j - 1] > a[j]) {
					nSwaps++;
					swap(a, j - 1, j);
				}
			}
		}
		System.out.println("Num iterations: " + numIter + " Num Swaps: " + nSwaps);
	}

	/* Implement this algorithm */
	public static void bubbleSortMoreOptimized(int[] a) {
		int n = a.length;
		int lastSwap = n;
		int numIter = 0;
		int nSwaps = 0;
		for (int i = 0; i < lastSwap; i++) {
			for (int j = 1; j < (n - i); j++) {
				numIter++;
				if (a[j - 1] > a[j]) {
					lastSwap = j + 1;
					nSwaps++;
					swap(a, j - 1, j);
				}
			}
		}
		System.out.println("Num iterations: " + numIter + " Num Swaps: " + nSwaps);
	}

	private static void swap(int[] a, int pos1, int pos2) {
		int tmp = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = tmp;
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("**********************************************");
		int[] array = { 7, 5, 1, 2, 3, 6, 4 };

		System.out.print("\t\t\tUnsorted Array: ");
		print(array);

		System.out.print("Traditional Bubble Sort: ");
		bubbleSort(array);
		System.out.print("\t\t\tFinal Output Bubble Sort: ");
		print(array);

		System.out.println("**********************************************");

		array = new int[] { 2, 3, 4, 1, 5, 6, 7 };
		System.out.print("\t\t\tUnsorted Array: ");
		print(array);

		System.out.print("Traditional Bubble Sort: ");
		bubbleSort(array);
		System.out.print("\t\t\tFinal Output Bubble Sort: ");
		print(array);

		System.out.println("**********************************************");

		array = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("\t\t\tSorted Array: ");
		print(array);

		System.out.print("Traditional Bubble Sort: ");
		bubbleSort(array);
		System.out.print("\t\t\tFinal Output Bubble Sort: ");
		print(array);

		System.out.println("**********************************************");
		array = new int[] { 7, 5, 1, 2, 3, 6, 4 };

		System.out.print("\t\t\tUnsorted Array: ");
		print(array);

		System.out.print("Optimized Bubble Sort: ");
		bubbleSortMoreOptimized(array);
		System.out.print("\t\t\tFinal Output Bubble Sort: ");
		print(array);

		System.out.println("**********************************************");

		array = new int[] { 2, 3, 4, 1, 5, 6, 7 };
		System.out.print("\t\t\tUnsorted Array: ");
		print(array);

		System.out.print("Optimized Bubble Sort: ");
		bubbleSortMoreOptimized(array);
		System.out.print("\t\t\tFinal Output Bubble Sort: ");
		print(array);

		System.out.println("**********************************************");

		array = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("\t\t\tSorted Array: ");
		print(array);

		System.out.print("Optimized Bubble Sort: ");
		bubbleSortMoreOptimized(array);
		System.out.print("\t\t\tFinal Output Bubble Sort: ");
		print(array);
	}
}