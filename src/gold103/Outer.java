package gold103;

public class Outer {
	public static class Inner {
		public void test() {
			System.out.println("スタティックなインナークラスはエンクロージングクラスのインスタンス化を必要としない");
		}
	}

	public static void main(String[] args) {
		new Inner().test();
	}

}
