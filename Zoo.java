package Zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo {
	private int space;
	private List<Animal> animals;

	public Zoo(int space) {
		this.space = space;
		this.animals = new ArrayList<>();
	}

	public int getSpace() {
		return space;
	}

	public List<Animal> getAnimals() {
		return Collections.unmodifiableList(animals);
	}

	public void addAnimal(Animal animal) {
		if (animals == null) {
			animals = new ArrayList<>();
		}
		if (animals.size() < space) {
			animals.add(animal);
		}
	}

	public String listAllAnimals() {
		List<String> animalNames = new ArrayList<>();
		for (Animal animal : animals) {
			animalNames.add(animal.getName());
		}
		Collections.sort(animalNames);
		return String.join(", ", animalNames);
	}

	public String checkFreeSpace() {
	    if (animals == null) {
	        animals = new ArrayList<>();
	    }
	    int freeSpaces = space - animals.size();
	    if (freeSpaces <= 0) {
	        return "Zoo is full!";
	    } else {
	        return "Zoo has " + freeSpaces + " free space(s)!";
	    }
	}
}