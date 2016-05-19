import static org.junit.Assert.*;

import org.junit.Test;

public class diff21Test {

	@Test
	public void test1() {
		diff21 tester = new diff21();
		assertEquals(tester.diff21(19), 2);
	}
	
	@Test
	public void test2() {
		diff21 tester = new diff21();
		assertEquals(tester.diff21(10), 11);
	}
	
	@Test
	public void test3() {
		diff21 tester = new diff21();
		assertEquals(tester.diff21(21), 0);
	}

}
