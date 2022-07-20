import java.util.*;

public class Family {
	HashMap<String, Person> personMap;
	String Daddy;
	
	public Family (String father) {
		personMap = new HashMap<>();
		Daddy = father;
		personMap.put(Daddy, new Person(Daddy));
	}
	
	public void birth (String child, String parent) {
		Person parentObj = personMap.get(parent);
		Person childObj = new Person(child);
		parentObj.children.add(childObj);
		personMap.put(child, childObj);
	}
	
	public void death (String name) {
		personMap.get(name).isDead = true;
	}
	
	public List<String> getallChildren() {
		List<String> succession = new ArrayList<>();
		Stack<Person> stack = new Stack<>();
		stack.push(personMap.get(Daddy));
		
		while ( !stack.empty() ) {
			Person current = stack.pop();
			if (!current.isDead) succession.add(current.name);
			for (int i = current.children.size() - 1; i >= 0; i--) {
				stack.push(current.children.get(i));
			}
		}
		return succession;
	}
	
    public static void main(String[] args) {
    	Family m = new Family("John1");
    	m.birth("John2", "John1");
    	m.birth("Mike", "John1");
    	m.birth("Fred", "Mike");
    	List<String> list = m.getallChildren();
    	System.out.println(list.toString());
    }
}
