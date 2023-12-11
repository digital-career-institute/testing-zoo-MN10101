package Zoo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ZooTest {
	@Test
	public void testZooCreation() {
		Zoo zoo = new Zoo(5);
		assertEquals(5, zoo.getSpace());
		assertEquals(0, zoo.getAnimals().size());
	}

	@Test
	public void testAddAnimalToZoo() {
		Zoo zoo = new Zoo(5);
		Animal lion = new Animal("Lion");
		zoo.addAnimal(lion);
		assertEquals(1, zoo.getAnimals().size());
		assertEquals("Lion", zoo.getAnimals().get(0).getName());
	}

	@Test
	public void testListAllAnimal() {
		Zoo zoo = new Zoo(4);
		Animal zebra = new Animal("Zebra");
		Animal lion = new Animal("Lion");
		zoo.addAnimal(lion);
		zoo.addAnimal(zebra);
		assertEquals("Lion, Zebra", zoo.listAllAnimals());
	}

	@Test
	public void testCheckSpace() {
		Zoo zoo = new Zoo(2);
		Animal lion = new Animal("Lion");
		zoo.addAnimal(lion);
		assertEquals("Zoo has 1 free space(s)!", zoo.checkFreeSpace());
	}

	@Test
	public void testCheckFull() {
	    Zoo zoo = new Zoo(1);
	    Animal elephant = new Animal("Elephant");
	    zoo.addAnimal(elephant);
	    assertEquals("Zoo is full!", zoo.checkFreeSpace());
	}
}