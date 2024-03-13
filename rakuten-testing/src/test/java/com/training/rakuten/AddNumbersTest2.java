package com.training.rakuten;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddNumbersTest2 {
	AddNumbers addNumbers;
	int expected=0;
	int actual=0;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all the tests");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("All the tests finished ");
	}
	@BeforeEach
	void setUp() throws Exception {
		addNumbers = new AddNumbers();
		expected = 10;
		System.out.println("##Before each called");
	}
	@AfterEach
	void tearDown() throws Exception {
		addNumbers = null;
		expected = 0;
		System.out.println("###After each called");
	}
	@Test
	void testSum1() {
		System.out.println("testsum1 called");
		actual  = addNumbers.sum(5, 5);
		assertEquals(expected, actual);
	}

	@Test
	void testSum2() {
		System.out.println("testsum2 called");
		actual  = addNumbers.sum(3, 7);
		assertEquals(expected, actual);
	}
}
