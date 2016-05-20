import static org.junit.Assert.*;

import org.junit.Test;

public class intMaxTest {

	@Test
	public void test1() {
		intMax tester = new intMax();
		assertEquals(tester.intMax(1, 2, 3), 3);
	}

	@Test
	public void test2() {
		intMax tester = new intMax();
		assertEquals(tester.intMax(1, 3, 2), 3);
	}

	@Test
	public void test3() {
		intMax tester = new intMax();
		assertEquals(tester.intMax(3, 2, 1), 3);
	}

}
