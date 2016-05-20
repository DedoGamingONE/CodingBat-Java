import static org.junit.Assert.*;

import org.junit.Test;

public class backAroundTester {

	@Test
	public void test1() {
		backAround tester = new backAround();
		assertEquals(tester.backAround("cat"), "tcatt");
	}
	
	@Test
	public void test2() {
		backAround tester = new backAround();
		assertEquals(tester.backAround("Hello"), "oHelloo");
	}
	
	@Test
	public void test3() {
		backAround tester = new backAround();
		assertEquals(tester.backAround("a"), "aaa");
	}

}
