package com.training.rakuten;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
//Prajwal
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class AddNumbersTest {

	
	@Test
	@DisplayName("3. adding 5 and 5")
	@Order(3)
	public void testSum1() {
		int expected = 10;
		AddNumbers addNumbers = new AddNumbers();
		int actual = addNumbers.sum(5,5);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("1. adding 2 and 8")
	@Order(1)
	public void testSum2() {
		int expected = 10;
		AddNumbers addNumbers = new AddNumbers();
		int actual = addNumbers.sum(2,8);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("2. testing negative with whole numer -2 and 12")
	@Order(2)
	public void asum3() {
		int expected = 10;
		AddNumbers addNumbers = new AddNumbers();
		int actual = addNumbers.sum(-2,12);
		assertEquals(expected, actual);
	}
}
