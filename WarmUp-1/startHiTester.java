import static org.junit.Assert.*;

import org.junit.Test;

public class startHiTester {

	@Test
	public void test1() {
		startHi tester = new startHi();
		assertEquals(tester.startHi("hi there"), true);
	}
	
	@Test
	public void test2() {
		startHi tester = new startHi();
		assertEquals(tester.startHi("hi"), true);
	}
	
	@Test
	public void test3() {
		startHi tester = new startHi();
		assertEquals(tester.startHi("hello hi"), false);
	}

}
