package Zoo;

public class Zookeeper {
	public String name;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	public void feed(Animal animal) {
		System.out.println(name+" hraneste animalul "+animal.getName());
	}
}
