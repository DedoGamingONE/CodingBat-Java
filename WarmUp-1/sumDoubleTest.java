import static org.junit.Assert.*;

import org.junit.Test;

public class sumDoubleTest {

	@Test
	public void test1() {
		sumDouble tester = new sumDouble();
		assertEquals(tester.sumDouble(1, 2), 3);
	}

	@Test
	public void test2() {
		sumDouble tester = new sumDouble();
		assertEquals(tester.sumDouble(3, 2), 5);
	}
	
	@Test
	public void test3() {
		sumDouble tester = new sumDouble();
		assertEquals(tester.sumDouble(2, 2), 8);
	}
}
