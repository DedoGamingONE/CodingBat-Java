import static org.junit.Assert.*;

import org.junit.Test;

public class parrotTroubleTest {

	@Test
	public void test1() {
		parrotTrouble tester = new parrotTrouble();
		assertEquals(tester.parrotTrouble(true,  6), true);
	}
	
	@Test
	public void test2() {
		parrotTrouble tester = new parrotTrouble();
		assertEquals(tester.parrotTrouble(true,  7), false);
	}
	
	@Test
	public void test3() {
		parrotTrouble tester = new parrotTrouble();
		assertEquals(tester.parrotTrouble(false,  6), false);
	}

}
