package com.training.rakuten;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
interface TimeProvider {
	Calendar getTime();

	boolean isMorning();
}
class HelloRedesigned {

	private TimeProvider timeProvider;

	public HelloRedesigned(TimeProvider timeProvider) {
			this.timeProvider = timeProvider;
	}

	public String sayHello() {
		Calendar current = timeProvider.getTime();
		if (current.get(Calendar.HOUR_OF_DAY) < 12) {
			return "Good Morning!";
		} else {
			return "Good Afternoon!";
		}
	}
}
public class HelloRedesignedTest {

	private HelloRedesigned hello;
	private TimeProvider timeProvider;

	@BeforeEach
	public void setUp() {
		timeProvider = mock(TimeProvider.class);
		hello = new HelloRedesigned(timeProvider);
	}

	private static final Object[] morningHours() {
		Object[] hours =  {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		return hours;
	}

	//@Test
	@ParameterizedTest(name  = "morningHours")
	public void shouldSayGoodMorningInTheMorning(int morningHour) {
		when(timeProvider.getTime()).thenReturn(getCalendar(morningHour));
		assertEquals("Good Morning!", hello.sayHello());
	}

	private static final Object[] afternoonHours() {
		Object[] hours = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
		return hours;
	}

	//@Test
	@ParameterizedTest(name  = "afternoonHours")
	public void shouldSayGoodAfternoonInTheAfternoon(int afternoonHour) {
		when(timeProvider.getTime()).thenReturn(getCalendar(afternoonHour));
		assertEquals("Good Afternoon!", hello.sayHello());
	}

	private Calendar getCalendar(int hour) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, hour);
		return cal;
	}
}