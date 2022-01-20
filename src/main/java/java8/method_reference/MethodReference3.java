package java8.method_reference;

import java.util.function.BiFunction;

class Arithmetic1{
	public static int add(int a, int b) {
		return a+b;
	}
}


public class MethodReference3 {
	public static void main(String[] args) {
			BiFunction<Integer, Integer, Integer> add = Arithmetic1::add;
			int r = add.apply(10, 20);
			System.out.println("R = "+r);
	}
}
