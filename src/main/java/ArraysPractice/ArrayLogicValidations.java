package ArraysPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayLogicValidations {
	public static int findpositiveIntegerMissing(int[] input) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int num : input) {
			if (num > 0)
				set.add(num);
		}
		int smallest = 1;

		while (true) {
			if (!set.contains(smallest)) {
				return smallest;
			}
			smallest++;
		}

	}

	public static void movezeros(int[] input) {
		int index = 0;
		for (int i : input) {
			if (i != 0) {
				input[index] = i;
				index++;
			}
		}
		while (index < input.length) {
			input[index] = 0;
			index++;
		}
		System.out.println(java.util.Arrays.toString(input));

	}

	public static void findRepeated(int[] input) {
		HashMap<Integer, Integer> out = new HashMap<Integer, Integer>();

		for (int i : input) {
			out.put(i, out.getOrDefault(i, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : out.entrySet()) {
			System.out.println(entry.getKey() + "...." + entry.getValue());
		}

	}

	public static int[] sumoftwo(int[] input, int target) {

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == target) {
					System.out.println("first index" + i);
					System.out.println("second index" + j);
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	public static int[] rotateArray(int[] input, int rotateCount) {

		while (rotateCount > 0) {
			int value = input[0];
			for (int i = 0; i < input.length - 1; i++) {
				input[i] = input[i + 1];
			}
			input[input.length - 1] = value;
			rotateCount--;
		}
		for (int val : input) {
			System.out.print(val);
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
