package java8.method_reference;

import java.util.function.BiFunction;

interface Sayable{
	void say();
}

class Arithmetic{
	public static int add(int a, int b) {
		return a+b;
	}
}

public class MethodReference {
	
	public static void saySomething() {
		System.out.println("Hello, static method saying whaaaat!");
	}
	
	
	public static void main(String[] args) {
		Sayable s = MethodReference::saySomething;
		s.say();
		
		System.out.println("-------------------------------------");
		
		Thread t = new Thread(MethodReference::saySomething);
		t.start();
		
		System.out.println("-------------------------------------");
		
		BiFunction<Integer, Integer, Integer> sum = Arithmetic::add;
		int result = sum.apply(4, 7);
		System.out.println("Result = "+result);
		
	}
}
