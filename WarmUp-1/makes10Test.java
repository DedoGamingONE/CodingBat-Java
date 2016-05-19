import static org.junit.Assert.*;

import org.junit.Test;

public class makes10Test {

	@Test
	public void test1() {
		makes10 tester = new makes10();
		assertEquals(tester.makes10(9, 10), true);
	}
	
	@Test
	public void test2() {
		makes10 tester = new makes10();
		assertEquals(tester.makes10(9, 9), false);
	}
	
	@Test
	public void test3() {
		makes10 tester = new makes10();
		assertEquals(tester.makes10(1, 9), true);
	}

}
