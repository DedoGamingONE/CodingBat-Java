import static org.junit.Assert.*;

import org.junit.Test;

public class startOzTest {

	@Test
	public void test1() {
		startOz tester = new startOz();
		assertEquals(tester.startOz("ozymandias"), "oz");
	}

	@Test
	public void test2() {
		startOz tester = new startOz();
		assertEquals(tester.startOz("bzoo"), "z");
	}

	@Test
	public void test3() {
		startOz tester = new startOz();
		assertEquals(tester.startOz("oxx"), "o");
	}
}
