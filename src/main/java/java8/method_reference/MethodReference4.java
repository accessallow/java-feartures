package java8.method_reference;

import java.util.function.BiFunction;

class ArithmeticX{
	public static int add(int a, int b) {
		return a+b;
	}
	public static float add(float a, float b) {
		return a + b;
	}
	public static float add(int a, float b) {
		return a+b;
	}
}

public class MethodReference4 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> intAdd = ArithmeticX::add;
		BiFunction<Integer, Float, Float> intFloatAdd = ArithmeticX::add;
		BiFunction<Float, Float, Float> fAdd = ArithmeticX::add;
		
		System.out.println("R1 = "+intAdd.apply(10, 10));
		System.out.println("R2 = "+intFloatAdd.apply(10, 10.5f));
		System.out.println("R3 = "+fAdd.apply(10f, 10f));
		
	}

}
