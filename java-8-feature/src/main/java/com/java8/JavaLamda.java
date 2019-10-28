package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaLamda {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] { "sandip", "Bandana", "khushi", "lara", "Siddheswar" });
		List<String> newList = getFilteredList(list, "Siddheswar");
		System.out.println(newList);

		// Using Java8 Filter
		//@formatter:on
		List<String> newListJava8 = list.stream()
										.filter(i -> !"Siddheswar".equals(i))
										.collect(Collectors.toList());
		System.out.println(newListJava8);

	}

	private static List<String> getFilteredList(List<String> list, String string) {
		List<String> newList = new ArrayList<>();
		for (String stringT : list) {
			if (!stringT.equalsIgnoreCase(string)) {
				newList.add(stringT);
			}
		}
		return newList;
	}

}
