package gold204;

public class Sample {

	public static void main(String[] args) {
		Item item = new Item.Builder(100)
				.with(builder -> {
					builder.name = "Orange";
					builder.price = 120;
				}).build();
		System.out.println(item);

	}

}
