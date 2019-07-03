package lambdaProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Lambda {

	public static void main(String[] args) {
		
	}

	public static void question1() {
		
		String[] studentNames = { "Mike", "Ferhat", "Ellis", "Chad", "Allen", "Eli", "Mohammedou" };

		System.out.println("Shortest to longest: ");
		Arrays.sort(studentNames, (s1, s2) -> s1.length() - s2.length());
		Arrays.asList(studentNames).forEach(System.out::println);

		System.out.println("\nLongest to shortest: ");
		Arrays.sort(studentNames, (s1, s2) -> (s2.length() - s1.length()));
		Arrays.asList(studentNames).forEach(System.out::println);

		System.out.println("\nAlphabetically by the first character only: ");
		Arrays.sort(studentNames, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		Arrays.asList(studentNames).forEach(System.out::println);

		System.out.println("sorted if has e in name");
		Arrays.stream(studentNames).sorted((s1, s2) -> {
			if (s1.toLowerCase().contains("e")) {
				return -1;
			} else {
				return 1;
			}
		})
		.forEach(System.out::println); // finish
		
		
		System.out.println("assisted with static");
		// fill in this one
	}
	
	public static int question1HelperMethod (String s1, String s2) {
		if ( s1.toLowerCase().contains("e")) {
			return -1;
		}
		else {
			return 1;
		}
	}
		
		
		
		public static void question2() {
			
			List<Integer> intList = new ArrayList<Integer>();
			intList.add(10);
			intList.add(20);
			intList.add(15);
			intList.add(25);
			intList.add(1);
			
			var csv = intList.stream()
					.map((num) -> num % 2  == 0 ? "e" + num : "o" + num)
					.collect(Collectors.joining(","));
			
			System.out.println(csv);
			
		}
		
		
		public static void question3() {
			
			List<String> strList = new ArrayList<String>();
			strList.add("mike");
			strList.add("allen");
			strList.add("eli");
			strList.add("ellis");
			strList.add("chad");
			strList.add("ferhat");
			strList.add("mohammedou");
			
			strList.stream().filter((str) -> str.toLowerCase().startsWith("a") && str.length() == 3)
				.collect(Collectors.toList()).forEach(System.out::println);
			
		}
	
}		
