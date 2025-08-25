package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class takedropwhile {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> take =  nums.stream().takeWhile(i->i<5)
				.collect(Collectors.toList());
		System.out.println(take);
		List<Integer> drop =  nums.stream().dropWhile(i->i<5)
				.collect(Collectors.toList());
		System.out.println(drop);		
		
	}
}
