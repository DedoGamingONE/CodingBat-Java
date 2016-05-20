import static org.junit.Assert.*;

import org.junit.Test;

public class stringBitsTest {

	@Test
	public void test1() {
		stringBits tester = new stringBits();
		assertEquals(tester.stringBits("Hi"), "H");
	}

	@Test
	public void test2() {
		stringBits tester = new stringBits();
		assertEquals(tester.stringBits("Hello"), "Hlo");
	}

	@Test
	public void test3() {
		stringBits tester = new stringBits();
		assertEquals(tester.stringBits("Heeololeo"), "Hello");
	}
}

