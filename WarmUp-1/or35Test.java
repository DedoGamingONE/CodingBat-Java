import static org.junit.Assert.*;

import org.junit.Test;

public class or35Test {

	@Test
	public void test1() {
		or35 tester = new or35();
		assertEquals(tester.or35(3), true);
	}

	@Test
	public void test2() {
		or35 tester = new or35();
		assertEquals(tester.or35(10), true);
	}

	@Test
	public void test3() {
		or35 tester = new or35();
		assertEquals(tester.or35(8), false);
	}

}
