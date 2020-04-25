package com.leapYear;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYeartest {

	@Test
	public void YearIsLeaptest() {
		
		 leapYear y=new leapYear();
		 int year=2020;
		 boolean actual=y.leap(year);
		 assertTrue(actual);
	}

}
