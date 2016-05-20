import static org.junit.Assert.*;

import org.junit.Test;

public class frontTimesTest {

	@Test
	public void test1() {
		frontTimes tester = new frontTimes();
		assertEquals(tester.frontTimes("Chocolate", 2), "ChoCho");
	}

	@Test
	public void test2() {
		frontTimes tester = new frontTimes();
		assertEquals(tester.frontTimes("Chocolate", 3), "ChoChoCho");
	}

	@Test
	public void test3() {
		frontTimes tester = new frontTimes();
		assertEquals(tester.frontTimes("Abc", 3), "AbcAbcAbc");
	}
}
