package com.slksoft.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MathUtilsTest {
	
	@Test
	public void testFactorialPositive(){
		long expected=120;
		long actual=MathUtils.factorial(5);
		assertEquals(expected,actual);
	}
	public void testFactorialNegative(){
		long expected=-120;
		long actual=MathUtils.factorial(-5);
		assertEquals(expected,actual);
	}
}
