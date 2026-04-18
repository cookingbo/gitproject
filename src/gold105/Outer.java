package gold105;

public class Outer {
	void test() {
		Inner.message = "Hello, Java";
	}

	static class Inner {
		private static String message;
		public void test() {
			System.out.println(message);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
		new Inner().test();
	}
}
