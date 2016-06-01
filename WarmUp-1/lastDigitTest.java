import static org.junit.Assert.*;

import org.junit.Test;

public class lastDigitTest {

	@Test
	public void test1() {
		lastDigitLogic tester = new lastDigitLogic();
		assertEquals(tester.lastDigit(7, 17), true);
	}

	@Test
	public void test2() {
		lastDigitLogic tester = new lastDigitLogic();
		assertEquals(tester.lastDigit(6, 17), false);
	}
	
	@Test
	public void test3() {
		lastDigitLogic tester = new lastDigitLogic();
		assertEquals(tester.lastDigit(3, 113), true);
	}
}
