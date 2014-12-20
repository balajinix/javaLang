package javaTutorial;

import java.util.LinkedHashMap;
import java.util.Map;

class Person {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + ": " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class LearnHashCode {

	public static void main(String[] args) {
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
		map.put(new Person(1, "Bob"), 1);
		map.put(new Person(2, "Sue"), 2);
		map.put(new Person(2, "Sue"), 3);
		
		for(Map.Entry<Person, Integer> entry : map.entrySet()) {
			Person p = entry.getKey();
			System.out.println(p);
		}
		
	}

}
