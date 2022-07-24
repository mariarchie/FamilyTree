import java.util.*;

class Person {
	protected String name;
	protected List<Person> children;
	protected Boolean isDead;

	public Person(String aName) {
		name = aName;
		isDead = false;
		children = new ArrayList<>();
	}

	public void display() {
		System.out.println(this.name);
	}
}

class Brother extends Person {

	private String brotherName;

	public Brother(String aName, String brotherName) {
		super(aName);
		this.brotherName = brotherName;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Brother name: " + this.brotherName);
	}
}
