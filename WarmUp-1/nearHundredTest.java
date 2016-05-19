import static org.junit.Assert.*;

import org.junit.Test;

public class nearHundredTest {

	@Test
	public void test1() {
		nearHundred tester = new nearHundred();
		assertEquals(tester.nearHundred(93), true);
	}
	
	@Test
	public void test2() {
		nearHundred tester = new nearHundred();
		assertEquals(tester.nearHundred(90), true);
	}
	
	@Test
	public void test3() {
		nearHundred tester = new nearHundred();
		assertEquals(tester.nearHundred(89), false);
	}

}
