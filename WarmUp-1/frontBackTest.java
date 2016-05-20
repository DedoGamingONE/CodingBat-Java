import static org.junit.Assert.*;

import org.junit.Test;

public class frontBackTest {

	@Test
	public void test1() {
		frontBack tester = new frontBack();
		assertEquals(tester.frontBack("code"), "eodc");
	}
	
	@Test
	public void test2() {
		frontBack tester = new frontBack();
		assertEquals(tester.frontBack("a"), "a");
	}
	
	@Test
	public void test3() {
		frontBack tester = new frontBack();
		assertEquals(tester.frontBack("ab"), "ba");
	}

}
