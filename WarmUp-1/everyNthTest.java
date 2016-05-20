import static org.junit.Assert.*;

import org.junit.Test;

public class everyNthTest {

	@Test
	public void test1() {
		everyNth tester = new everyNth();
		assertEquals(tester.everyNth("Miracle", 2), "Mrce");
	}

	@Test
	public void test2() {
		everyNth tester = new everyNth();
		assertEquals(tester.everyNth("abcdefg", 2), "aceg");
	}

	@Test
	public void test3() {
		everyNth tester = new everyNth();
		assertEquals(tester.everyNth("abcdefg", 3), "adg");
	}
}