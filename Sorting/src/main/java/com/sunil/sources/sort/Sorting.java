package com.sunil.sources.sort;

import java.util.Comparator;

import com.sunil.sources.entities.Person;

public class Sorting implements Comparator<Person>{
	private String sortColumn;
	private String sortOrder;
	public Sorting() {
		this.sortOrder = "asc";
		this.sortColumn = "name";
	}
	
	public Sorting(String sortColumn, String sortOrder){
		this.sortOrder = sortOrder;
		this.sortColumn = sortColumn;
	}

	public String getSortColumn() {
		return sortColumn;
	}

	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Override
	public int compare(Person p1, Person p2) {
		int result = 0;
		if(sortOrder.equalsIgnoreCase("asc")) {
			result = comparePerson(p1,p2);
		} else {
			result = comparePerson(p2,p1);
		}
		return result;
	}

	private int comparePerson(Person p1, Person p2) {
		int result = 0;
		if(this.sortColumn.equalsIgnoreCase("name")) {
			result = p1.getName().compareTo(p2.getName());
		} else if(this.sortColumn.equalsIgnoreCase("age")){
			result = p1.getAge().compareTo(p2.getAge());
		}
		return result;
	}
}
