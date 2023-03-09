package InterviewQuestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorsExample {
	public static void main(String[] args) {
//		Map<Integer, List<Integer>> collect = IntStream.of(10,21,30,41,50).boxed().collect(Collectors.groupingBy(number->number%10));
//		System.out.println(collect);
		
//		Map<Integer, List<String>> map=Stream.of("udhbhav","thandra","is","a","good","boy").collect(Collectors.groupingBy(String::length));
//		System.out.println(map);
		
//		String collect = Stream.of("udhbhav","thandra","is","a","good","boy").collect(Collectors.joining(",","{","}"));
//		System.out.println(collect);
		
//		Integer collect = IntStream.of(1,2,3,4,5,6,7,8,9).boxed().collect(Collectors.summingInt(number->number));
//		System.out.println(collect);
		
//		Map<Boolean, List<Integer>> collect = IntStream.of(1,2,3,4,5,6,7,8,9).boxed().collect(Collectors.partitioningBy(number->number%2==0));
//		System.out.println(collect);
		
		Optional<Integer> collect2 = IntStream.of(1,2,3,4,5,6,7,8).boxed().collect(Collectors.minBy(Comparator.comparing(n->n)));
		System.out.println(collect2.get());
		
	}
}
