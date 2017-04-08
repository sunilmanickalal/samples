package com.sunil.sources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sunil.sources.entities.Person;
import com.sunil.sources.sort.Sorting;

public class App {

	public static void main(String[] args) {
		List<Person> plist = loadPersonObjects();
		System.out.println("Before Sorting");
		displayPersonData(plist);
		Collections.sort(plist, new Sorting("name", "asc"));
		System.out.println("After Sorting");
		displayPersonData(plist);
	}

	private static void displayPersonData(List<Person> plist) {
		System.out.println("===================");
		for(Person p: plist){
			System.out.println("name: " + p.getName());
			System.out.println("age: " + p.getAge());
		}
		System.out.println("===================");
	}

	private static List<Person> loadPersonObjects() {
		List<Person> plist = new ArrayList<Person>();
		Person p1 = new Person("abba",20);
		plist.add(p1);
		Person p2 = new Person("tintin",17);
		plist.add(p2);
		Person p3 = new Person("captain",40);
		plist.add(p3);
		Person p4 = new Person("calculus",30);
		plist.add(p4);
		Person p5 = new Person("thompsun",25);
		plist.add(p5);
		Person p6 = new Person("herge",50);
		plist.add(p6);
		return plist;
	}

}
