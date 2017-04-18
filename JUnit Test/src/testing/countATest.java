package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void testCountA() {
		JunitTesting test = new JunitTesting();
		
		int output = test.countA("alphabet");
		
		assertEquals(2, output);
	}

}
