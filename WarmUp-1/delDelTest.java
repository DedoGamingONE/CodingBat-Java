import static org.junit.Assert.*;

import org.junit.Test;

public class delDelTest {

	@Test
	public void test1() {
		delDel tester = new delDel();
		assertEquals(tester.delDel("adelbc"), "abc");
	}

	@Test
	public void test2() {
		delDel tester = new delDel();
		assertEquals(tester.delDel("adelHello"), "aHello");
	}
	

	@Test
	public void test3() {
		delDel tester = new delDel();
		assertEquals(tester.delDel("adedbc"), "adedbc");
	}
}
