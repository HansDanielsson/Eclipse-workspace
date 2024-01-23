package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junittest.Testclass;

class TestclassTest {

	public static Testclass ts;

	@BeforeAll
	static void setUpBeforeClass() {
		ts = new Testclass();
	}

	@Test
	void testAcelerate() {
		assertEquals(20, ts.acelerate(ts.talet));
	}

}
