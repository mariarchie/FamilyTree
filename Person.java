import java.util.*;

class Person implements Comparable<Person> {
	
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

	public int compareTo(Person p){
     
        return name.compareTo(p.getName());
    }

	private String getName() {
		return name;
	}

}
