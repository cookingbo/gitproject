package lamdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
        fruits.forEach(fruit -> System.out.println(fruit));

        List<String> sports = Arrays.asList("baseball", "tabletennis");
        sports.forEach(sport -> System.out.println(sport));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1));

        Collections.sort(numbers, (a, b) -> a.compareTo(b));

        System.out.println(numbers); // 結果: [1, 2, 5, 8]

        Collections.sort(fruits, (a, b) -> a.length() - b.length());
        System.out.println(fruits);
	}

}
