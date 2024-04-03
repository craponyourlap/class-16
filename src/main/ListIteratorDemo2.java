package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(523);
		list.add(64);
		list.add(59);
		System.out.println("elements of the array displayed from end to start");
		for(ListIterator<Integer> i = list.listIterator(list.size()); i.hasPrevious(); ) {
			System.out.println(i.previous());
		}
	}

}
