import static org.junit.Assert.*;

import org.junit.Test;

public class hasTeenTest {

	@Test
	public void test1() {
		hasTeen tester = new hasTeen();
		assertEquals(tester.hasTeen(13, 20, 10), true);
	}

	@Test
	public void test2() {
		hasTeen tester = new hasTeen();
		assertEquals(tester.hasTeen(20, 19, 10), true);
	}
	
	@Test
	public void test3() {
		hasTeen tester = new hasTeen();
		assertEquals(tester.hasTeen(20, 10, 13), true);
	}
}
