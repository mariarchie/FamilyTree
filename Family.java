import java.util.*;

public class Family {
	HashMap<String, Person> personMap;
	String Daddy;

	public Family(String father) {
		personMap = new HashMap<>();
		Daddy = father;
		personMap.put(Daddy, new Person(Daddy));
	}

	public void birth(String child, String parent) {
		Person parentObj = personMap.get(parent);
		Person childObj = new Person(child);
		parentObj.children.add(childObj);
		personMap.put(child, childObj);
	}

	public void death(String name) {
		personMap.get(name).isDead = true;
	}

	public List<String> getallChildren() {
		List<String> succession = new ArrayList<>();
		Deque<Person> deque = new ArrayDeque<>();
		deque.push(personMap.get(Daddy));

		while (!deque.isEmpty()) {
			Person current = deque.pop();
			if (!current.isDead) {
				succession.add(current.name);
			}
			for (int i = current.children.size() - 1; i >= 0; i--) {
				deque.push(current.children.get(i));
			}
		}
		return succession;
	}
}