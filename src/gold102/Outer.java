package gold102;

public class Outer {
	class Inner {
		public void test() {
			System.out.println("test");
		}
	}

	public static void main(String[] args) {
		Inner inner = new Outer().new Inner();
		inner.test();

	}

}
