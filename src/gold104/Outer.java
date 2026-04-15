package gold104;

public class Outer {
	public void hoge() {
		Inner test = new Inner();
		test.data = 100;
		test.execute();
	}

	private static class Inner {
		private int data;
		private int num = 2;
		void execute() {
			System.out.println(num * data);
		}
	}

	public static void main(String[] args) {
		new Outer().hoge();
	}

}
