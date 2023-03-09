package InterviewQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortTheMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap<>();
		map.put("a", 3);
		map.put("b", 2);
		map.put("c", 1);
		System.out.println("Before Sorting\n"+map);
		LinkedHashMap<String,Integer> collect = map.entrySet().stream().sorted((e1,e2)->{
			return e1.getValue()-e2.getValue();
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println("After Sorting\n"+collect);
			
	}

}
