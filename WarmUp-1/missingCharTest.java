import static org.junit.Assert.*;

import org.junit.Test;

public class missingCharTest {

	@Test
	public void test1() {
		missingChar tester = new missingChar();
		assertEquals(tester.missingChar("kitten", 1), "ktten");
	}

	@Test
	public void test2() {
		missingChar tester = new missingChar();
		assertEquals(tester.missingChar("kitten", 0), "itten");
	}
	
	@Test
	public void test3() {
		missingChar tester = new missingChar();
		assertEquals(tester.missingChar("kitten", 4), "kittn");
	}
}
