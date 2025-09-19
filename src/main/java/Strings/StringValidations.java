package Strings;

import java.util.HashSet;
import java.util.Set;

public class StringValidations {
	public static void reverseString(String input) {
		// ============================================
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse().toString());
		// ============================================
		int i = input.length() - 1;
		String output = "";
		while (i >= 0) {
			output = output + input.charAt(i);
			i--;
		}

		System.out.println(output);
	}

	public static void subStringReverse(String input) {
		String firstHalf = input.substring(0, input.length() / 2);
		String secondHalf = input.substring(input.length() / 2, input.length());
		System.out.println("first Half >>> " + firstHalf);
		System.out.println("Second Half >>> " + secondHalf);
		StringBuilder sb = new StringBuilder(firstHalf);
		System.out.println("Overall Word with first Half Reversed " + sb.reverse().toString() + secondHalf);

	}

	public static void longestSubString(String input) {
		int left = 0;
		int max = 0;
		int startindex = 0;
		Set<Character> setdata = new HashSet<Character>();

		for (int right = 0; right < input.length(); right++) {
			if (setdata.contains(input.charAt(right))) {
				setdata.remove(input.charAt(left));
				left++;
			}
			setdata.add(input.charAt(right));
			// max = Math.max(max, right-left+1);
			if (right - left + 1 > max) {
				max = right - left + 1;
				startindex = left;
			}
		}
		System.out.println(max);
		System.out.println(input.substring(startindex, startindex + max));
	}

	public static void commonPrefix(String[] input) {

	}

	public static void main(String[] args) {

		longestSubString("abcbbc");
		commonPrefix(new String[] { "abc", "ab", "a" });
	}

}
