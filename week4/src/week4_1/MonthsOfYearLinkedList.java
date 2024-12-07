package week4_1;

import java.util.LinkedList;

public class MonthsOfYearLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> months = new LinkedList<String>();
		months.add("Jan");
		months.add("Feb");
		months.add("Mar");
		months.add("Apr");
		months.add("May");
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		months.add("Sep");
		months.add("Oct");
		months.add("Nov");
		months.add("Dec");
		System.out.println("Months of the Year are: ");
		for (String s:months) {
			System.out.print(s+" ");
		}
	}
}
