package Zoo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalTest {
	@Test
	public void testAnimalCreation() {
		Animal animal = new Animal("Tiger");
		assertEquals("Tiger", animal.getName());
	}
}