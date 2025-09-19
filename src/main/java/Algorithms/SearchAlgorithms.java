package Algorithms;

public class SearchAlgorithms {

	// Lenear Search
	public static void lenearSearch(int[] input, int target) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == target) {
				System.out.println("Value found at index " + i);
				break;
			}
		}
	}

	// binary Search
	public static int binarySearch(int[] input, int target) {
		int left = 0;
		int right = input.length;
		int mid = 0;
		int size = input.length;
		while (left <= right) {
			mid = (left + right) / 2;
			if (target == input[mid]) {
				return mid;
			} else if (input[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 4, 5, 6, 7, 8, 9 };
		lenearSearch(input, 6);
		System.out.println(binarySearch(input, 6));

	}

}
