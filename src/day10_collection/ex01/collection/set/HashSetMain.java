package day10_collection.ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person { // extends Object
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Person) {
			Person temp = (Person)obj;
			
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	
} // Person end

public class HashSetMain {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new Person("doyeon", 33));
		set.add(new Person("David", 20));
		set.add(new Person("David", 20));
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		set.add(new String("happy"));
		set.add(new String("happy"));
		
		System.out.println(set);
	}

}
