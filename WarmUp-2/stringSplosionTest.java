import static org.junit.Assert.*;

import org.junit.Test;

public class stringSplosionTest {

	@Test
	public void test1() {
		stringSplosion tester = new stringSplosion();
		assertEquals(tester.stringSplosion("Code"), "CCoCodCode");
	}

	@Test
	public void test2() {
		stringSplosion tester = new stringSplosion();
		assertEquals(tester.stringSplosion("abc"), "aababc");
	}

	@Test
	public void test3() {
		stringSplosion tester = new stringSplosion();
		assertEquals(tester.stringSplosion("ab"), "aab");
	}
}
