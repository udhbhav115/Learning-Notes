package InterviewQuestions;

import java.util.stream.IntStream;

public class ParallelStreamsExample {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 5).parallel().forEach(System.out::println);
	}

}
