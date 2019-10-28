package com.java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;

public class MinMaxSumAvg_IntSummaryStatistics {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(new Integer[] {2,4,6,5,7,3,1});
		IntSummaryStatistics intSummaryStatistics=list.stream().mapToInt(i -> i).summaryStatistics();
		
		int sum = (int)list.stream().mapToInt(i -> i).summaryStatistics().getSum();
		System.out.println(sum);
		OptionalInt sum1 = list.stream().mapToInt(i -> i).max();
		System.out.println(sum1);
	}
}
