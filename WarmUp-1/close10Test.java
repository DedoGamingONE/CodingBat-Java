import static org.junit.Assert.*;

import org.junit.Test;

public class close10Test {

	@Test
	public void test1() {
		close10 tester = new close10();
		assertEquals(tester.close10(8, 13), 8);
	}

	@Test
	public void test2() {
		close10 tester = new close10();
		assertEquals(tester.close10(13, 8), 8);
	}

	@Test
	public void test3() {
		close10 tester = new close10();
		assertEquals(tester.close10(13, 7), 0);
	}
}

