package BuiltInFunctionalInterfaces;

import java.util.*;
import java.util.function.Predicate;

class Example {
	public static void main(String args[]) {
		// create a list of strings
		List<String> names = Arrays.asList("Kiran", "Manohar", "Qa", "Test", "Manu");

		// declare string type predicate and use lambda expression to create object
		Predicate<String> p = (s) -> s.startsWith("M");

		System.out.println("Names starting with M:");
		// Iterate through the list
		for (String st : names) {
			// test each entry with predicate
			if (p.test(st))
				System.out.println(st);
		}
	}
}