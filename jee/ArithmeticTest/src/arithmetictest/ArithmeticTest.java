package arithmetictest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arithmetic.Arithmetic;

class ArithmeticTest {

	@Test
	void testMultiply() {
		assertEquals(4, Arithmetic.multiply(2, 2));
		assertEquals(-15, Arithmetic.multiply(3, -5));
	}

	@Test
	void testIsPositive() {
		assertTrue(Arithmetic.isPositive(5));
		assertFalse(Arithmetic.isPositive(-5));
		assertFalse(Arithmetic.isPositive(0));
	}

}
