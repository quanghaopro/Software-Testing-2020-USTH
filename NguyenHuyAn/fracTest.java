package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.fraction;

class fracTest {

	@Test
	void testFraction() {
		fraction ps = new fraction();
		assertEquals(1, ps.getT());
		assertEquals(2, ps.getM());
	}

}
