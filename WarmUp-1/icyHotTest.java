import static org.junit.Assert.*;

import org.junit.Test;

public class icyHotTest {

	@Test
	public void test1() {
		icyHot tester = new icyHot();
		assertEquals(tester.icyHot(120,  -1), true);
	}

	@Test
	public void test2() {
		icyHot tester = new icyHot();
		assertEquals(tester.icyHot(-1,  120), true);
	}
	
	@Test
	public void test3() {
		icyHot tester = new icyHot();
		assertEquals(tester.icyHot(2,  120), false);
	}
}
