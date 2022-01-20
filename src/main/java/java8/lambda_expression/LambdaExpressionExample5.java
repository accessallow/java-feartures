package java8.lambda_expression;

interface Addable{
	int add(int a, int b);
}
public class LambdaExpressionExample5 {

	public static void main(String[] args) {
		Addable a1 = (a,b)->{return a+b;};
		
		Addable a2 = (a,b)->(a+b);
		
		System.out.println(a2.add(6, 12));
	}

}
