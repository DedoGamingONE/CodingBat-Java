import static org.junit.Assert.*;

import org.junit.Test;

public class endUpTest {

	@Test
	public void test1() {
		endUp tester = new endUp();
		assertEquals(tester.endUp("Hello"), "HeLLO");
	}

	@Test
	public void test2() {
		endUp tester = new endUp();
		assertEquals(tester.endUp("hi there"), "hi thERE");
	}

	@Test
	public void test3() {
		endUp tester = new endUp();
		assertEquals(tester.endUp("hi"), "HI");
	}
}