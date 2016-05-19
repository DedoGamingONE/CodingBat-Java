import static org.junit.Assert.*;

import org.junit.Test;

public class monkeyTroubleTest {

	@Test
	public void test1() {
		monkeyTrouble tester = new monkeyTrouble();
		assertEquals(tester.monkeyTrouble(true, true), true);
	}
	
	@Test
	public void test2() {
		monkeyTrouble tester = new monkeyTrouble();
		assertEquals(tester.monkeyTrouble(false, false), true);
	}
	
	@Test
	public void test3() {
		monkeyTrouble tester = new monkeyTrouble();
		assertEquals(tester.monkeyTrouble(true, false), false);
	}

}
