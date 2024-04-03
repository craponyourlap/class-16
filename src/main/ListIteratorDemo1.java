package main;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(523);
		list.add(64);
		list.add(59);
		ListIterator here = list.listIterator();
//		System.out.println(here.next());
		System.out.println(here.previousIndex());
		System.out.println(here.nextIndex());
		here.add(10);//shit will get added in the position before the element that is going to be returned by .next method
		System.out.println(here.nextIndex());
		here.next();
		System.out.println(here.nextIndex());
		here.next();
		System.out.println(here.nextIndex());
		here.next();
		System.out.println(here.nextIndex());
		here.next();
		System.out.println(here.nextIndex());
		
	}

}
