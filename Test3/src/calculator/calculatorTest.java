package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calculatorTest {
	calculator calc;

	@BeforeEach
	void setUp() throws Exception {
		calc =new calculator();
	} 

	@Test
	void testAddIntInt() {
		assertEquals(10,calc.add(3,7));
	}

	@Test
	void testAddStringString() {
		assertEquals("apple",calc.add("app", "le"));
	}

}
