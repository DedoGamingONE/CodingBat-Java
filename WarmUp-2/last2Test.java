import static org.junit.Assert.*;

import org.junit.Test;

public class last2Test {

	@Test
	public void test1() {
		last2 tester = new last2();
		assertEquals(tester.last2("hixxhi"), 1);
	}
	
	@Test
	public void test2() {
		last2 tester = new last2();
		assertEquals(tester.last2("xaxxaxaxx"), 1);
	}
	
	@Test
	public void test3() {
		last2 tester = new last2();
		assertEquals(tester.last2("axxxaaxx"), 2);
	}

}
