package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsToUpperCase {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("japan","India","china","India");
		String collect = asList.stream().map(country->country.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(collect);
	}
}
