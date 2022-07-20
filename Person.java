import java.util.*;

class Person {
	public String name;
	public List<Person> children;
	public Boolean isDead;
	
	public Person (String aName) {
		name = aName;
		isDead = false;
		children = new ArrayList<>();
	}
}
