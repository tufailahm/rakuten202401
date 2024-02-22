package com.bms.rakuten.client;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class HandsOn1 {

	public static void main(String[] args) {

		Integer num[] = new Integer[5];

		List<Integer> nums = new Vector<Integer>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int x = sc.nextInt();
			num[i] = x;
//			nums.add(x);
		}

		nums = Arrays.asList(num);

		System.out.println("Min element is " + Collections.min(nums));
	}

}