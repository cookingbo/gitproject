package gold210;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Function<Integer, Integer> a = x -> x + 2;
		Function<Integer, Integer> b = X -> X * 2;
		System.out.println(a.compose(b).apply(10));

	}

}
