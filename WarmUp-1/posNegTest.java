import static org.junit.Assert.*;

import org.junit.Test;

public class posNegTest {

	@Test
	public void test1() {
		posNeg tester = new posNeg();
		assertEquals(tester.posNeg(1, -1, false), true);
	}
	
	@Test
	public void test2() {
		posNeg tester = new posNeg();
		assertEquals(tester.posNeg(-1, 1, false), true);
	}
	
	@Test
	public void test3() {
		posNeg tester = new posNeg();
		assertEquals(tester.posNeg(-4, -5, true), true);
	}

}
