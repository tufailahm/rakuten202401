package com.bms.raukten.client;

import java.util.Scanner;

import com.bms.raukten.exception.InvalidAgeException;

public class Agevalidator {

	int age;
	Scanner scanner = new Scanner(System.in);
	public Agevalidator() {
		// TODO Auto-generated constructor stub
	}

	public void checkValidInput() {
		
		System.out.println("Enter  your age to verify : ");
		age = scanner.nextInt();
		
		if(age > 18) {
			System.out.println("You are a valid voter. Thank You.");
		}
		else {
			throw new InvalidAgeException("Error !!! You are not allowed to vote as you are under aged");
		}
	}
	public static void main(String[] args) {
		
		Agevalidator v = new Agevalidator();
		
		try {
			v.checkValidInput();
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
