package gold211;

import java.util.function.BiFunction;

public class BiSample {

	public static void main(String[] args) {
		BiFunction<String, String, String> b = (str, addStr) -> str.concat(addStr);
		String result = b.apply("Hello, ", "Lamda");
		System.out.println(result);

	}

}
