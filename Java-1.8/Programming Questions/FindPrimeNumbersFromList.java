package InterviewQuestions;

import java.util.stream.IntStream;

public class FindPrimeNumbersFromList {

	public static void main(String[] args) {
		IntStream stream = IntStream.of(2,3,4,5,6,7,7,8,9,10);
		stream.filter(number->findPrime(number)).distinct().forEach(System.out::println);
	}
	
	public static boolean findPrime(int n) {
		return IntStream.rangeClosed(2, n/2).noneMatch(i->n%i==0);
	}

}
