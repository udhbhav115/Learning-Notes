package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTheWordsBasedOnLength {

	public static void main(String[] args) {
		String string ="I have a sentence with technical skills";
		
		Map<Integer, List<String>> collect = Arrays.stream(string.split(" ")).
				collect(Collectors.groupingBy(String::length));
		
		System.out.println(collect);
	}

}
