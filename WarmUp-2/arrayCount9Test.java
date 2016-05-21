import static org.junit.Assert.*;

import org.junit.Test;

public class arrayCount9Test {

	@Test
	public void test1() {
		arrayCount9 tester = new arrayCount9();
		int[] testArr = {1, 2, 9};
		assertEquals(tester.arrayCount9(testArr), 1);
	}
	
	@Test
	public void test2() {
		arrayCount9 tester = new arrayCount9();
		int[] testArr = {1, 9, 9};
		assertEquals(tester.arrayCount9(testArr), 2);
	}

	@Test
	public void test3() {
		arrayCount9 tester = new arrayCount9();
		int[] testArr = {1, 9, 9, 3, 9};
		assertEquals(tester.arrayCount9(testArr), 3);
	}

}
