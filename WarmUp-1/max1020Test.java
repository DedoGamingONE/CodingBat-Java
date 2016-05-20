import static org.junit.Assert.*;

import org.junit.Test;

public class max1020Test {

	@Test
	public void test1() {
		max1020 tester = new max1020();
		assertEquals(tester.max1020(11, 19), 19);
	}

	@Test
	public void test2() {
		max1020 tester = new max1020();
		assertEquals(tester.max1020(19, 11), 19);
	}

	@Test
	public void test3() {
		max1020 tester = new max1020();
		assertEquals(tester.max1020(11, 9), 11);
	}
}
