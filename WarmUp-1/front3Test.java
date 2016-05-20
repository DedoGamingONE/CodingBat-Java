import static org.junit.Assert.*;

import org.junit.Test;

public class front3Test {

	@Test
	public void test1() {
		front3 tester = new front3();
		assertEquals(tester.front3("Java"), "JavJavJav");
	}

	@Test
	public void test2() {
		front3 tester = new front3();
		assertEquals(tester.front3("Chocolate"), "ChoChoCho");
	}

	@Test
	public void test3() {
		front3 tester = new front3();
		assertEquals(tester.front3("abcabcabc"), "abcabcabc");
	}
}
