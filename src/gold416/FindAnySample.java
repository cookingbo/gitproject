package gold416;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAnySample {

	public static void main(String[] args) {
		String[] array = {"A", "B", "C"};
		Stream<String> stream = Arrays.stream(array);
		Optional<String> result = stream.findAny();
		result.ifPresent(System.out::println);

	}

}
