package org.java8.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Jaya");
		names.add("Sindhu");
		names.add("Akshatha");
		names.add("Sreedevi");
		names.add("Lavanya");
		System.out.println("Name List:       "+names);
		//print names
		for(String name:names) {
			System.out.println("Name is:  "+name);
		}
		
		//sort names using lambda
		Collections.sort(names);
		for(String name:names) {
			System.out.println("Name after sorting is:  "+name);
		}

	}
}
