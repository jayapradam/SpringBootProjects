package org.jpj.java9;

public interface Java9FeaturesDemo {
	default void greet() {
		System.out.println("Hi there....");
	}
	
	default void formatReport(String reportType) {
		if(reportType.equals("PDF")) {
			formatReportAsPDF();
		}
		else if(reportType.equalsIgnoreCase("Excel")) {
			formatReportAsExcel();
		}
		else if(reportType.equalsIgnoreCase("CSV")) {
			formatReportAsCSV();
		}
	}
	private void formatReportAsPDF() {
		System.out.println("Report generated as PDF...");
	}
	private void formatReportAsExcel() {
		System.out.println("Report generated as excel...");
	}

	private void formatReportAsCSV() {
		System.out.println("Report generated as csv..");
	}

}
