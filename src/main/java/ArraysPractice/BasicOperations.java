package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class BasicOperations {

	/**
	 * Print Array
	 * 
	 * @param input array
	 */
	public static void printArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	/**
	 * Finding Largest Value in an array
	 * 
	 * @param input array
	 * @return max value
	 */
	public static int findMax(int[] input) {
		int max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

	/**
	 * Finding Smallest Value in an array
	 * 
	 * @param input array
	 * @return min value
	 */
	public static int findMin(int[] input) {
		int min = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			}
		}
		return min;
	}

	/**
	 * Finding Reversed Array
	 * 
	 * @param input array
	 * @return Reversed array
	 */
	public static int[] reverseArray1(int[] input) {
		int output[] = new int[input.length];
		int j = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			output[j] = input[i];
			j++;
		}
		return output;
	}

	/**
	 * Finding Reversed Array
	 * 
	 * @param input array
	 * @return
	 * @return Reversed array
	 */
	public static void reverseArray2(int[] input) {
		int left = 0;
		int right = input.length - 1;
		while (left < right) {
			int temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			left++;
			right--;
		}
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	/**
	 * Finding Sum of Given Array
	 * 
	 * @param input array
	 * @return Reversed array
	 */
	public static int findingSum(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}
		return sum;
	}

	/**
	 * Finding Average of Given Array
	 * 
	 * @param input array
	 * @return Reversed array
	 */
	public static double findingAverage(int[] input) {
		double avg = 0;
		int size = input.length;
		int sum = findingSum(input);
		avg = sum / size;
		return avg;
	}

	/**
	 * Finding Average of Given Array
	 * 
	 * @param input array
	 * @return Reversed array
	 */
	public static void sortArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
	}

	/**
	 * Finding Pair with Given Sum
	 * 
	 * @param input array
	 * @return Reversed array
	 */
	public static boolean findingPair(int[] input, int target) {
		boolean status = false;
		int left = 0;
		int right = input.length - 1;
		sortArray(input);
		while (left < right) {
			int sum = input[left] + input[right];
			if (sum == target) {
				status = true;
				break;
			} else if (sum < target) {
				left++;
			} else if (sum > target) {
				right--;
			}
		}
		return status;
	}

	/**
	 * Move Zeros to end
	 * 
	 * @param input array
	 * 
	 */
	public static void moveZerosToEnd(int[] arr) {
		int nonZeroIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[nonZeroIndex];
				arr[nonZeroIndex] = temp;
				nonZeroIndex++;
			}
			printArray(arr);
			System.out.println();
		}
	}

	/**
	 * Rotate an array Use a pointer nonZeroIndex to track the next position for
	 * non-zero elements. Traverse the array, and whenever a non-zero is
	 * encountered, swap it with the element at nonZeroIndex and increment
	 * nonZeroIndex.
	 * 
	 * @param arr         input array
	 * @param rotatecount is how many rotations
	 * 
	 */
	public static void rotateArray(int[] arr, int rotatecount) {

		while (rotatecount > 0) {
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
			rotatecount--;
		}
		printArray(arr);
	}
	// ========================================================================

	// Array to other Data type conversions

	/**
	 * Array to String Conversion
	 * 
	 * @param input
	 */
	public static void arraytoStringConversion(String[] input) {
		String output = Arrays.toString(input);
		System.out.println("The converted array is >> " + output);
		// =============

		String output1 = String.join("_", input);
		System.out.println("The converted array is >> " + output1);
	}

	/**
	 * Array to List Conversions
	 * 
	 * @param input
	 */
	public static void arraytoListConversion(String[] input) {
		// method1
		List<String> output = Arrays.asList(input);
		for (String value : output) {
			System.out.print(value + " ");
		}
		// method2
		List<String> output1 = new ArrayList<String>();
		Collections.addAll(output1, input);
		for (String value : output1) {
			System.out.println(value + " ");
		}
	}

	/**
	 * Array to Set Conversions
	 * 
	 * @param input
	 */
	public static void arraytoSetConversion(String[] input) {
		// method1
		Set<String> output = new HashSet<String>(Arrays.asList(input));

		Iterator<String> data = output.iterator();
		while (data.hasNext()) {
			System.out.println(data.next());
		}

	}
	//

	/**
	 * Convert Array to Streams
	 * 
	 * @param input
	 */
	public static void arraytoStreamConversion(String[] input) {
		Stream<String> output = Arrays.stream(input);
		output.forEach(System.out::println);
	}

	public static void main(String[] args) {
		// int[] input = { 1, 2, 3, 6, 8, 9, 4, 5};

		// int[] input = { 0, 1, 0, 3, 12 };

		String[] input1 = { "Shiva", "Kumar", "Gowtham" };

		// System.out.println("Max Value of given array is >>> " + findMax(input));
		// System.out.println("Min Value of given array is >>> " + findMin(input));
		// reverseArray2(input);
		// System.out.println("Sum of given array is >>> " + findingSum(input));
		// System.out.println("Average of given array is >>> " + findingAverage(input));
		// findingPair(input, 6);
		// moveZerosToEnd(input);
		// rotateArray(input, 3);
		// arraytoStringConversion(input1);
		// arraytoListConversion(input1);
		// arraytoSetConversion(input1);
		arraytoStreamConversion(input1);

	}

}
