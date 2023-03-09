package InterviewQuestions;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReduceExample {

	public static void main(String[] args) {
//		String string = Stream.of("").reduce((i,j)->i+" "+j).toString();
//		System.out.println(string);
		
		OptionalInt reduce = IntStream.of().reduce(Integer::sum);
		System.out.println(reduce);
	}

}
