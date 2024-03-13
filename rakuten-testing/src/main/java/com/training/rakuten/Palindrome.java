package com.training.rakuten;

public class Palindrome {
	public boolean checkpalindrome(String word) {
		String reverseStr = "";

		int strLength = word.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + word.charAt(i);
		}

		if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
			return true;
		} 
		else {
			return false;
		}
	}
}
