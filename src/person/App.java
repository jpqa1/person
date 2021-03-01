package person;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Person bond = new Person("Bond", 40, "Secret Agent");
		Person powers = new Person("Powers", 30, "International Man of Mystery!");
		Person bloggs = new Person("Bloggs", 25, "Blogger");

//		System.out.println(bond.toString());
//		System.out.println(powers.toString());
//		System.out.println(bloggs.toString());

		List<Person> peopleList = new ArrayList<>();
		peopleList.add(bond);
		peopleList.add(powers);
		peopleList.add(bloggs);

//		for (int i = 0; i < peopleList.size(); i++) {
//			System.out.println(peopleList.get(i).toString());
//		}

		findPersonByName(peopleList, "Powers");

		peopleList.get(2).toString();

		peopleList.set(2, new Person("Plonker", 23, "Chief Plonker"));

//		for (Person person : peopleList) {
//			System.out.println(person.getName());
//		}

		peopleList.add(new Person("Katie", 28, "Office Manager"));

//		for (Person person : peopleList) {
//			System.out.println(person.getName());
//		}

		peopleList.remove(2);

		for (Person person : peopleList) {
			System.out.println(person.getName());
		}

	}

	public static Person findPersonByName(List<Person> list, String name) {
		Person foundPerson = null;

		for (Person person : list) {

			if (person.getName().equals(name) == true) {
				foundPerson = person;
			}
		}

		System.out.println(foundPerson.toString());
		return foundPerson;
	}

}
