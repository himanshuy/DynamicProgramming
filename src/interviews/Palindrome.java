package interviews;

import java.util.Arrays;

/**
 * Find if two strings are palindrome
 *
 */

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("god", "dog"));
	}
	
	public static boolean isPalindrome(String str1, String str2) {
		String a = sort(str1);
		String b = sort(str2);
		return a.equals(b);
	}
	
	private static String sort(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

}
