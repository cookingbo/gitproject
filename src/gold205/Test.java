package gold205;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		var map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> bi = (k, y) -> map.put(k, y);

		bi.accept("apple", 3);
		bi.accept("orange", 2);

		System.out.println(map);
		System.out.println(map.get("apple"));

	}

}
