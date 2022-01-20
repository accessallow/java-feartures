package java8.lambda_expression;

interface Sayable{
	public String say();
}

public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		Sayable s = ()->{ return "I have much to say..."; };
		
		System.out.println("Saying : "+s.say());
	}

}
