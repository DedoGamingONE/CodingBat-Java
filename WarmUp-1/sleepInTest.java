import static org.junit.Assert.*;

import org.junit.Test;

public class sleepInTest {
	@Test
	public void test1() {
		sleepIn tester = new sleepIn();
		assertEquals(tester.sleepIn(false, false), true);
	}

	@Test
	public void test2() {
		sleepIn tester = new sleepIn();
		assertEquals(tester.sleepIn(true, false), false);
	}
	
	@Test
	public void test3() {
		sleepIn tester = new sleepIn();
		assertEquals(tester.sleepIn(false, true), true);
	}
}
