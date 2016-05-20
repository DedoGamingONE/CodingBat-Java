import static org.junit.Assert.*;

import org.junit.Test;

public class in3050Test {

	@Test
	public void test1() {
		in3050 tester = new in3050();
		assertEquals(tester.in3050(30, 31), true);
	}

	@Test
	public void test2() {
		in3050 tester = new in3050();
		assertEquals(tester.in3050(30, 41), false);
	}

	@Test
	public void test3() {
		in3050 tester = new in3050();
		assertEquals(tester.in3050(40, 50), true);
	}
}
