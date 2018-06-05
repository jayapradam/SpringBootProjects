package org.jpj.java9;

import java.util.StringJoiner;

public class GenerateReport implements Java9FeaturesDemo {

	public static void main(String[] args) {

		GenerateReport generateReport = new GenerateReport();
		generateReport.greet();
		generateReport.formatReport("PDF");
		generateReport.formatReport("Excel");
		generateReport.formatReport("CSV");
		//String joining example
		
		generateReport.joinString();
		//System.out.println("After joining........");
		

	}
	public void joinString() {
		StringJoiner stringJoiner = new StringJoiner("prada");
		stringJoiner.add("Jaya");
		stringJoiner.merge(stringJoiner);
		System.out.println("After joining two strings....... "+stringJoiner+" \nlength is:: "+stringJoiner.length());
	}

}
