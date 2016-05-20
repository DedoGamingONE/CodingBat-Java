import static org.junit.Assert.*;

import org.junit.Test;

public class in1020Test {

	@Test
	public void test1() {
		in1020 tester = new in1020();
		assertEquals(tester.in1020(12, 99), true);
	}

	@Test
	public void test2() {
		in1020 tester = new in1020();
		assertEquals(tester.in1020(21, 12), true);
	}

	@Test
	public void test3() {
		in1020 tester = new in1020();
		assertEquals(tester.in1020(8, 99), false);
	}
}
