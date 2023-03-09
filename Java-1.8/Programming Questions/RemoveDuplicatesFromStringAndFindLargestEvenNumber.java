package InterviewQuestions;

import java.util.stream.Stream;

public class RemoveDuplicatesFromStringAndFindLargestEvenNumber {
	public static void main(String[] args) {
		String string="Hello@357";
		System.out.println(string.chars().filter(number->number>=48 && number<=57).
				map(number-> number-'0').filter(number->number%2==0).max().orElse(-1));
		Stream<String> stream;
		
	}
}
