import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class AddingTest {

	@Test
	void testAdd() {
		Adding adding = new Adding();
		assertTrue(adding.add(55, 22) == 77);
	}
}
