import static org.junit.Assert.*;

import org.junit.Test;

public class stringTimesTest {

	@Test
	public void test1() {
		stringTimes tester = new stringTimes();
		assertEquals(tester.stringTimes("Hi", 2), "HiHi");
	}

	@Test
	public void test2() {
		stringTimes tester = new stringTimes();
		assertEquals(tester.stringTimes("Hi", 3), "HiHiHi");
	}

	@Test
	public void test3() {
		stringTimes tester = new stringTimes();
		assertEquals(tester.stringTimes("Hi", 1), "Hi");
	}
}
