import static org.junit.Assert.*;

import org.junit.Test;

public class notStringTest {

	@Test
	public void test1() {
		notString tester = new notString();
		assertEquals(tester.notString("candy"), "not candy");
	}
	
	@Test
	public void test2() {
		notString tester = new notString();
		assertEquals(tester.notString("x"), "not x");
	}
	
	@Test
	public void test3() {
		notString tester = new notString();
		assertEquals(tester.notString("not bad"), "not bad");
	}

}
