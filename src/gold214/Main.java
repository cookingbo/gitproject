package gold214;

import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 100;
		BinaryOperator<Integer> Sum = (i, j) -> i + j;
		System.out.println(Sum.apply(a, b));
	}

}
