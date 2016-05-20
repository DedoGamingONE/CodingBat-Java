import static org.junit.Assert.*;

import org.junit.Test;

public class front22Test {

	@Test
	public void test1() {
		front22 tester = new front22();
		assertEquals(tester.front22("kitten"), "kikittenki");
	}

	@Test
	public void test2() {
		front22 tester = new front22();
		assertEquals(tester.front22("Ha"), "HaHaHa");
	}

	@Test
	public void test3() {
		front22 tester = new front22();
		assertEquals(tester.front22("abc"), "ababcab");
	}
}
