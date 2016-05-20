import static org.junit.Assert.*;

import org.junit.Test;

public class loneTeenTest {

	@Test
	public void test1() {
		loneTeen tester = new loneTeen();
		assertEquals(tester.loneTeen(13, 99), true);
	}

	@Test
	public void test2() {
		loneTeen tester = new loneTeen();
		assertEquals(tester.loneTeen(21, 19), true);
	}

	@Test
	public void test3() {
		loneTeen tester = new loneTeen();
		assertEquals(tester.loneTeen(13, 13), false);
	}
}
