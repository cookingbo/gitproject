package comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Item> items = Arrays.asList(
			new Item[] {
				new Item("Orange", 100),
				new Item("Banana", 80),
				new Item("Apple", 120),
			}
		);
		Collections.sort(items, new PriceComparator());
		for(Item item : items) {
			System.out.println(item.getName());
		}

	}

}
