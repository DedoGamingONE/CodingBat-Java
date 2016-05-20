import static org.junit.Assert.*;

import org.junit.Test;

public class doubleXTest {

	@Test
	public void test1() {
		doubleX tester = new doubleX();
		assertEquals(tester.doubleX("axxbb"), true);
	}

	@Test
	public void test2() {
		doubleX tester = new doubleX();
		assertEquals(tester.doubleX("axaxax"), false);
	}

	@Test
	public void test3() {
		doubleX tester = new doubleX();
		assertEquals(tester.doubleX("xxxxx"), true);
	}
}
