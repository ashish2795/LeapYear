package com.leapYear;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYeartest {

	@Test
	public void YearIsLeaptest() {		
		 int year=2020;
		 boolean actual = LeapYear.leap(year);
		 assertTrue(actual);
	}
	
	@Test
	public void YearIsNotLeaptest() {
				
		 int year=2019;
		 boolean actual = LeapYear.leap(year);
		 assertFalse(actual);
	}
}
