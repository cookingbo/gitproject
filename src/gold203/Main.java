package gold203;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		String name = "Hello, Lamda";
		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept(name);

	}

}
