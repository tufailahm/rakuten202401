package com.bms.raukten.client;

public class Exercise {
	static String demo  = "The quick brown fox jumps over the lazy dog";
	
	//question 1
	public static void printCharAtIndex(int i) {
		System.out.println(demo.charAt(i));
	}
	
	//question 2
	public static boolean wordIsPresent(String word) {
		return demo.contains(word);
	}
	
	//question 3
	public static void addString(String s) {
		StringBuilder sb = new StringBuilder(demo);
		demo = sb.append(s).toString();
	}
	
	//question 4
	public static boolean endsWith(String s) {
		return demo.endsWith(s);
	}
	
	//question 5 & 6
	public static boolean isEqual(String s) {
		return demo.equals(s);
	}
	
	//question 7
	public static int length(String s) {
		return s.length();
	}
	
	//question 8
	public static boolean isMatch(String s) {
		return demo==s;
	}
	
	//question 9
	public static void replace(String s) {
		demo.replace("The", s);
	}
	
	//question 10
	public static void split() {
		StringBuilder sb = new StringBuilder();
		String s1[] = demo.split("over");
		for(String temp:s1) {
			System.out.println(temp);
		}
	}
	
	//question 11
	public static void printAnimalNames() {
		
	}
	
	//question 12
	public static String toLower(String s) {
		return s.toLowerCase();
	}
	
	//question 13
	public static String toUpper(String s) {
		return s.toUpperCase();
	}
	
	//question 14
	public static int positionOfChar(char c) {
		return demo.indexOf(c);
	}
	
	//question 15
	public static int lastIndexOfChar(char c) {
		return demo.lastIndexOf(c);
	}
	
	//main
	public static void main(String[] args) {
		addString(" and killed it");
		System.out.println(demo);
	}

}
