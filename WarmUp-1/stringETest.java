import static org.junit.Assert.*;

import org.junit.Test;

public class stringETest {

	@Test
	public void test1() {
		stringE tester = new stringE();
		assertEquals(tester.stringE("Hello"), true);
	}

	@Test
	public void test2() {
		stringE tester = new stringE();
		assertEquals(tester.stringE("Heelle"), true);
	}

	@Test
	public void test3() {
		stringE tester = new stringE();
		assertEquals(tester.stringE("Heelele"), false);
	}
}
