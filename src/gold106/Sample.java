package gold106;

public class Sample {
	private String message;
	public Test test(String value) {
		message = "Hello, ";
		class A implements Test {
			@Override
			public void execute() {
				System.out.println(message + value);
			}
		}

		return new A();
	}

}
