package InterviewQuestions;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


interface Hello{
	void hello();
	static String print(String message) {
		return message;
    }
}

public class PreDefinedInterfacesExample {
	public static void main(String[] args) {
		//execFunctionInterface();
		//execPredicateInterface();
		//execConsumerInterface();
		//execBinaryOperatorInterface();
	}

	private static void execBinaryOperatorInterface() {
		BinaryOperator<Integer> binaryOperator=(i,j)->i+j;
		
		System.out.println(binaryOperator.apply(10, 20));
	}

	private static void execConsumerInterface() {
		Consumer<String> consumer=str->str.toUpperCase().chars().mapToObj(i->(char) i).
				forEach(i->System.out.println(i));
		consumer.accept("udhbhav");	
	}

	private static void execPredicateInterface() {
		Predicate<String> predicate=str->str.equalsIgnoreCase("udHbhav");
		
		System.out.println(predicate.test("udhbhav"));
	}

	private static void execFunctionInterface() {
		
		Function<String, String> function = Hello::print;
		
		Function<String, String> fun = fun(function);
		System.out.println(fun.apply("Thandra"));
		
		Function<String, String> function2=str->str.concat("Thandra");
		
		String apply = function2.apply("Udhbhav");
		
		System.out.println(apply);
	}

	private static Function<String, String> fun(Function<String, String> function) {
		Function<String, String> andThen = function.andThen(Hello::print);
		System.out.println(andThen.apply("udhbhav"));
		return andThen;
		
	}
	
}
