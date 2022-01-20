package java8.lambda_expression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample7 {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("John");
		nameList.add("Jane");
		nameList.add("Harry");
		nameList.add("Jennifer");
		
		nameList.forEach( (n)->System.out.println("Hello "+n) );
	}
}
