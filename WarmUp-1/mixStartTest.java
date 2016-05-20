import static org.junit.Assert.*;

import org.junit.Test;

public class mixStartTest {

	@Test
	public void test1() {
		mixStart tester = new mixStart();
		assertEquals(tester.mixStart("mix snacks"), true);
	}

	@Test
	public void test2() {
		mixStart tester = new mixStart();
		assertEquals(tester.mixStart("pix snacks"), true);
	}

	@Test
	public void test3() {
		mixStart tester = new mixStart();
		assertEquals(tester.mixStart("piz snacks"), false);
	}
}
