package InterviewQuestions;

import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("udhbhav","Thandra","is");
		Stream<Character> flatMap = stream.flatMap(str->Stream.of(str.charAt(1)));
		
	}
}
