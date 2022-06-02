package practice;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Programs that find the Maximum sum of two number whose digits add up to an equal sum. 
 * */
class MaxSum{
	public static void main(String[] args) {
		
		// List of the numbers to process.
//		List<Integer> list = Arrays.asList(51, 71, 17, 42);
//		List<Integer> list = Arrays.asList(42, 33, 60);
//		List<Integer> list = Arrays.asList(51, 32, 43);
		
		System.out.println(findMax(Arrays.asList(51, 71, 17, 42)));
		System.out.println(findMax(Arrays.asList(42, 33, 60)));
		System.out.println(findMax(Arrays.asList(51, 32, 43)));
		
		
		
	}
	
	public static Integer findMax(List<Integer> list) {
		// Split each number and store the single digit value in the list.
		List<List<Integer>> s = list.stream()
			.map(x -> Arrays.stream(String.valueOf(x).split(""))
						.map(x1 -> Integer.parseInt(x1))
						.collect(Collectors.toList()))
			.collect(Collectors.toList());
		
		// Print the List to see what is being stored.
		System.out.println("Main List: " + s);
		
		
//		// Store the sum of all the number in the list<Integer> 
//		List<Integer> sum = s.stream()
//			.map(x -> x.get(0) + x.get(1))
//			.collect(Collectors.toList());
//		
//		System.out.println("Sum:" + sum);
//				
//		// Remove all the duplicates from the sum and make it unique. 
//		Set<Integer> index = sum.stream()
//								.filter(x -> Collections.frequency(sum, x) > 1)
//								.collect(Collectors.toSet());
//				
//		System.out.println(sum.indexOf(6));
//		System.out.println(index);
		
		/*
		 * Create a Map to store the sum and the relevant value of the list of numbers.
		 * Key: Sum of the number.
		 * Value: List of numbers creating the sum.
		 * 
		 * */
		Map<Integer, List<Integer>> re = s.stream()
							.collect(Collectors.groupingBy(
//										x -> x.get(0) + x.get(1), // Works only for two digit values
										// Below code works for any digit value.
										x -> {
											Integer temp = 0;
											
											for (int i=0; i < x.size(); i++) {
												temp += x.get(i);
												
											}
											return temp;
										},
										Collectors.mapping(
//															x -> Integer.parseInt(x.get(0) + "" + x.get(1)),
													x -> {
														String temp = "";
														
														for (int i=0; i < x.size(); i++) {
															temp += x.get(i);
															
														}
														return Integer.parseInt(temp);
													},
													Collectors.toList()
												)
										)
									);
		
		// Print the Map
		System.out.println("Main Mapping:" + re);
		
//		Iterator<Map.Entry<Integer, List<Integer>>> it = re.entrySet().iterator();
		
		/*
		 * Remove Key:Value pair if the list of value is less than 2.
		 * Only if the list has Single value.
		 * */
		re.entrySet().removeIf(x -> x.getValue().size() < 2);
		
		// Print the value with Valid Key:Value pair.
		System.out.println("Valid Data: " + re);
		
		/*
		 * Loop through the map.
		 * Sort all the lists in the map in reverse order.
		 * Its easier to the highest value in index 0 and 1.
		 * */
		for(Integer i : re.keySet()) {
			re.put(i, re.get(i).stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList()));
		}
		
		// Print the map in the Reverse order.
		System.out.println("Reverse Order: " + re);
		
		/*
		 * Create an ArrayList to Store Max value from the list of Map above.
		 * */
		List<Integer> max = new ArrayList<>();
		for(Integer i : re.keySet()) {
			// Get first Two Elements. List has been sorted in Reverse Order. 
			max.add(re.get(i).get(0) + re.get(i).get(1));
		}
		
		// Sort the list of Max Value in Reverse Order to get the Max value in Index 0
		max = max.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		
		
		/*
		 * Print the Max Value.
		 * if there is no valid value then print -1.
		 * */
		System.out.println("Result: " + ((max.size() > 0) ? max.get(0) : -1));
		
		return ((max.size() > 0) ? max.get(0) : -1);
	}
}