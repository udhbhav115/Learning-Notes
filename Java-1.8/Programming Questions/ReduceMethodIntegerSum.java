package InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ReduceMethodIntegerSum {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10,20,30,40,50);
		Integer sum = asList.stream().reduce(0,Integer::sum);
		asList.stream().forEach(number->System.out.println(number+sum));
	}

}
