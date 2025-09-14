package gold207;

import java.util.function.Predicate;

import gold207.Person.Gender;

public class NewSample {

	public static void main(String[] args) {
		Predicate<Person> isMale = p -> p.getGender().equals(Gender.MALE);
		Predicate<Person> isFemale = p -> p.getGender().equals(Gender.FEMALE);
		Predicate<Person> isAdult = p -> p.getAge() >= 20;

		Person sample = new Person(Gender.MALE, 19);
		if(isMale.or(isFemale.and(isAdult)).test(sample)) {
			System.out.println("OK");
			return;
		}
		System.out.println("NG");

	}

}
