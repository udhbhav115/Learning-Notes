package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheIntesectionElementsInTwoArrays {

	
	public static void main(String[] args) {
		int arr1[]= {1,2,2,3,4,5,};
		int arr2[]= {2,3};
		
		Integer[] array = Arrays.stream(arr1).filter(number1->Arrays.stream(arr2).anyMatch(number2->number1==number2))
		.boxed().distinct().toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(array));
		
		List<Integer> asList = Arrays.asList(2,3);
		List<Integer> collect = Arrays.stream(arr1).filter(asList::contains).distinct().boxed().collect(Collectors.toList());
		
		System.out.println(collect);

	}
	
//Boxed method will be used to convert Primitive stream to Stream of object
}
