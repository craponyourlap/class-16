package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		List<Double> list2 = new ArrayList<>();
		Set<Integer> set1 = new HashSet<>();
		Set<Double> set2 = new TreeSet<>();
		
		//arraylist fill 10 integers 1 - 10
		for (int i = 0; i < 10; i++) {
			list1.add(((int) (Math.random() * 10) + 10));
		}
		
		//linkedlist fill 10 doubles 0 - .99
		for (int i = 0; i < 10; i++) {
			list2.add((int)(Math.random() * 100)/100.0);
		}
		
		//hashset fill 10 (as long as there are no duplicates) integers 1 - 10
		for (int i = 0; i < 10; i++) {
			set1.add((int) (Math.random()*10) + 10);
		}
		//treeset fill 10 (as long as there are no duplicates) doubles 0 - .99
		for (int i = 0; i < 10; i++) {
			set2.add((int)(Math.random() * 100)/100.0);
		}		
		
		//calling a shit ton of iterators
		Iterator<Integer> here1 = list1.iterator();	//arraylist iterator
		Iterator<Double> here2 = list2.iterator();	//linkedlist iterator
		Iterator<Integer> here3 = set1.iterator();	//hashset iterator
		Iterator<Double> here4 = set2.iterator();	//treeset iterator
		
		System.out.println("arraylist: ");
		while(here1.hasNext()) {
			System.out.print(here1.next()+", ");
		}
		
		System.out.println("\r\nlinkedlist: ");
		while(here2.hasNext()) {
			System.out.print(here2.next()+", ");
		}
		
		System.out.println("\r\nhashset: ");
		while(here3.hasNext()) {
			System.out.print(here3.next()+", ");
		}
		System.out.println("\r\ntreeset: ");
		while(here4.hasNext()) {
			System.out.print(here4.next()+", ");
		}
	}

}
