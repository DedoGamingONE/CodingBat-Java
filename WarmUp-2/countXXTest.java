import static org.junit.Assert.*;

import org.junit.Test;

public class countXXTest {

	@Test
	public void test1() {
		countXX tester = new countXX();
		assertEquals(tester.countXX("abcxx"), 1);
	}

	@Test
	public void test2() {
		countXX tester = new countXX();
		assertEquals(tester.countXX("xxx"), 2);
	}
	

	@Test
	public void test3() {
		countXX tester = new countXX();
		assertEquals(tester.countXX("xxxx"), 3);
	}
}
