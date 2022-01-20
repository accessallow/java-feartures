package java8.lambda_expression;

interface Sayable1{
	public String say(String name);
}
public class LambdaExpressionExample4 {

	public static void main(String[] args) {
		
		Sayable1 helloQuote = (name)-> { return "Hello "+name; };
		Sayable1 byeQuote = (name)-> { return "Bye "+name; };
		Sayable1 howdyQuote = (name)-> { return "Howdy  "+name; };
		
		System.out.println(helloQuote.say("Pankaj"));
		System.out.println(byeQuote.say("Pankaj"));
		System.out.println(howdyQuote.say("Pankaj"));
		
	}

}
