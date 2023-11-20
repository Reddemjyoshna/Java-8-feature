package com.codes;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class FindOutEvenNumber {
	public static void main(String args[]) {
	      List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
	            list.stream()
	                .filter(n -> n%2 == 0)
	                .forEach(System.out::println);

}
}