package gold202;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<String> s = () -> "こんにちは";
		System.out.println(s.get());

	}

}
